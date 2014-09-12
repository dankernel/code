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
  struct dk_lnode *head;
  struct dk_lnode *tail;


};

struct dk_lnode {
  int *p;
  struct dk_lnode *next;
  struct dk_lnode *prev;
};

struct dk_lnode *init_lnode(void *val)
{
  /* allocation */
  struct dk_lnode *ret = NULL;
  ret = malloc(sizeof(struct dk_lnode));

  /* init */
  ret->p = val;

  return ret;
}

struct dk_list *init_list(void)
{
  /* allocation */
  struct dk_list *ret = NULL;
  ret = malloc(sizeof(struct dk_list));

  /* init */
  ret->head = init_lnode("INIT");
  ret->tail = NULL;
  ret->count = 1;

  return ret;
}

struct dk_lnode *add_lnode(struct dk_list *list, void *p)
{
  struct dk_lnode *lnode = NULL;

  if (!list)
    return NULL;

  lnode = init_lnode(p);
  list->tail = lnode;

  return lnode;
}

int print_list(struct 
