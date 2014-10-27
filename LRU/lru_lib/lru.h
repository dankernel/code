/*
 * =====================================================================================
 *
 *       Filename:  lru.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 10월 26일 03시 43분 37초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */

#define READ  1
#define WRITE 2

struct LRU
{
  char *time;
  char *host;
  int disk_num;
  int type;
  long offset;
  long size;
  long respone; //respones time
}




