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

#define ERR_ARG_NULL      0x00000001
#define ERR_ARG_NEGATIVE  0x00000002


int line_word_size_chaeek(char *buf, int file_size, int word_size)
{
  int i = 0;
  int tmp_word_count = 0;

  if (!buf)
    return -ERR_ARG_NULL;

  if (file_size < 0 || word_size < 0)
    return -ERR_ARG_NEGATIVE;

  while (i < file_size) {

    tmp_word_count = 0;
    while (buf[i] != '\n') {
      tmp_word_count++;
    }

  }

  return 0;
}

int open_file(char *path)
{
  int fd = 0;

  if (!path)
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

  /* read file and save buf */
  if ((ret = read(fd, buf, size)) < 0)
    return -1;

  printf("%s \n", buf);

  line_word_size_chaeek(buf, size, 80);

  free(buf);

  return 0;

}


int main(int argc, char* argv[])
{
  int fd = 0;

  fd = open_file("./file.c");
  
  read_file("./file.c", fd);

  return 0;
}

