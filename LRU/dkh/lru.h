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

    /* Add list */
    add_lnode(list, wl);

  }

  /* Print */
  print_list(list);

  return 0;

}
 
