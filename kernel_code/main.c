/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 08월 05일 03시 41분 16초
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

#define ERR_ARG_NULL 0x00000001

int open_file(char *path)
{
  int fd = 0;

  if(!path)
    return -ERR_ARG_NULL;

  if ((fd = open(path, O_RDONLY)) < 0)
    return -1;
  else
    return fd;
}

int read_file(char *path, int fd)
{
  int size = 0;
  int ret = 0;
  struct stat file_info;
  char *buf = NULL;

  /* get file size */
  stat(path, &file_info);
  size = file_info.st_size;
  printf("size : %d \n", size);

  /* init buf */
  buf = malloc(sizeof(char) * size);

  if ((







  return 0;

}


int main(int argc, char* argv[])
{
  int fd = 0;

  fd = open_file("./file.c");
  
  read_file("./file.c", fd);

  return 0;
}

