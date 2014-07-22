/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  .
 *
 *        Version:  1.0
 *        Created:  2014년 07월 14일 19시 37분 54초
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

int rightrot(int get, int n)
{
  int ret = get >>= n;

  return ret;
}

int main(int argc, char* argv[])
{

  int tmp = 1024;
  int ret = 0;

  ret = rightrot(tmp, 3);
  printf("%d \n", ret);

  return 0;
}

