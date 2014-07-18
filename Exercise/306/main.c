/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 19일 01시 17분 58초
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

void itoa(int n, char s[])
{
  int i, sign;
  if ((sign = n) < 0) /*  record sign */
    n = -n; /*  make n positive */

  i = 0;
  do { /*  generate digits in reverse order */
    s[i++] = n % 10 + '0'; /*  get next digit */
  } while ((n /= 10) > 0); /*  delete it */

  if (sign < 0)
    s[i++] = '-';

  s[i] = '\0';
  reverse(s);
}

int main(int argc, char* argv[])
{

  return 0;
}

