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

/* Mutex */
#include <pthread.h>

#include "dkh/code_analyze.h"

int main(int argc, char* argv[])
{
<<<<<<< HEAD
=======
  /* get file line */
>>>>>>> newbranch
  int line = 0;

  /* get line */
  line = get_file_line("./test/file.list");
  printf("line : %d \n", line);

<<<<<<< HEAD
  read_file_code("./test/file.list");
  int fd = -1;
  int ret = 0;
  char *buf = NULL;
  char *file = NULL;

  long count_all = 0;
  long count_con = 0;
  long count_fail = 0;

  /* init list and add key word */
  struct dk_list *list = init_list();
  add_lnode(list, "for");
  print_list(list);

  /* file list : alloc and init struct */
  struct file_info *file_list = NULL;
  file_list = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file_list, "./test/file.list");

  file = read_split(file_list, '\n');

  struct file_info *tmp_file = NULL;
  while (file) {

    /* tmp file : alloc and init struct */
    tmp_file = (struct file_info*)malloc(sizeof(struct file_info));
    init_file_struct(tmp_file, file);

    /* CORE */
    buf = read_split(tmp_file, '\n');
    while (buf) {

      char *tmp = NULL;
      //if (tmp = list_str(list, buf)) {
      if (tmp = cheek_code_line(list, buf, KEYWORD_NEXT_PADDING)) {

        count_con++;

        printf("file : %s \n", file);
        printf("%s \n\n", tmp);

      }
      count_all++;

      buf = read_split(tmp_file, '\n');
    }

    close(tmp_file->fd);

    free(tmp_file->buf);
    free(tmp_file->path);
    free(tmp_file);

    // next //
    file = read_split(file_list, '\n');

  }
  
  /* Result */
  printf("count : %d / %d / %d \n", count_fail, count_con, count_all);
=======
  /* read file, Thus file is file list */
  read_file_code("./test/file.list");
>>>>>>> newbranch

  return 0;
}
