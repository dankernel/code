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

#include "file_read.h"

int main(int argc, char* argv[])
{
  int fd = -1;

  struct file_info *dk_file = NULL;
  dk_file = (struct file_info*) malloc(sizeof(struct file_info));


  fd = init_file("./file");
  


  return 0;
}


