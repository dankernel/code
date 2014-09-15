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

struct test {
  int num;
  char ch[5];
};

int main(int argc, char* argv[])
{

  struct dk_list *list = init_list();

  /* Test struct */
  struct test *t = malloc(sizeof(struct test));
  t->num = 10;
  strcpy(t->ch, "dkdk");

  /* TEST */
  struct dk_lnode *tmp = NULL;
  tmp = add_lnode(list, "NEW");
  tmp = add_lnode(list, "node1");
  tmp = add_lnode(list, "node2");
  tmp = add_lnode(list, t);
  tmp = add_lnode(list, "node3");

  /* ... */
  struct test *list_node = NULL;
  list_node = (struct test*)tmp->p;
  printf("%s\n", list_node->ch);

  /* print count */
  printf("count : %d \n", list->count);

  print_list(list);

  return 0;
}

