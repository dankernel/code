/**
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  :
 *
 *        Version:  1.0
 *        Created:  2014년 10월 30일 19시 48분 57초
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

#include "./dkh/lru.h"

/**
 * @brief Main function
 * @return error code
 */
int main(int argc, char *argv[]){

  FILE *fp;
  struct workload *wl = NULL;

  /* Set workload file */
  /* fp = open_workload("/home/dkdk/Downloads/lab/MSR-Cambridge/usr_2.csv"); */
  /* fp = open_workload("/home/dkdk/Downloads/lab/MSR-Cambridge/src2_2.csv"); */
  /* fp = open_workload("/home/dkdk/Downloads/lab/MSR-Cambridge/wdev_0.csv"); */
  /* fp = open_workload("/home/dkdk/Downloads/lab/MSR-Cambridge/src1_2.csv"); */
  fp = open_workload("test/wdev_0.csv");
  
  if (!fp)
    printf("FAIL open\n");

  wl = malloc(sizeof(struct workload));
  if (!wl)
    return -1;

  /* Read MAIN function */
  read_workload(wl, fp);

  fclose(fp);

  return 0;

}
