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

  printf("2 : %s \n", tmp);

  return tmp;

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

  printf("1 : %s \n", ret_tmp);
  ret_tmp = str_swap(ret_tmp);

  return ret_tmp;;
}

int main(int argc, char* argv[]) {

  char ret[MAX];
  itob(ret, 1024, 2);
  printf("%s\n", ret);

  return 0;
}

