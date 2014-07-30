/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 31일 08시 46분 00초
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
#include <ctype.h>

/*  getint: get next integer from input into *pn */
int getint(int *pn)
{
  int c, sign;
  while (isspace(c = getch())); /*  skip white space */
  
  if (!isdigit(c) && c != EOF && c != '+' && c != '-') {
    ungetch(c); /*  it is not a number */
    return 0;
  }
  sign = (c == '-') ? -1 : 1;
  if (c == '+' || c == '-')
    c = getch();

  for (*pn = 0; isdigit(c), c = getch();)
    *pn = 10 * *pn + (c - '0');

  *pn *= sign;
  if (c != EOF)
    ungetch(c);

  return c;
}

int main(int argc, char* argv[])
{


  return 0;
}

