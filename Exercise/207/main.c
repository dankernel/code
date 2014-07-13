/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 13일 16시 57분 29초
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

int invert(int num, int bitp, int bitn)
{
  int tmp_bit = 0;

  //get bit ..//
  tmp_bit = ~num & (((1<<bitn) - 1) << bitp-bitn);
  printf("bit : %d \n", tmp_bit);
  print_bin(tmp_bit);

  //set 0 ..//
  num = num & ~(((1<<bitn) - 1) << bitp-bitn);
  printf("num : %d \n", num);
  print_bin(num);

  num = num & tmp_bit;
  printf("num : %d \n", num);

}

void print_bin(unsigned int num)
{
  int i = 32;
  while (0 <= i)
    printf("%d", (num>>i--) & 1);
  printf("\n\n");
}

int main(int argc, char* argv[]) {

  invert(21, 3, 2);



  return 0;
}
