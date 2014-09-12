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

/*
 * make new node
 * @val : node contain
 * return : new node
 */
struct dk_lnode *init_lnode(void *val)
{
  /* allocation new node */
  struct dk_lnode *nn = NULL;
  nn = malloc(sizeof(struct dk_lnode));

  /* init */
  nn->p = val;
  nn->next = NULL;
  nn->prev = NULL;

  return nn;
}

/*
 * make new list
 * return : new list
 */
struct dk_list *init_list(void)
{
  /* allocation */
  struct dk_list *nl = NULL;
  nl = malloc(sizeof(struct dk_list));

  /* init first node, new node = head = tail */
  nl->head = init_lnode("INIT");
  nl->tail = nl->head;
  nl->count = 1;

  return nl;
}

struct dk_lnode *add_lnode(struct dk_list *list, void *p)
{
  struct dk_lnode *new_node = NULL;

  if (!list)
    return NULL;

  /* mknode and ... TODO : link */
  new_node = init_lnode(p);
  new_node->prev = list->tail;

  /* list.. */
  list->tail = new_node;

  return new_node;
}

int print_list(struct dk_list *list)
{
  int ret = 0;

  return ret;
}
