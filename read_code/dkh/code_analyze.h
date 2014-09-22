/*
 * =====================================================================================
 *
 *       Filename:  code_analyze.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 16일 05시 52분 36초
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

#include "file_read.h"
#include "print_msg.h"
#include "dk_str.h"
#include "dk_list.h"

#define CPU_COUNT 4
#define KEYWORD_NEXT_PADDING 0X00000001

struct code_info
{
  /* info */
  char *name;

  /* nomal */
  int line;

  /* bracket count */
  int b_l;
  int b_m;
  int b_s;

  /* function */
  int f_count;
  int f_maxline;
  int f_minline;

};



char *list_str(struct dk_list *list, char *str)
{
  struct dk_lnode *tmp = NULL;
  char *s = NULL;
  char *ret = 0;

  if ((!str) || (strlen(str) < 3))
    return NULL;

  while (tmp = next_lnode(list)) {
    /* pic keyword in list */
    s = (char *)tmp->p;

    if ((ret = strstr(str, s))) {
      //printf("list str ok : %s : %s : \n", s, str);
      return ret;
    } 
  }

  return NULL;
}

char *cheek_code_line(struct dk_list *list, char *str, int option)
{
  struct dk_lnode *tmp = NULL;
  char *s = NULL;
  char *ret = 0;

  if ((!str) || (strlen(str) < 3))
    return NULL;

  while (tmp = next_lnode(list)) {
    /* pic keyword in list */
    s = (char *)tmp->p;

    if ((ret = strstr(str, s))) {
      if (option == KEYWORD_NEXT_PADDING && *(ret + strlen(s)) == '(')
        return ret;
    } 
  }

  return NULL;
}

struct code_info *read_code(char *path)
{
  struct code_info *c_info = NULL;
  struct file_info *tmp_file = NULL;

  char *buf = NULL;

  // init list and add key word 
  struct dk_list *list = init_list(); 
  add_lnode(list, "for"); 
  //print_list(list); 

  /* null */
  if (!path)
    return NULL;

  /* Init code info */
  c_info = (struct code_info*)malloc(sizeof(struct code_info));

  /* Init file */
  tmp_file = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(tmp_file, path);

  /* CORE */
  buf = read_split(tmp_file, '\n');
  while (buf) {

    char *tmp = NULL;
    if (tmp = cheek_code_line(list, buf, KEYWORD_NEXT_PADDING)) {

      printf("file : %s \n", path);
      printf("%s \n\n", tmp);

    }

    buf = read_split(tmp_file, '\n');
  }

  close(tmp_file->fd);

  free(tmp_file->buf);
  free(tmp_file->path);
  free(tmp_file);

  return c_info;
}

int get_file_line(char *path)
{
  int fd = -1;
  int ret = 0;
  char *file = NULL;

  /* file list : alloc and init struct */
  struct file_info *file_list = NULL;
  file_list = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file_list, path);

  file = read_split(file_list, '\n');

  struct file_info *tmp_file = NULL;
  while (file) {

    /* Read file */
    read_code(file);

    /* Next */
    file = read_split(file_list, '\n');

  }

  return file_list->line;
}


int read_file_code(char *path, int cpu)
{
  int fd = -1;
  int ret = 0;
  char *file = NULL;

  // init list and add key word 
  struct dk_list *list = init_list(); 
  add_lnode(list, "for"); 
  print_list(list); 

  /*  file list : alloc and init struct */
  struct file_info *file_list = NULL;
  file_list = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file_list, path);

  file = read_split(file_list, '\n');

  struct file_info *tmp_file = NULL;
  while (file) {

    /* Read file */
    read_code(file);

    /* Next */
    file = read_split(file_list, '\n');

  }

  return 0;
}

