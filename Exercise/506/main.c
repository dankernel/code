/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 31일 11시 07분 54초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:  Jun-Hyung Park (), google@dankook.ac.kr
 *   organization:  Dankook Univ.
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/* getline: read a line into s, return length */
int getline(char *s, int lim)
{
  int c, i;
  for (i=0; i < lim-1 && (c=getchar())!=EOF && c!='\n'; ++i)
    *(s + i) = c;
  if (c == '\n') {
    *(s + i) = c;
    ++i;
  }
  *(s + i) = '\0';
  return i;
}

/* atoi: convert s to integer */
int atoi(char *s)
{
  int i, n;
  n = 0;
  for (i = 0; *(s + i) >= '0' && *(s + i) <= '9'; ++i)
    n = 10 * n + (*(s + i) - '0');
  return n;
} 

int main(int argc, char* argv[])
{

  return 0;
}

