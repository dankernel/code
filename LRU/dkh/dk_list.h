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

#include "errno.h"

struct dk_list 
{/*{{{*/
  int count;
  struct dk_lnode *head;
  struct dk_lnode *tail;

  /* For buffer node */
  struct dk_lnode *r_cache;
  struct dk_lnode *w_cache;
};/*}}}*/

struct dk_lnode
{/*{{{*/
  int *p;
  struct dk_lnode *next;
  struct dk_lnode *prev;
};/*}}}*/

/*
 * make new node
 * @val : node contain
 * return : new node
 */
struct dk_lnode *init_lnode(void *val)
{/*{{{*/
  /* allocation new node */
  struct dk_lnode *nn = NULL;
  nn = malloc(sizeof(struct dk_lnode));

  /* init */
  nn->p = val;
  nn->next = NULL;
  nn->prev = NULL;

  return nn;
}/*}}}*/

/*
 * make new list
 * return : new list
 */
struct dk_list *init_list(void)
{/*{{{*/
  /* allocation */
  struct dk_list *nl = NULL;
  nl = malloc(sizeof(struct dk_list));

  /* init first node, new node = head = tail */
  nl->count = 1;
  nl->head = init_lnode("DKDK_HEAD");
  nl->tail = nl->head;

  /* init buf node */
  nl->r_cache = NULL;
  nl->w_cache = nl->head;

  return nl;
}/*}}}*/

/*  
 * make new node, and linking new node
 * @list : target list
 * @p : new node contain value
 * return : new node
 */
struct dk_lnode *add_lnode(struct dk_list *list, void *p)
{/*{{{*/
  struct dk_lnode *nn = NULL;

  if (!list)
    return NULL;

  /* mknode and link */
  nn = init_lnode(p);
  list->tail->next = nn;
  nn->prev = list->tail;

  /* list tail reset */
  list->tail = nn;

  /* add count */
  list->count++;

  /* cache reset */
  list->w_cache = nn;

  return nn;
}/*}}}*/

/* 
 * get next node of read cache 
 * @list : target list
 * return : next node
 */
struct dk_lnode *next_lnode(struct dk_list *list)
{/*{{{*/
  if (!list)
    return NULL;

  if(!list->r_cache)
    return list->r_cache = list->head;

  return list->r_cache = list->r_cache->next;
}/*}}}*/

/* 
 * print node to form 
 * @n : target node
 */
inline void print_node(struct dk_lnode *n)
{/*{{{*/
  if ((n->prev || n->next) && !strstr((char *)n->p, "\n"))
    printf("list print : %10p (%10p %10s) %10p \n", n->prev, &n->p, n->p, n->next);
  else
    printf("fail\n");
}/*}}}*/

/* 
 * print list. head to tail. only char type 
 * @list : target list struct
 * return : error code
 * */
int print_list(struct dk_list *list)
{/*{{{*/
  int ret = 0;
  struct dk_lnode *root = NULL;
  struct dk_lnode *tmp = NULL;

  if (!list)
    return -EARG_NULL;

  root = list->head;
  tmp = root;

  /* Print loop */
  do {
    if ((tmp->prev || tmp->next) && !strstr((char *)tmp->p, "\n")) {
      print_node(tmp);
    } else
      printf("fail : NULL node or Not string type\n");

  } while (tmp = tmp->next);

  return ret;
}/*}}}*/

/* 
 * remove list. head to tail.
 * @list : target list struct
 * return : error code
 * */
int remove_list(struct dk_list *list)
{
  int ret = 0;
  struct dk_lnode *root = NULL;
  struct dk_lnode *tmp = NULL;
  struct dk_lnode *cur = NULL;

  if (!list)
    return -EARG_NULL;

  root = list->head;
  tmp = root;

  /* Print loop */
  do {
    if ((tmp->prev || tmp->next) && tmp && tmp->p) {
      cur = tmp;
      tmp = tmp->next;
      free(cur);
    } else
      printf("fail : NULL node or Not string type\n");

  } while (tmp);

  return ret;
}/*}}}*/

int remove_lnode(struct dk_lnode *n)
{
  struct dk_lnode *prev = NULL;
  struct dk_lnode *next = NULL;

  if (!n)
    -EARG_NULL;

  prev = n->prev;
  next = n->next;

  prev->next = next;
  next->prev = prev;

  free(n);

  return 0;
}

int swap_list(struct dk_lnode *l1, struct dk_lnode *l2)
{
//   struct dk_lnode *tmp = NULL;
//
//   if (!l1 || !l2)
//     return EARG_NULL;
//
//   tmp = l1->next;
//   l1->next = l2->next;
//   l2->next = tmp;
//
//   tmp = l2->next;
//   l1->next = l2->next;
//   l2->next = tmp;
//



  return 0;
}

