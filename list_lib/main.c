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

#include "dkh/dk_list.h"

struct test {
  int num;
  char ch[64];
};

int main(int argc, char* argv[])
{

  struct dk_list *list = init_list();

  /* TEST */
  add_lnode(list, "node0");
  add_lnode(list, "node1");
  add_lnode(list, "node2");
  add_lnode(list, "node3");

  /* print count */
  printf("count : %d \n", list->count);
  print_list(list);
  
  //print_node(next_lnode(list));
  //print_node(next_lnode(list));

  return 0;
}

