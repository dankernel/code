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

#include "errno.h"
#include "print_msg.h"

struct file_info
{
  char *path;
  int fd;

  int file_size;
  int seek;
  int line;

  int buf_size;
  char *buf;

  int (*init_file)(char *);
};

int init_file(char *path)
{
  printf("==\n");
  _open_file(path);

}

int _open_file(char *path)
{
  int ret = -1;

  if (!path)
    return -EARG_NULL;

  ret = open(path, O_RDWR, 0666);
  if (ret < 0)
    return -EFAIL_FUNC;

  err_test(ret, "open");

ret:
  return 0;
}

