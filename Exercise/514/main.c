/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 18일 09시 57분 14초
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

#include <stdio.h>
#include <string.h>
#define MAXLINES 5000 /*  max #lines to be sorted */
char *lineptr[MAXLINES]; /*  pointers to text lines */ 

int readlines(char *lineptr[], int nlines);
void writelines(char *lineptr[], int nlines);
void qsort(void *lineptr[], int left, int right, int (*comp)(void *, void *));
int numcmp(char *, char *);

/*  sort input lines */
int main(int argc, char *argv[])
{
  int nlines; /*  number of input lines read */
  int numeric = 0; /*  1 if numeric sort */
  if (argc > 1 && strcmp(argv[1], "-n") == 0)
    numeric = 1;
  if ((nlines = readlines(lineptr, MAXLINES)) >= 0) {
    qsort((void**) lineptr, 0, nlines-1,
        (int (*)(void*,void*))(numeric ? numcmp : strcmp));
    writelines(lineptr, nlines);
    return 0;
  } else {
    printf("input too big to sort\n");
    return 1;
  }
}

/*  qsort: sort v[left]...v[right] into increasing order */
void qsort(void *v[], int left, int right, int (*comp)(void *, void *))
{
  int i, last;
  void swap(void *v[], int, int);
  
  if (left >= right) /*  do nothing if array contains */
    return; /*  fewer than two elements */
  
  swap(v, left, (left + right)/2);
  last = left;

  for (i = left+1; i <= right; i++)
    if ((*comp)(v[i], v[left]) < 0)
      swap(v, ++last, i);
  
  swap(v, left, last);
  qsort(v, left, last-1, comp);
  qsort(v, last+1, right, comp);
}

int main(int argc, char* argv[])
{

  return 0;
}

