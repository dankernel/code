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

char *str_swap(char *get)
{
  int len = strlen(get);
  int i = 0;
  char *tmp;
  
  if (!get)
    return NULL;

  tmp = malloc(sizeof(char) * (len + 1));

  while (*(get + i)) {
    *(tmp + len - i - 1) = *(get + i);
    i++;
  }

  return tmp;
}

char *itob(char *ret, int num, int b)
{
  int i = 0, j = 0;
  int negative_num = 0;
  char *ret_tmp = NULL;
  char tmp;
  ret_tmp = malloc(sizeof(char) * MAX);

  if (!ret || b <= 0)
    return NULL;

  if (num < 0) {
    negative_num = 1;
    num = -num;
  }

  while (0 < num) {

    tmp = (num % b);
    if (tmp <= 9)
      tmp += '0';
    else 
      tmp = 'A' + (tmp - 10);
    
    *(ret_tmp + (i++)) = tmp;
    num /= b;
  }

  if (negative_num)
    *(ret_tmp + (i++)) = '-';

  ret_tmp = str_swap(ret_tmp);
  strcpy(ret, ret_tmp);

  return ret_tmp;
}

int main(int argc, char* argv[]) {

  char ret[MAX];
  itob(ret, 255, 16);
  printf("%s\n", ret);

  return 0;
}

