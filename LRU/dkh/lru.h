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
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */

#include "file_read.h"
#include "dk_list.h"
#include "errno.h"

#define READ  1
#define WRITE 2

struct workload
{
  char *time;
  char *host;
  int disk_num;
  int type;
  long offset;
  long size;
  long respone; //respones time
};

struct workload *read_workload(struct file_info *f, char tok, int c)
{
  struct workload *tmp = NULL;
  int len = 0;
  char *buf = f->buf;
  char *start = 0;

  if (!f || c < 0)
    return NULL;

  tmp = malloc(sizeof(struct workload));

  if (!f->buf)
    next_buff_read(f);


  start = buf + f->seek;
  while (*(start + len) != tok)
    len++;

  tmp->time = strndup(start, len);
  printf("start : %s \n", strndup(start, len));

  f->seek = f->seek + len + 1;
  printf("%d\n", f->seek);

  return tmp;
}

int lru_main(char *path)
{
  struct file_info *file = NULL;
  struct dk_list *list = init_list();
  struct workload *wl = NULL;

  if (!path)
    return EARG_NULL;

  /* Init file */
  file = (struct file_info*)malloc(sizeof(struct file_info));

  /* Init list */
  init_file_struct(file, path);

  /* Read file */
  while (wl = read_workload(file, ',', 6)) {

    /* TODO : LRU LOOKUP ... */
    printf("%s\n", wl->time);

    /* Add list */
    add_lnode(list, wl);
    printf("adddd\n");

  }

  /* Print */
  print_list(list);

  return 0;

}
 
