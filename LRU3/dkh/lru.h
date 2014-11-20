/*
 * =====================================================================================
 *
 *       Filename:  lru.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 10월 26일 03시 43분 37초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:  Jun-hyung Park 
 *   organization:  Dankook UNIV.
 *
 * =====================================================================================
 */

// #include "dk_list.h"
#include "hash.h"
#include <math.h>

/* READ WRITE FLAGS */
#define READ  1
#define WRITE 2

/* SIZE */
#define KB (1024)
#define MB (KB * KB)
#define GB (MB * KB)

/* CONFIG */
#define CACHE_BLOCK_SIZE (4 * KB)
#define CACHE_SIZE (1 * GB)
#define CACHE_LEN (CACHE_SIZE/ CACHE_BLOCK_SIZE)

#define DEBUG_OPTION 0

struct workload
{/*{{{*/
  char *time;
  char *host;
  int disk_num;
  int type;
  double offset;
  double size;
  long respone; //respones time

};/*}}}*/

struct cache_line
{/*{{{*/
  long line;
  struct list_head head;
};/*}}}*/

struct cache_mem
{/*{{{*/
  struct list_head *list;
  long size;
  long max;

  long read;
  long write;
  long hit;
};/*}}}*/

/*
 * Init cache memory.
 * @m : cache size (max list size)
 * return : cache_mem strcut pointer
 */
struct cache_mem *init_cache_mem(long m)
{/*{{{*/
  struct cache_mem *cm = NULL;

  if (!(cm = malloc(sizeof(struct cache_mem))))
    return NULL;

  cm->list = malloc(sizeof(struct list_head));
  cm->list = init_lnode();

  if (!cm->list)
    return NULL;

  /* Init */
  cm->size = 0;
  cm->max = m;
  cm->read = 0;
  cm->write = 0;
  cm->hit = 0;

  return cm;
}/*}}}*/

/* 
 * Report result. 
 * @cm : cache memory struct
 */
void report_cm(struct cache_mem *cm)
{/*{{{*/
  printf("========== report ==========\n");
  printf("List (%10ld/%10ld)\n", cm->size, cm->max);
  printf("Read (%10ld/%10ld)\n", cm->hit, cm->read);
  printf("Write(%10ld/%10ld)\n", cm->write, cm->write);
  printf("========== report ==========\n");
}/*}}}*/

/*
 * Print cache memory.(cache list)
 * @cm : cache memory struct
 * return : error code
 */
int print_cm(struct cache_mem *cm)
{/*{{{*/
  int i = 0;

  struct list_head *tmp = NULL;
  struct cache_line *l = NULL;

  if (!cm)
    return -1;

  if (!DEBUG_OPTION)
    return -2;

  tmp = cm->list;
  if (!tmp)
    return -3;

  // printf("root node : %p \n", tmp);
  // printf("root node : %p \n", tmp->next);

  /* Print list node */
  printf("==========\n");
  while (i < cm->size) {
    tmp = tmp->next;
    l = container_of(tmp, struct cache_line, head);

    printf("LIST : %10d %10ld \n", i, l->line);
    i++;
  }

  return 0;
}/*}}}*/

/*
 * Lookup cache line. TODO : 점유율 너무 높음. 개선 필요.
 * @cm : cache memory struct
 * @line : page number
 * return : lookup result(line) or NULL
 */
static inline struct cache_line *LRU_lookup(struct cache_mem *cm, long line)
{/*{{{*/
  int i = 0;
  int max = 0;

  struct list_head *tmp = NULL;
  struct cache_line *l = NULL;

  if (!cm)
    return NULL;

  tmp = cm->list;
  if (!tmp)
    return NULL;

  max = cm->size;
  while (i < max) {
    tmp = tmp->next;
    l = container_of(tmp, struct cache_line, head);

    if (l->line == line) { 
      // printf("3 LOOKUP!!! %ld \n", line);
      return l;
    }
    i++;
  }

  return NULL;
}/*}}}*/

/*
 * Read cache(LUR).
 * @cm : cache memory strcut
 * @line : read memory line
 * return : errer code
 */
int LRU_read(struct cache_mem *cm, double line)
{/*{{{*/
  struct cache_line *l = NULL;

  if (!cm || line < 0)
    return -1;

  cm->read++;
  l = LRU_lookup(cm, line);

  if (!l) {
    // MISS
    return 0;
  } else {
    // HIT
      

    cm->hit++;
    printf("HIT!! %d \n", l->line);
    return 1;
  }

}/*}}}*/


/*
 * Write cache(LRU).
 * @cm : cache memory strcut
 * @line : write memort line
 * retrun : error code
 */
