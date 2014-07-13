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

  //get  bit..//
  bit = y & ( (1<<n-p+1) - 1 );
  printf("%d \n", bit);

  x &= ((1<<n-p+1) - 1) << (n-p+1);
  printf("%d \n", x);

  x |= bit;
  printf("%d \n", x);

  return ret;

}

int main(int argc, char* argv[]) {

  setbit(9, 1, 3, 11);

  return 0;
}

