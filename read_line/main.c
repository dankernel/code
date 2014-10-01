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

//#include "code_analyze.h"
#include "dkh/file_read.h"

int main(int argc, char* argv[])
{
  int fd = -1;
  int ret = 0;
  char *buf = NULL;

  /* alloc and init struct */
  struct file_info *dk_file = NULL;
  dk_file = (struct file_info*)malloc(sizeof(struct file_info));
  init_file_struct(dk_file, "/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv.gz");


  /* CORE */
  buf = read_split(dk_file, ',');
  while (buf) {

    // cheek //
    printf("%s\n", buf);

    /*
     * SOME CODE ...
     * ...
     */

    // next //
    buf = read_split(dk_file, '\n');
  }

  return 0;
}
