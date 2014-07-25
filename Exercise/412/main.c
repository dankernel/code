/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 25일 21시 35분 43초
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

/*  printd: print n in decimal */
void printd(int n)
{
  if (n < 0) {
    putchar('-');
    n = -n;
  }

  if (n / 10)
    printd(n / 10);

  putchar(n % 10 + '0');
}

int main(int argc, char* argv[])
{
  printd(123);

  return 0;
}

