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

#define BUFSIZE 100
char buf[BUFSIZE]; /*  buffer for ungetch */
int bufp = 0; /*  next free position in buf */ 

int getch(void) /*  get a (possibly pushed-back) character */
{
  return (bufp > 0) ? buf[--bufp] : getchar();
}
void ungetch(int c) /*  push character back on input */
{
  if (bufp >= BUFSIZE)
    printf("ungetch: too many characters\n");
  else
    buf[bufp++] = c;
}

/*  getint: get next integer from input into *pn */
int getint(float *pn)
{
  char c, sign;
  int i = 0;
  int isdot = 0;

  int dot = 0;
  int val = 0;
  int dot_count = 0;
  float result = 0;
  
  while (isspace(c = getch())); /*  skip white space */
  
  if (!isdigit(c) && c != EOF && c != '+' && c != '-' && c != '.') {
    ungetch(c); /*  it is not a number */
    return 0;
  }

  sign = (c == '-') ? -1 : 1;
  if (c == '+' || c == '-')
    c = getch();

  for (*pn = 0; isdigit(c) || c =='.'; c = getch()) {

    if (c == '.')
      isdot = 1;
    else if (isdot) {
      printf("%d \n", (c-'0')*10);
      dot = 10 * dot + (c - '0'); 
      dot_count++;
    } else {
      printf("%d \n", (c-'0')*10);
      val = 10 * val + (c - '0'); 
    }

  }

  printf("result\n");
  printf("%d \n", val);
  printf("%d \n", dot);
  result = (10*dot_count);
  printf("%f\n", result);

  *pn *= sign;
  if (c != EOF)
    ungetch(c);

  return c;
}

int main(int argc, char* argv[])
{

  int ret = 0;
  float *p;

  ret = getint(p);
  printf("%f\n", *p);


  return 0;
}

