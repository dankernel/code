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

#include "dkh/lru.h"

int main(int argc, char *argv[])
{
<<<<<<< HEAD

  /* Main */
  /* lru_main("/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv"); */
  lru_main("test/file");

=======
  /* read_code_file("/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv"); */
  read_code_file("test/file.list");
>>>>>>> b9cf046c4d23f7fe4f460dfbfd88ade5cd978b55
  return 0;
}
