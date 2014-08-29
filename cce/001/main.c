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
  float f;
  double d;

  f = 6.7;
  d = 3.1;

  printf("%lf \n", f);
  printf("%f \n", f);
  printf("%d \n", f);

  printf("%lf \n", d);
  printf("%f \n", d);
  printf("%d \n", d);

  return 0;
}

