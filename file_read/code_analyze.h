/*
 * =====================================================================================
 *
 *       Filename:  code_analyze.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 19일 01시 59분 39초
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
#include <string.h>
#include <fcntl.h>

/*
 * count tabs
 */
inline int count_tab(char *str)
{/*{{{*/
  int ret = 0;

  if (!str)
    return 0;

  while (*(str + ret) == '\t')
    ret++;

  return ret;
}/*}}}*/

/* TODO : working */
int is_comment(char *str)
{/*{{{*/
  int ret = 0;

  /* TODO : WORKING */

  return ret;
}/*}}}*/


