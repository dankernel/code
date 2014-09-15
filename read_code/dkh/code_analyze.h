/*
 * =====================================================================================
 *
 *       Filename:  code_analyze.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 16일 05시 52분 36초
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

#include "file_read.h"
#include "print_msg.h"
#include "dk_str.h"
#include "dk_list.h"

char *list_str(struct dk_list *list, const char *str)
{
  struct dk_lnode *tmp = NULL;
  char *s = NULL;
  char *ret = 0;

  if ((!str) || (strlen(str) < 3))
    return NULL;

  printf("str : %s[%d]\n", str, strlen(str));
  while (tmp = next_lnode(list)) {
    
    s = (char *)tmp->p;
    printf("strstr : %s : %s : \n", s, str);
    if ((ret = strstr(s, str))) {
      printf("list str ok : %s : %s : \n", s, str);

      if(ret) {
        printf("ret : %p \n", ret);
        printf("ret : %s \n", *ret);
      }

      printf("1\n");
      break;
    } else {

      if(ret) {
        printf("ret : %p \n", ret);
        printf("ret : %s \n", *ret);
      }
      printf("2\n");
    }
  }

  return NULL;
}
