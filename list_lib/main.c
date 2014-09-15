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
  char ch[100];
};

int main(int argc, char* argv[])
{

  struct dk_list *list = init_list();
  printf("count : %d \n", list->count);

  /* Test */
  struct test *t = NULL;
  t->num = 10;
  strcpy(t->ch, "dkdk");

  /* TEST */
  struct dk_lnode *tmp = NULL;
  add_lnode(list, "NEW");
  add_lnode(list, t);


  return 0;
}

