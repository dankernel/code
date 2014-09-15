/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 12일 19시 47분 12초
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

#include "dk_list.h"

int main(int argc, char* argv[])
{

  struct dk_list *list = init_list();
  printf("count : %d \n", list->count);

  /* TEST */
  struct dk_lnode *tmp = NULL;
  add_lnode(list, "NEW");
  add_lnode(list, "NEW2");

  print_list(list);


  return 0;
}

