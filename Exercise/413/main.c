/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 25일 23시 06분 04초
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

/*  swap: interchange v[i] and v[j] */
inline void swap(int v[], int i, int j)
{
  int temp;
  temp = v[i];
  v[i] = v[j];
  v[j] = temp;
}

/*  reverse: reverse string s in place */
void reverse(char s[])
{
  int c, i, j;

  if (i = 0, j = strlen(s)-1; i < j; i++, j--) {

    //swap..///
    c = s[i];
    s[i] = s[j];
    s[j] = c;
  }

  reverse(s+1);
} 

int main(int argc, char* argv[])
{
  char str[100] = "I'm_dkdk509";

  printf("%s\n", str);
  reverse(str);
  printf("%s\n", str);

  return 0;
}

