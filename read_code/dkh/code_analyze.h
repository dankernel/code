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

char *list_str(struct dk_list *list, char *str)
{
  struct dk_lnode *tmp = NULL;


  printf("STR : %s\n", str);
  while (tmp = next_lnode(list)) {

    // if (strstr((char *)tmp->p, str))
    //   printf("list str ok : %s : %s \n", tmp->p, str);
  }

  return NULL;
}
