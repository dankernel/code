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
#include <string.h>

#define MAX 100

char *get_bin(unsigned int num)
{
  int i = 32;
  char *tmp = NULL;
  tmp = malloc(sizeof(char) * 32);

  while (0 <= i) {
    *(tmp + (32 - i)) = ((num>>i--) & 1) + '0';
  }

  printf("%s \n", tmp);
  return tmp;
}

char *itob(char *ret, int num, int b)
{
  int i = 0, j = 0;
  int tmp;
  char *ret_tmp = NULL;
  ret_tmp = malloc(sizeof(char) * MAX);

  if (!ret || b <= 0)
    return NULL;

  while (tmp) {
    tmp = num << 4*i;
  }

  return ret_tmp;
}

int main(int argc, char* argv[]) {

  char ret[MAX];
  itob(ret, 255, 16);
  printf("%s\n", ret);

  printf("%s\n", get_bin(-9));

  return 0;
}

