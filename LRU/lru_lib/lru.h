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

#include "../dkh/file_read.h"
#include "../dkh/dk_list.h"
#include "../dkh/errno.h"

#define READ  1
#define WRITE 2

struct LRU
{
  char *time;
  char *host;
  int disk_num;
  int type;
  long offset;
  long size;
  long respone; //respones time
};

int lru_read(char *path)
{
  struct file_info *file = NULL;

  struct dk_list *list = init_list();
  struct dk_lnode *node = NULL;

  if (!path)
    return EARG_NULL;

  /* Init file */
  file = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file, path);

  /* Init list */
  node = add_lnode(list, "add");
  print_list(list->head);

  return 0;

}
 
