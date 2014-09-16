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

#include "dkh/code_analyze.h"

int main(int argc, char* argv[])
{
  int fd = -1;
  int ret = 0;
  char *buf = NULL;
  char *file = NULL;

  /* init list and add key word */
  struct dk_list *list = init_list();
  add_lnode(list, "fs");
  /* add_lnode(list, "for"); */
  /* add_lnode(list, "while"); */
  print_list(list);

  /* file list : alloc and init struct */
  struct file_info *file_list = NULL;
  file_list = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file_list, "./test/kernel/file.list");

  file = read_split(file_list, '\n');

  struct file_info *tmp_file = NULL;
  while (file) {

    printf("file : %s \n", file);

    /* tmp file : alloc and init struct */
    tmp_file = (struct file_info*)malloc(sizeof(struct file_info));
    init_file_struct(tmp_file, file);

    /* CORE */
    buf = read_split(tmp_file, '\n');
    while (buf) {

      char *tmp = NULL;
      if ((tmp = list_str(list, buf)))
        printf("%s \n", tmp);

      /*
       * SOME CODE ...
       */

      // next //
      free(buf);
      buf = read_split(tmp_file, '\n');
    }

    close_file(tmp_file);
    free(tmp_file->path);
    free(tmp_file->buf);
    free(tmp_file);

    // next //
    free(file);
    file = read_split(file_list, '\n');

  }

  return 0;
}
