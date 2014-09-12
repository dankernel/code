/*
 * =====================================================================================
 *
 *       Filename:  dk_str.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 12일 19시 30분 28초
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
#include "errno.h"

int str_contain(char *str, char c)
{ 
  int i = 0;

  if (!str)
    return -EARG_NULL;

  while (*(str + i) != EOF) {
    if (*(str + i) == c) 
      return 1; 
    i++;
  }
  return 0;

}
