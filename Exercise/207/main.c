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

  tmp_bit = ((1<<bitn) - 1) << bitp;
  printf("%d \n", tmp_bit);
}

int main(int argc, char* argv[]) {

  invert(31, 3, 2);



  return 0;
}
