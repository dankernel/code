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

char* squeeze(char *str1, char *str2)
{
  int len1 = strlen(str1);
  int len2 = strlen(str2);
  int i = 0, j = 0;
  int tmp = 0;
  char ret[100] = {'\0', };
  int ind = 0;

  if (!str1 || !str2)
    return NULL;

  while (*(str2 + j) != '\0') {

    printf("A : %s \n", str2);
    printf("B : %s \n", str1);
    printf("i : %d \n", i);
    printf("j : %d \n", j);
    while (*(str1 + i) == *(str2 + j)) {
      i++;
      j++;
      printf("loop\n");
    }
    
    if (i == len1) {
      printf("ok \n");
    } else {
      printf("no \n");
      ret[ind++] = *(str2 + j);
      printf("__ret : %s \n", ret);
      j++;
    }

    i = 0;

  }
  printf("ret : %s \n", ret);

  return str2;
}

int main(int argc, char* argv[]) {

  char *ret = NULL;

  ret = squeeze("ab", "ab1ab2ab3a4");
  printf("%s \n", ret);

  return 0;
}

