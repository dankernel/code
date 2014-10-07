/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 18일 03시 08분 19초
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

#include "dkh/code_analyze.h"
#include "dkh/dk_tree.h"

#include "dkh/dk_kernel.h"

int main(int argc, char* argv[])
{
  /* read_code_file("/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv"); */
  /* read_code_file("test/file.list"); */

  struct dk_tree *tree = init_tree();
  struct dk_tnode *node = NULL;
  
  node = add_tnode(tree, "add");
  print_tnode(tree->root);

  int *p = container_of(node->c, struct dk_tnode, c);
  printf("%p \n", p);

  return 0;
}