int LRU_write(struct cache_mem *cm, double line)
{/*{{{*/
  struct cache_line *new = NULL;
  struct cache_line *lookup = NULL;

  if (!cm)
    return -1;

  /* make new line node */
  new = malloc(sizeof(struct cache_line));
  new->line = line;
  // printf("add line : %d\n", new->line);

  lookup = LRU_lookup(cm, line);
  if (lookup) {
    /* Write Hit.. swap node */

    // print_cm(cm);
    // printf("v lookup : %d \n", lookup->line);
    list_move(&lookup->head, cm->list);
    print_cm(cm);

    free(new);
    return 1;
  } else {
    /* Write Miss.. */

    // print_cm(cm);
    // printf("%p %p\n", cm->list->next, &new->head);
    if (cm->max > cm->size) {
      /* Not full cache. (=Do just add node) */
      list_add(&new->head, cm->list);
      cm->size++;

      print_cm(cm);
      return 0;

    } else  {
      /* full cache. (=Using LRU) */
      list_add(&new->head, cm->list);

      lookup = container_of(cm->list->prev, struct cache_line, head);
      // printf("v del : %d \n", lookup->line);
      list_del(cm->list->prev);

      print_cm(cm);

      free(lookup);
      return 2;
    }

  }

}/*}}}*/

/*
 * print workload struct.
 * @cm : cache memory info strcut
 * @wl : target workload struct
 * return : error code
 */
int run_cache(struct cache_mem *cm, struct workload *wl)
{/*{{{*/
  int i = 0;
  int ret = 0;
  double start = 0;
  double count = 0;

  /* NULL arg */
  if (!cm || !wl) {
    printf("[FAIL] arg NULL, %s \n", __func__);
    return -1;
  }

  /* start sector number and size(count) */
  // printf("1 s : %.2f , c : %.2f \n", wl->offset, wl->size);
  // printf("2 s : %.2f , c : %.2f \n", wl->offset/4096, wl->size/4096);
  start = floor(wl->offset / CACHE_BLOCK_SIZE);
  count = floor(wl->size / CACHE_BLOCK_SIZE);
  // printf("3 s : %14.2f, c : %14.2f \n", start, count);

  /* print */
  // printf("%d %20s %15ld %10.2f %10ld %5.2f\n", wl->type, wl->time, wl->offset, start, wl->size, count);

   do {
     // printf("%d >> %f\n", wl->type, start + i);

     ret = LRU_write(cm, start + i);

     if (wl->type == READ) {
       cm->read++;
       if (ret == 1) {
         printf("HIT!!!!!!!!!!\n");
         cm->hit++;
       }
     } else if (wl->type == WRITE) {
       cm->write++;
     }
     // printf("^ Is ret : %d\n", ret);

     i++;
   } while (count > i);

   return 0;
}/*}}}*/

/*
 * Just open file and return.
 * @file : target file path
 * return : file pointer
 */
FILE *open_workload(char *file)
{/*{{{*/
  FILE *fp = NULL;

  /* NULL arg */
  if (!file) {
    printf("[FAIL] arg NULL, %s \n", __func__);
    return NULL;
  }

  /* open FILE */
  if ((fp = fopen(file, "r")) < 0)
    return NULL;

  return fp;
}/*}}}*/

/*
 * read colum. (=Inscribe workload struct)
 * @wl : workload struct
 * @buf : buffer string
 * return : error code
 */
int read_column(struct workload *wl, char *buf)
{/*{{{*/
  int column = 1;
  char *tmp = NULL;

  /* NULL arg */
  if (!wl || !buf) {
    printf("[FAIL] arg NULL, %s \n", __func__);
    return -1;
  }
  
  /* read file and, save workload struct */
  tmp = strtok(buf, ",");
  while (tmp != NULL) {

    switch (column) {
      /* 
       * TODO : strdup is cause of memory leak
       * But, This case is needless..
       */

      // case 1 : wl->time = strdup(tmp); break;
      // case 2 : wl->host = strdup(tmp); break;
      // case 3 : wl->disk_num = atoi(tmp); break;
      case 4 : (wl->type) = (strcmp(tmp, "Read") == 0) ? READ : WRITE; break;
      case 5 : wl->offset = atol(tmp); break;
      case 6 : wl->size = atol(tmp); break;
      // case 7 : wl->respone = atol(tmp); break;
    }

    /* Next */
    tmp = strtok(NULL, ",");
    column++;
  }

  return 0;
}/*}}}*/

/*
 * read worklosd  and analysis..
 * @wl : workload
 * @fp : file pointer
 * return : error code
 */
int read_workload(struct workload *wl, FILE *fp)
{/*{{{*/
  int ret = 0;

  char buf[100];
  struct cache_mem *cm = NULL;

  /* NULL arg */
  if (!wl || !fp)
    printf("arg is NULL\n");

  cm = init_cache_mem(CACHE_LEN * 4);
  if (!cm)
    goto end;

  /* read line by line */
  while (!feof(fp)){

    /* read line by line. saved buf */
    if (fscanf(fp, "%s", buf) < 0)
      goto end;

    /* read buf and Inscribe wl */
    if (read_column(wl, buf) < 0)
      goto end;

    /* run cache mem  */
    run_cache(cm, wl);
  }

end:
  /* reprot */
  report_cm(cm);

  /* DEBUG.. PRINT LIST */
  if (0) 
    ret = print_cm(cm);

  if (ret < 0)
    printf("Err\n");

  return 0;
}/*}}}*/

