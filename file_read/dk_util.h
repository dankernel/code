/*
 * =====================================================================================
 *
 *       Filename:  dk_util.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 19일 22시 26분 43초
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

/*
 * print intger to binary
 * @num : intger number
 */
void bin_print_32(int num)
{
  int i = 32;
  while (i--) {
    printf("%d", (num>>i) & 1);
  }

  printf("\n");
}




