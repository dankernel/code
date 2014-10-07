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

  char str[100] = "111.222.3333.444";
  char *p = NULL;

  int i = 1024 * 16;

  struct dk_list *list = init_list();
  struct dk_lnode *node = NULL;

  while (i--)
    if (!lookup_list(list, "22"))
      add_lnode(list, "11");

  print_list(list);


  /* read_code_file("/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv"); */
  /* read_code_file("test/file.list"); */

  /* struct dk_tree *tree = init_tree(); */
  /* struct dk_tnode *node = NULL; */
  /*  */
  /* node = add_tnode(tree, "add"); */
  /* print_tnode(tree->root); */
  /*  */
  /* #<{(| printf("node : %s \n", node->c); |)}># */
  /* struct dk_tnode *p = container_of(&(node->c), struct dk_tnode, c); */
  /* printf("%s : %s \n", tree->root->r->c, p->c); */

  return 0;
}
