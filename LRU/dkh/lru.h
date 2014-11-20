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

struct workload *_read_workload(struct file_info *f, char tok, int c)
{
  return NULL;
}

int read_workload(struct workload *wl, struct file_info *f, char tok, int c)
{
  int len = 0;
  char *buf = f->buf;
  char *start = 0;
  int rollback = 0;

  if (!wl || !f || c < 0)
    return EARG_NULL;

  if (*f->buf == '\0') {
    next_buff_read(f);
  }

  rollback = f->buf_size - f->seek;

  while (c--) {

    start = buf + f->seek;
    len = 0;
    while (*(start + len) != tok && *(start + len) != '\n')
      len++;

    if (*(start + len + 1) == '\0')
      goto re_read;

    switch (c) {
      case 6: wl->time = strndup(start, len); break;
      // case 5: wl->host = strndup(start, len); break;
      // case 4: wl->disk_num = atoi(strndup(start, len)); break;
      // case 3: wl->type = atoi(strndup(start, len)); break;
      // case 2: wl->offset = atol(strndup(start, len)); break;
      // case 1: wl->size = atol(strndup(start, len)); break;
      // case 0: wl->respone = atol(strndup(start, len)); break;
    }
    f->seek = f->seek + len + 1;
  }

end:
  return 0;

re_read:
  printf("ERR! EOF!\n");
  printf("OLD : %s \n", strndup(f->buf + f->buf_size - 20, 20));

  if (next_buff_read_seek(f, rollback) < 0) 
    return -1;

  printf("NEW : %s \n", strndup(f->buf, 90));

  return 1;

}

int lru_main(char *path)
{
  struct file_info *file = NULL;
  struct dk_list *list = init_list();
  struct workload *wl = NULL;

  int ret = 0;

  if (!path)
    return EARG_NULL;

  /* Init file */
  file = (struct file_info*)malloc(sizeof(struct file_info));
  wl = malloc(sizeof(struct workload));

  /* Init list */
  init_file_struct(file, path);

  /* Read file */
  while (0 <= (ret = read_workload(wl, file, ',', 7))) {

    /* Add list */
    // add_lnode(list, wl);

    printf("%s, %d / %d . %d \n", wl->time, file->seek, file->buf_size, file->buf_read);

  }

  /* Print */
  print_list(list);

  return 0;

}
 
