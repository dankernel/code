/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  file read header
 *
 *        Version:  1.0
 *        Created:  2014년 08월 18일 02시 46분 01초
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

#include <sys/types.h>
#include <unistd.h>

#include "errno.h"
#include "print_msg.h"

#define MAX_BUFF_SIZE 1024 * 4

struct file_info
{
  char *path;
  int fd;

  int file_size;
  int seek;
  int line;

  int buf_size;
  char *buf;

};

/*
 * init function pointer
 */
int init_file_struct(struct file_info *info, char *path)
{/*{{{*/

  struct stat stat_info;

  if (!info || !path)
    return -EARG_NULL;
  
  /* path */
  info->path = malloc(sizeof(char) * strlen(path));
  strcpy(info->path, path);

  /* fd */
  info->fd = open_file(path);

  /* file size */
  stat(path, &stat_info);
  info->file_size = stat_info.st_size;

  /* seek and line */
  info->seek = 0;
  info->line = 0;

  /* buf size */
  if (info->file_size < MAX_BUFF_SIZE)
    info->buf_size = info->file_size;
  else 
    info->buf_size = MAX_BUFF_SIZE;

  /* buffer */
  info->buf = malloc(info->buf_size);

  return 0;
}/*}}}*/

/*
 * open file
 * @path : file path
 * return : fd
 */
int open_file(char *path)
{/*{{{*/
  int ret = -1;

  if (!path)
    return -EARG_NULL;

  ret = open(path, O_RDWR, 0666);
  if (ret < 0)
    return -EFAIL_FUNC;

ret:
  err_test(ret, "open");
  return ret;
}/*}}}*/

char *read_split(struct file_info *info, char ch)
{
  int read_size = 0;
  int i = 0;
  int ret = 0;
  char tmp = '\0';

loop:

  /* read and save buf */
  memset(info->buf, '\0', info->buf_size);
  read_size = read(info->fd, info->buf, info->buf_size);
  // err_test(read_size, "read");
  if (read_size <= 0)
    goto fail;

  /* lookup char */
  i = 0;
  while (i < read_size){

    /* next char */
    tmp = *((info->buf) + i);

    /* new line count */
    if (tmp == '\n')
      info->line++;

    /* lookup ch */
    if (tmp == ch)
      goto ret;

    /* next */
    i++;
  }
  goto loop;

fail:
  return NULL;

ret : 
  /* string end */
  info->buf[i] = '\0';

  /* prevent re-find */
  i++;

  /* seek */
  ret = lseek(info->fd, -(read_size - i), SEEK_CUR);
  info->seek = ret;

  return info->buf;
}

int read_file(struct file_info *info)
{

  return 0;
}


