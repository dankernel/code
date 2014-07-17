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

char* swap(char *get)
{
  char tmp[MAX];

}

char *itob(char *ret, int num, int b)
{
  int i = 0, j = 0;
  char *ret_tmp = NULL;
  char tmp;
  ret_tmp = malloc(sizeof(char) * MAX);

  if (!ret || b <= 0)
    return NULL;

  while (0 < num) {

    tmp = (num % b);
    if (tmp <= 9)
      tmp += '0';
    else 
      tmp += 'A';
    
    *(ret_tmp + i) = tmp;
    i++;
    num /= b;
    printf(" loop \n");
  }

  printf("%s \n", ret_tmp);

  return ret;
}

int main(int argc, char* argv[]) {

  char ret[MAX];
  itob(ret, 1024, 2);

  return 0;
}

