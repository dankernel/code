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

/* 
 * tmp func
 */
void print_bin(unsigned int num)
{/*{{{*/
  int i = 31;
  while (0 <= i)
    printf("%d", (num>>i--) & 1);
  printf("\n");
}/*}}}*/

int setbit(int x, int p, int n, int y)
{
  int ret = 0;
  int bit = 0;

  //get  bit..//
  printf("bit \n");
  print_bin(y);
  bit = y & (1<<n - 1);
  print_bin(bit);

  //set 0bit ..//
  printf("x \n");
  print_bin(x);
  x &= ~( ((1<<p) - 1) << n);
  print_bin(x);

  ///or ..//
  x |= (bit << (n-p+1));
  printf("%d \n", x);

  return ret;

}

int main(int argc, char* argv[]) {

  print_bin(33); 

  //setbit(a, b, c, d);
  //b부터 c개 => d의 0부터 c개..//
  setbit(28, 3, 2, 14);

  return 0;
}

