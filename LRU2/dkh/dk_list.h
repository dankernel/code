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

#define offsetof(type, member) ((size_t) &((type *)0)->member)

#define container_of(ptr, type, member) ({\
    const typeof( ((type *)0)->member ) *__mptr = (ptr);\
    (type *)( (char *)__mptr - offsetof(type,member) );})

#define list_for_each(pos, head) \
  for (pos = (head)->next; prefetch(pos->next), pos != (head); \
      pos = pos->next)

struct list_head
{/*{{{*/
  struct list_head *next;
  struct list_head *prev;
};/*}}}*/


static inline void __list_del(struct list_head *prev, struct list_head *next)
{/*{{{*/
  next->prev = prev;
  prev->next = next;
}/*}}}*/

/* *
 * list_del - deletes entry from list.
 * @entry: the element to delete from the list.
 * Note: list_empty() on entry does not return true after this, the entry is
 * in an undefined state.
 */
static inline void list_del(struct list_head *entry)
{/*{{{*/
  __list_del(entry->prev, entry->next);
  entry->next = NULL;
  entry->prev = NULL;
}/*}}}*/

/*
 * make new node
 * return : new node
 */
struct list_head *init_lnode()
{/*{{{*/
  /* allocation new node */
  struct list_head *nn = NULL;
  nn = malloc(sizeof(struct list_head));
  if (!nn)
    return NULL;

  /* init */
  nn->next = nn;
  nn->prev = nn;

  return nn;
}/*}}}*/

/*
 * Insert a new entry between two known consecutive entries.
 *
 * This is only for internal list manipulation where we know
 * the prev/next entries already!
 */
static inline void __list_add(struct list_head *new,
    struct list_head *prev,
    struct list_head *next)
{/*{{{*/
  next->prev = new;
  new->next = next;
  new->prev = prev;
  prev->next = new;
}/*}}}*/

/* 
 * print node to form 
 * @n : target node
 */
inline void print_node(struct list_head *n)
{/*{{{*/
  printf("TODO\n");
}/*}}}*/


/*
 * list_replace - replace old entry by new one
 * @old : the element to be replaced
 * @new : the new element to insert
 *
 * If @old was empty, it will be overwritten.
 */
static inline void list_replace(struct list_head *old, struct list_head *new)
{/*{{{*/
  new->next = old->next;
  new->next->prev = new;
  new->prev = old->prev;
  new->prev->next = new;
}/*}}}*/

/*
 * list_add - add a new entry
 * @new: new entry to be added
 * @head: list head to add it after
 *
 * Insert a new entry after the specified head.
 * This is good for implementing stacks.
 */
static inline void list_add(struct list_head *new, struct list_head *head)
{/*{{{*/
  __list_add(new, head, head->next);
}/*}}}*/

/* 
 * list_move - delete from one list and add as another's head
 * @list: the entry to move
 * @head: the head that will precede our entry
 */
static inline void list_move(struct list_head *list, struct list_head *head)
{/*{{{*/
  __list_del(list->prev, list->next);
  list_add(list, head);
}/*}}}*/
