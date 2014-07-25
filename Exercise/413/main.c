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
void swap(int v[], int i, int j)
{
  int temp;
  temp = v[i];
  v[i] = v[j];
  v[j] = temp;
} 

int main(int argc, char* argv[])
{

  return 0;
}

