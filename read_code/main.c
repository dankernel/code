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

//#include "code_analyze.h"
#include "dkh/file_read.h"
#include "dkh/print_msg.h"
#include "dkh/dk_str.h"
#include "dkh/dk_list.h"

int main(int argc, char* argv[])
{
  int fd = -1;
  int ret = 0;
  char *buf = NULL;

  /* list and add key word */
  struct dk_list *list = init_list();
  add_lnode(list, "if");
  add_lnode(list, "for");
  add_lnode(list, "while");
  add_lnode(list, "(");
  add_lnode(list, ")");
  print_list(list);

  /* alloc and init struct */
  struct file_info *dk_file = NULL;
  dk_file = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(dk_file, "./test/core.c");

  /* CORE */
  buf = read_split(dk_file, '\n');
  while (buf) {

    // cheek //
    printf("%s\n", buf);

    /*
     * SOME CODE ...
     * ...
     */

    // next //
    buf = read_split(dk_file, '\n');
  }

  close_file(dk_file);

  return 0;
}
