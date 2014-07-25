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
inline void reverse_swap(char v[], int len, int i)
{
  int temp;

  printf("i : %d : %c \n", i , v[i]);

  //swap..//
  temp = v[i];
  v[i] = v[len - i];
  v[len - i] = temp;

  i++;

  if (i <= len/2 + 1)
    reverse_swap(v, len, i);

}

/*  reverse: reverse string s in place */
void reverse(char s[])
{
  int len = strlen(s);

  printf("len : %d  \n", len);

  reverse_swap(s, len, 0);

} 

int main(int argc, char* argv[])
{
  char str[100] = "I'm_dkdk509";

  printf("%s\n", str);
  reverse(str);
  printf("%s\n", str);

  return 0;
}

