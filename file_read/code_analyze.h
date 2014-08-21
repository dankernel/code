/*
 * =====================================================================================
 *
 *       Filename:  code_analyze.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 19일 01시 59분 39초
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

/*
 * util functions
 */
#include "file_read.h"
#include "dk_util.h"

#define KEYWORD_IF if
#define KEYWORD_FOR for
#define KEYWORD_WHILE while

#define BRACKET_OPEN  0x00000001
#define BRACKET_COLSE 0x00000002

#define COMMENT_OPEN  0x00000010
#define COMMENT_COLSE 0x00000020
#define COMMENT_LINE  0x00000040

#define LOOP_COMMENT_COLSE(x) (x == COMMENT_COLSE)

char *remove_front_padding(char *str);
inline int count_tab(char *str);
int is_comment(char *str);
int bracket_exist(char *str);

/*
 * remove front padding. (e.g, tab or ' ')
 * @str : string
 * return : new pointer
 */
char *remove_front_padding(char *str)
{/*{{{*/
  int i = 0;
  char *ret = NULL;
  char *tmp = NULL;

  ret = str;
  while (*(tmp = (str + i)) != '\0') {

    /* passing tab or padding */
    if (*tmp == '\t' || *tmp ==' ') {
      ret++;
    } else {
      goto ret;
    }

    i++;
  }

ret:
  return ret;
}/*}}}*/

/*
 * count tabs
 */
inline int count_tab(char *str)
{/*{{{*/
  int ret = 0;

  if (!str)
    return 0;

  while (*(str + ret) == '\t')
    ret++;

  return ret;
}/*}}}*/

/* TODO : working */
int is_comment_line(char *str, char *start, char *end)
{/*{{{*/
  int ret = 0;
  int status = 0;
  int i = 0;

  /* start */
  while (*(str + i) != '\0' && start == 0) {
    if (strcmp(str + i, "//") != 0) {
      status = COMMENT_OPEN;
      start = str + i;
      break;
    } else if (strcmp(str + i, "/*") != 0) {
      status = COMMENT_OPEN;
      start = str + i;
      break;
    }

    i++;
  }

  /* end */
  while (*(str + i) != '\0' && end == 0) {
    if (strcmp(str + i, "\n") != 0) {
      status |= COMMENT_COLSE;
      end = str + i;
      break;
    } else if (strcmp(str + i, "*/") != 0) {
      status |= COMMENT_COLSE;
      end = str + i + 1;
      break;
    }

    i++;
  }

  printf("end\n");
  return ret;
}/*}}}*/


/*
 * TODO : working
 */
int bracket_exist(char *str)
{/*{{{*/
  int ret = 0;
  int i = 0;

  int open = 0,
      close = 0;

  char tmp = '\0';

  /* loop */
  while ((tmp = *(str + i)) != '\0') {

    if (tmp == '(') {
      open++;
    } else if (tmp == ')') {
      close++;
    }

    /* next */
    i++;
  }

ret:
  ret |= close;
  ret |= open << 4;
  bin_print_32(ret);
  return ret;
}/*}}}*/


char *read_pass_comment(struct file_info *info)
{
  int comment = 0;
  int comment_stat = 0;
  char *ret = NULL;

  char *start = NULL;
  char *end = NULL;

  if (!info || !info->buf)
    return NULL;

  /* first get line */
  ret = read_split(info, '\n');
  comment = is_comment_line(ret, start, end);

  return ret;
}

