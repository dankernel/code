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


#include <pthread.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <fcntl.h>

#include <sys/syscall.h> /*  For SYS_xxx definitions */
#include <sys/types.h>   /*  For pid_t */

#include "file_read.h"
#include "print_msg.h"
#include "dk_str.h"
#include "dk_list.h"

#define CPU_COUNT 4
#define KEYWORD_NEXT_PADDING 0X00000001
#define KEYWORD_NEXT_PARENTHESES 0X00000002       /* parentheses = '(' or ')' */
#define KEYWORD_NEXT_L_PARENTHESES 0X00000004     /* parentheses = '(' */
#define KEYWORD_NEXT_R_PARENTHESES 0X00000008     /* parentheses = ')' */

struct code_info
{/*{{{*/
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

};/*}}}*/

/*
 * TODO : ...??
 */
char *list_str(struct dk_list *list, char *str)
{/*{{{*/
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
}/*}}}*/

/*
 * passing mutex arg
 * @f_name : file name
 * @f_list : read file list
 * @result : result code_info strut
 * @mutex : mutex
 */
struct analysis_arg{
  char *f_name;
  struct file_info *f_list;
  int num;

  /* mutex */
  pthread_mutex_t *mutex;
};

static inline pid_t gettid (void)
{
    return (pid_t) syscall (SYS_gettid); /*  or __NR_gettid */
}

/*  
 * lookup option at str. reference list
 * str : target string
 * list : reference info list
 * option : operation option
 * return : result string
 */
char *cheek_code_line(char *str, struct dk_list *list, int option)
{/*{{{*/
  struct dk_lnode *tmp = NULL;
  char *s = NULL;
  char *ret = 0;

  /* str exception test. null or (len < 3) */
  if ((!str) || (strlen(str) < 3))
    return NULL;

  /* loop list */
  while (tmp = next_lnode(list)) {

    /* 
     * XXX : operation...... 
     */

    /* pic keyword in list */
    s = (char *)tmp->p;

    if ((ret = strstr(str, s))) { /* contain keyword */
      if (option == KEYWORD_NEXT_PARENTHESES && *(ret + strlen(s)) == '(')
        return ret;
    } 
  }

  return NULL;
}/*}}}*/


int init_code_info(struct code_info *c_info, char *file)
{/*{{{*/
  if (!c_info || !file)
    return EARG_NULL;

  /* name */
  c_info->name = malloc(strlen(file) + 1);
  strcpy(c_info->name, file);

  /* nomal */
  c_info->line = 0;

  /* bracket count */
  c_info->b_l = 0;
  c_info->b_m = 0;
  c_info->b_s = 0;

  /* function */
  c_info->f_count = 0;
  c_info->f_maxline = 0;
  c_info->f_minline = 0;

  return 0;
}/*}}}*/

/* 
 * read one source code(file). and analysis
 * file : source code(file) path
 * return : err code
 */
int *read_code_file(char *file)
{/*{{{*/
  struct code_info *c_info = NULL;    // TODO : Analysis and make code info
  struct file_info *tmp_file = NULL;
  char *buf = NULL;

  /* exception */
  if (!file)
    return NULL;

   /* Init file info */
  tmp_file = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(tmp_file, file);

  struct dk_list *list = init_list();
  struct dk_lnode *node = NULL;

  /* CORE, get one line */
  buf = read_next_line(tmp_file);
  while (buf) {

    if (!lookup_list(list, buf))
      add_lnode(list, buf);
    else
      printf("HIT : %s \n", buf);

    /* get next one line */
    buf = read_next_line(tmp_file);

  }
  // print_list(list);
  printf("count : %d\n", list->count);
  remove_list(list);

end:
  printf("%s \n", file);
  close_file_info(tmp_file);
  return 0;
}/*}}}*/

/*
 * get file line
 * path : target file path
 * return : file line count nuber
 */
int get_file_line(char *path)
{/*{{{*/
  int ret = -1;
  char *buf = NULL;

  /* file list : alloc and init struct */
  struct file_info *file_list = NULL;
  file_list = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file_list, path);

  buf = read_next_line(file_list);
  while (buf) {

    /* Next */
    buf = read_next_line(file_list);

  }

  ret = file_list->line;
  close_file_info(file_list);

  return ret;
}/*}}}*/


