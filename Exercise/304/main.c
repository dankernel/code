/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 19일 01시 50분 37초
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

/*  reverse: reverse string s in place */
void reverse(char s[])
{
  int c, i, j;

  for (i = 0, j = strlen(s)-1; i < j; i++, j--) {
    c = s[i];
    s[i] = s[j];
    s[j] = c;
  }
} 

void itoa(int n, char s[])
{
  int i, sign;
  if ((sign = n) < 1) /*  record sign */
    n = -n; /*  make n positive */

  i = 0;
  do { /*  generate digits in reverse order */
    s[i++] = n % 10 + '0'; /*  get next digit */
    printf("loop  %d \n", n );
    printf("loop  %d \n", n%10 );
  } while ((n /= 10) > 0); /*  delete it */

  if (sign < 0)
    s[i++] = '-';

  s[i] = '\0';
  reverse(s);
}

int main(int argc, char* argv[])
{
  char str[100];

  itoa(0x80000000, str);
  printf("%s\n", str);

  return 0;
}
