/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 05일 03시 28분 45초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:  Jun-Hyung Park (), google@dankook.ac.kr
 *   organization:  Dankook Univ.
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <fcntl.h>

char *_strdup(char *);
struct nlist *lookup(char *);

char *_strdup(char *s) /*  make a duplicate of s */
{
  char *p;
  p = (char *) malloc(strlen(s)+1); /*  +1 for '\0' */
  if (p != NULL)
    strcpy(p, s);
  return p;
}

#define IN 1

struct nlist { /*  table entry: */
  struct nlist *next; /*  next entry in chain */
  char *name; /*  defined name */
  char *defn; /*  replacement text */
};
#define HASHSIZE 101

/*  hash: form hash value for string s */
unsigned hash(char *s)
{
  unsigned hashval;
  for (hashval = 0; *s != '\0'; s++)
    hashval = *s + 31 * hashval;
  return hashval % HASHSIZE;
}

/*  install: put (name, defn) in hashtab */
struct nlist *install(char *name, char *defn)
{
  struct nlist *np;
  unsigned hashval;
  if ((np = lookup(name)) == NULL) { /*  not found */
    np = (struct nlist *) malloc(sizeof(*np));
    if (np == NULL || (np->name = _strdup(name)) == NULL)
      return NULL;
    hashval = hash(name);
    np->next = hashtab[hashval];
    hashtab[hashval] = np;
  } else /*  already there */
    free((void *) np->defn); /* free previous defn */
  if ((np->defn = _strdup(defn)) == NULL)
    return NULL;
  return np;
}

/*  install: put (name, defn) in hashtab */
struct nlist *install(char *name, char *defn)
{
  struct nlist *np;
  unsigned hashval;
  if ((np = lookup(name)) == NULL) { /*  not found */
    np = (struct nlist *) malloc(sizeof(*np));
    if (np == NULL || (np->name = _strdup(name)) == NULL)
      return NULL;
    hashval = hash(name);
    np->next = hashtab[hashval];
    hashtab[hashval] = np;
  } else /*  already there */
    free((void *) np->defn); /* free previous defn */
  if ((np->defn = _strdup(defn)) == NULL)
    return NULL;
  return np;
}

int main(int argc, char* argv[])
{

  return 0;
}

