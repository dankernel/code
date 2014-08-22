/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  :
 *
 *        Version:  1.0
 *        Created:  2014년 08월 22일 22시 33분 07초
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


int main(int argc, char* argv[])
{
  char pass0[] = "__PW_is_8word__";
  char pass1[] = "__Hint__";
  char pass2[] = "__Find_String__";
  char pass3[] = "__PassIs__";
  char pass4[] = "__>>__";
  char pass5[] = "dkdk1234";
  char pass6[] = "__<<__";

  char buf[10];

  scanf("%s", buf);

  if (strcmp(buf, pass4) == 0)
    printf("ok..\n");
  else
    printf("fail.. \n");

  return 0;
}

