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

char *itob(char *ret, int num, int b)
{
  int i = 0, j = 0;
  int tmp;
  int unit = 0;
  int len = 0;
  char *ret_tmp = NULL;

  if (!ret || b <= 0)
    return NULL;

  if (!(b == 2 || b == 4 || b == 8 || b == 16))
    return NULL;

  //get unit..//
  while (b >>= 1)
    unit++;
  printf("unit : %d \n", unit);

  //getindex..//
  len = 32 / unit;
  i = len - 1;
  ret_tmp = malloc(sizeof(char) * len);

  while (0 <= i) {
    tmp = (num >> unit * i) & ((1<<unit) - 1);
    printf("i : %d / tmp : %d \n", i, tmp);

    if (tmp <= 9)
      tmp += '0';
    else
      tmp = 'A' + (tmp - 10);

    *(ret_tmp + len - i - 1) = tmp;

    printf("loop\n");
    i--;
  }

  printf("ret : %s \n", ret_tmp);
  return ret_tmp;
}

int main(int argc, char* argv[]) {

  char ret[32];
  itob(ret, 255, 16);

  return 0;
}

