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

struct dk_list {
  int count;
  struct dk_lnode *root;
  struct dk_lnode *curr;
};

struct dk_lnode {
  struct dk_lnode *next;
  struct dk_lnode *prev;
};
