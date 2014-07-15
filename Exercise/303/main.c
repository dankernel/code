/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 15일 11시 38분 26초
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

char *_expand(char start, char end)
{
  int i, j = 0;
  char *ret = NULL;
  ret = malloc(sizeof(char) * MAX);

  for (i=start; i<=end; i++)
    *(ret + j++) = i;
  
  return ret;
}

char *expand(char *str1, char *str2)
{
  int i = 0, j = 0;
  int len = 0;
  char *ret = NULL;
  char *tmp;
  char start, end;

  if (!str1 || !str2)
    return NULL;

  while (*(str1 + i)){
  
    tmp = (str1 + i);
    if (*tmp == '-'){
      start = *(tmp - 1);
      end = *(tmp + 1);

      ret = _expand(start, end);
      len = strlen(ret);
      memcpy(str2 + j, ret, len);
      j += len;
    } else {
      start = '\0';
      end = '\0';
    }
    
    //next..//
    i++;
  }
  
  return str2;
}

int main(int argc, char* argv[]) {

  char str1[MAX] = "A-Z09";
  char str2[MAX] = {'\0', };
  char *ret = NULL;

  ret = expand(str1, str2);
  printf("%s\n", ret);

  return 0;
}

