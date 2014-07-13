/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 10일 11시 37분 50초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Jun-Hyung Park, google@dankook.ac.kr
 *   Organization:  Dankook Univ.
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

char* squeeze(char *str1, char str2)
{
  int len1 = strle(str1);
  int len2 = strle(str2);
  int i = 0, j = 0;
  char ret[len2];

  if (!str1 || !str2)
    return NULL;

  while (j < len2) {
    while (*(str1 + i) == *(str2 + j))
      i = ++j;
    memcpy(ret, str2 + j, len1);
    i = 0;
  }

  return ret;
}

int main(int argc, char* argv[]) {

  squeeze("as", "ab1ab2");

  return 0;
}

