/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 15일 12시 24분 55초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>

#define MAX 100

char *itob(char *ret, int num, int b)
{
  int i = 0, j = 0;
  char *ret_tmp = NULL;
  ret_tmp = malloc(sizeof(char) * MAX);

  if (!ret || b <= 0)
    return NULL;



  return ret;
}

int main(int argc, char* argv[]) {

  char ret[MAX];
  itob(ret, 100, 2);

  return 0;
}

