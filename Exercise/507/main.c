/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 31일 11시 22분 01초
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

#define MAXLINES 5000 /*  max #lines to be sorted */
#define MAXLEN 1000 
char *lineptr[MAXLINES]; /*  pointers to text lines */  
int _getline(char *, int);
char *alloc(int);

/* readlines: read input lines */
int readlines(char *lineptr[], int maxlines)
{
  int len, nlines;
  char *p, line[MAXLEN];
  nlines = 0;
  while ((len = _getline(line, MAXLEN)) > 0)
    if (nlines >= maxlines || p = alloc(len) == NULL)
      return -1;
    else {
      line[len-1] = '\0'; /*  delete newline */
      strcpy(p, line);
      lineptr[nlines++] = p;
    }
  return nlines;
} 


int main(int argc, char* argv[])
{

  return 0;
}

