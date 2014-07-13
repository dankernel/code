/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 13일 15시 52분 06초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>

int setbit(int x, int p, int n, int y)
{
  int ret = 0;
  int bit = 0;

  bit = y & ( (1<<n-p) - 1 );
  printf("%d \n", bit);

  return ret;

}

int main(int argc, char* argv[]) {

  setbit(1, 1, 2, 10);

  return 0;
}

