/*
 * =====================================================================================
 *
 *       Filename:  handler.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 09월 10일 02시 04분 35초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */
#include <signal.h>
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

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
