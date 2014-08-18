/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 18일 03시 08분 19초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:  Jun-Hyung Park (), google@dankook.ac.kr
 *   organization:  Dankook Univ.
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <fcntl.h>

#include "file_read.h"

/*
 * count tabs
 */
inline int count_tab(char *str)
{/*{{{*/
  int ret = 0;

  if (!str)
    return 0;

  while (*(str + ret) == '\t')
    ret++;

  return ret;
}/*}}}*/

int is_comment(char *str)
{/*{{{*/
  int ret = 0;

  /* TODO : WORKING */

  return ret;
}/*}}}*/

int main(int argc, char* argv[])
{
  int fd = -1;
  int ret = 0;
  char *buf = NULL;

  /* alloc struct */
  struct file_info *dk_file = NULL;
  dk_file = (struct file_info*)malloc(sizeof(struct file_info));

  /* open */
  init_file_struct(dk_file, "./core.c");

  buf = read_split(dk_file, '\n');
  while (buf) {

    /* cheek */
    ret = count_tab(buf);
    if (4 <= ret) {
      printf(" %s \n", buf);
      printf("== info : %d line / %d tab \n", dk_file->line, ret);
    }

    /* next */
    buf = read_split(dk_file, '\n');

  }


  return 0;
}


