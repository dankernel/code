/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 30일 00시 24분 43초
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
#include <fcntl.h>

int main(int argc, char* argv[])
{
  int num;  /* num */
  char ch;  /* char */
  long ln;  /* len */

  num = 10;
  ch = 'C';
  ln = 3.1;

  printf("%d\n", num);
  printf("%c\n", ch);
  printf("%f\n", ln);

  return 0;
}

