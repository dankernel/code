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

struct dk_tree
{/*{{{*/
  int count;
  struct dk_tnode *root;

  struct dk_tnode *r;
  struct dk_tnode *l;

  /* For buffer node */
  struct dk_tnode *r_cache;
  struct dk_tnode *w_cache;
};/*}}}*/

struct dk_tnode
{/*{{{*/
  int *c;
  struct dk_tnode *p;
  struct dk_tnode *r;
  struct dk_tnode *l;
};/*}}}*/

/*
 * make new node
 * @val : node contain
 * return : new node
 */
struct dk_tnode *init_tnode(void *val)
{/*{{{*/
  /* allocation new node */
  struct dk_tnode *nn = NULL;
  nn = malloc(sizeof(struct dk_lnode));

  /* init */
  nn->c = (int *)strdup(val);
  nn->p = NULL;
  nn->r = NULL;
  nn->l = NULL;

  return nn;
}/*}}}*/

/*
 * make new list
 * return : new list
 */
struct dk_tree *init_tree(void)
{/*{{{*/
  /* allocation */
  struct dk_tree *nt = NULL;
  nt = malloc(sizeof(struct dk_tree));

  /* init first node, new node = head = tail */
  nt->count = 1;
  nt->root = init_tnode(1234);
  nt->r = nt->root;
  nt->l = nt->root;

  /* init buf node */
  nt->r_cache = NULL;
  nt->w_cache = nt->root;

  return nt;
}/*}}}*/

/* 
 * print node to form 
 * @n : target node
 */
inline void print_tnode(struct dk_tnode *n)
{/*{{{*/
    printf("list print : %10p (%10p %10s) %10p : %10p \n", n->p, &n->c, n->c, n->l, n->r);
}/*}}}*/



