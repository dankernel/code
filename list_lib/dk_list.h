/*
 * =====================================================================================
 *
 *       Filename:  dk_list.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 12일 19시 47분 58초
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

struct dk_list {
  int count;
  struct dk_lnode *root;
  struct dk_lnode *curr;
};

struct dk_lnode {
  struct dk_lnode *next;
  struct dk_lnode *prev;
  int *p;
};

struct dk_lnode *init_lnode(void)
{
  /* allocation */
  struct dk_lnode *ret = NULL;
  ret = malloc(sizeof(struct dk_lnode));

  /* init */
  ret->p = NULL;

  return ret;
}

struct dk_list *init_list(void)
{
  /* allocation */
  struct dk_list *ret = NULL;
  ret = malloc(sizeof(struct dk_list));

  /* init */
  ret->root = 
  ret->count = 0;

  return ret;
}
