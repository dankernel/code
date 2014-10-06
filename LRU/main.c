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
  /* read_code_file("/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv"); */

  struct dk_list *list = init_list();

  struct dk_lnode *node = NULL;

  add_lnode(list, "11");
  node = add_lnode(list, "22");
  add_lnode(list, "33");
  print_list(list);

  printf("%p\n", node);

  remove_lnode(node);

  print_list(list);
  return 0;
}
