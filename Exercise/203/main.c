/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  Write a function htoi(s), which converts a string of hexadecimal digits
 *
 *        Version:  1.0
 *        Created:  2014년 07월 09일 14시 16분 17초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  YOUR NAME (), 
 *   Organization:  
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>
#include <linits.h>

#define MAX 1024

int htoi(char *get){

  int ret = 0;
  int i = 0;
  int tmp_i
  char tmp_c = '\0';

  if (!get)
    return -1;

  tmp_c = *(get + i);
  while (tmp != EOF) {
    if ('0' <= tmp_c && tmp_c <= '9')
      tmp_i = tmp_c - '0';
    else if ('A' <= tmp_c && tmp_c <= 'Z')
      tmp_i = tmp_c - 'A';
    else if ('a' <= tmp_c && tmp_c <= 'z')
      tmp_i = tmp_c - 'a';
    else
      return -2;

    ret = tmp_i;
    ret <<= 2;

    i++;
    tmp_c = *(get + i);
  }

  if (INT_MAX <= ret)
    return -2;

  return ret;
}

int main(int argc, char* argv[]) {

  char str[MAX];
  fgets(str, MAX, stdin);

  htoi();






  return 0;
}

