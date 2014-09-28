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

/* 
 * read one source code(file). and analysis
 * path : source code(file) path
 * return : Analysis result(= code_info)
 */
struct code_info *read_code(char *path)
{/*{{{*/
  struct code_info *c_info = NULL;    // TODO : Analysis and make code info
  struct file_info *tmp_file = NULL;
  char *buf = NULL;

  // init list and. add key word 
  struct dk_list *list = init_list(); 
  add_lnode(list, "for"); 
  // print_list(list); 

  /* exception */
  if (!path)
    return NULL;

  /* 
   * Init code info
   * TODO : Analysis and make code info
   */
  c_info = (struct code_info*)malloc(sizeof(struct code_info));

  /* Init file info */
  tmp_file = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(tmp_file, path);

  /* CORE, get one line */
  buf = read_split(tmp_file, '\n');
  while (buf) {

    // char *tmp = NULL;
    // if (tmp = cheek_code_line(buf, list, KEYWORD_NEXT_PARENTHESES)) {
    //
    //   /* print */
    //   printf("file : %s \n", path);
    //   printf("%s \n\n", tmp);
    //
    // }

    /* get next one line */
    buf = read_split(tmp_file, '\n');
  }

  /* close and free file_info */
  close_file_info(tmp_file);

  return c_info;
}/*}}}*/

void *analysis_code_thread(void *a)
{
  struct analysis_arg *arg;

  char *f_name;
  struct file_info *f_list;
  struct code_info *result;
  pthread_mutex_t *mutex;

  int thread_count = 0;

  if (!a)
    goto end;

  printf("TID : %u\n", gettid());

  /* get struct node */
  arg = (struct analysis_arg*)a;
  f_name = arg->f_name;
  f_list = arg->f_list;
  mutex = arg->mutex;

  /* Pic one file */
  pthread_mutex_lock(mutex);
  f_name = read_split(f_list, '\n');
  pthread_mutex_unlock(mutex);

  while (f_list && f_name) {

    /* Read file */
    printf("%u : %d : %s \n", gettid()%4, thread_count++, f_name);
    read_code(f_name);
    // free(result);

    /* Next, Pic one file */
    pthread_mutex_lock(mutex);
    f_name = read_split(f_list, '\n');
    pthread_mutex_unlock(mutex);

  }

end:
  // close_file_info(f_list);
  printf("end!!!!!\n");
  pthread_exit((void *)0);

}

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

  buf = read_split(file_list, '\n');
  while (buf) {

    /* Next */
    buf = read_split(file_list, '\n');

  }

  ret = file_list->line;
  close_file_info(file_list);

  return ret;
}/*}}}*/


/* 
 * main function.
 * read file list and analysis(분석)
 * @path : file list (file)
 * return : errer code
 */
int read_file_code(char *path)
{/*{{{*/
  int fd = -1;
  int ret = 0;
  char *file = NULL;

  // TODO : Analysis and make code info
  struct code_info *c_info = NULL;    

  /* file list : alloc and init struct */
  struct file_info *file_list = NULL;
  file_list = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(file_list, path);

  /* mutex */
  pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
  pthread_t pthread[4];

  struct analysis_arg *arg = NULL;
  arg = (struct analysis_arg*)malloc(sizeof(struct analysis_arg));
  arg->f_name = NULL;
  arg->f_list = file_list;
  arg->mutex = &mutex;

  pthread_create(&pthread[0], NULL, analysis_code_thread, (void *)arg);
  pthread_create(&pthread[1], NULL, analysis_code_thread, (void *)arg);
  // pthread_create(&pthread[2], NULL, analysis_code_thread, (void *)arg);
  // pthread_create(&pthread[3], NULL, analysis_code_thread, (void *)arg);
  
  pthread_join(pthread[0], (void *)arg);
  pthread_join(pthread[1], (void *)arg);
  // pthread_join(pthread[2], (void *)arg);
  // pthread_join(pthread[3], (void *)arg);

  close_file_info(file_list);

  return 0;
}/*}}}*/

