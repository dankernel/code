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
  int unit = 0;
  char *ret_tmp = NULL;
  ret_tmp = malloc(sizeof(char) * 32);

  if (!ret || b <= 0)
    return NULL;

  if (!(b == 2 || b == 4 || b == 8 || b == 16))
    return NULL;

  //get unit..//
  while (b >>= 1)
    unit++;
  printf("unit : %d \n", unit);

  //getindex..//
  i = (32 / unit);
  printf("i : %d \n", i);

  while (0 <= i) {
    tmp = (num >> unit * i) & ((1<<unit) - 1);
    printf("tmp = %d \n", tmp);

    if (tmp <= 9)
      tmp += '0';
    else
      tmp = 'A' + (tmp - 10) - 1;

    *(ret_tmp + (32/unit - i)) = tmp;

    printf("loop\n");
    i--;
  }

  printf("ret : %s \n", ret_tmp);
  return ret_tmp;
}

int main(int argc, char* argv[]) {

  char ret[MAX];
  itob(ret, 5, 16);

  return 0;
}

