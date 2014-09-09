/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 07월 25일 06시 34분 33초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:  Jun-Hyung Park (), google@dankook.ac.kr
 *   organization:  Dankook Univ.
 *
 * =====================================================================================
 */
#include <signal.h>
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int f1(int num)
{
  printf("in f1 : %d  \n", num * 10);
  return num * 10;

}

void ctrc_handler(int s)
{
  printf("Caught signal %d\n",s);
  exit(1); 
}

int signal_handler(void)
{
  struct sigaction sigIntHandler;

  sigIntHandler.sa_handler = ctrc_handler;
  sigemptyset(&sigIntHandler.sa_mask);
  sigIntHandler.sa_flags = 0;

  sigaction(SIGINT, &sigIntHandler, NULL);

  return 0;
}

int main(int argc, char *argv[])
{
  signal_handler();
  pause();

  return 0;    
}

