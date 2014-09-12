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

  struct dk_list *root = init_list();
  printf("count : %d \n", root->count);

  printf("dkdk \n");


  return 0;
}

