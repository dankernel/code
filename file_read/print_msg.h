/*
 * =====================================================================================
 *
 *       Filename:  print_mag.h
 *
 *    Description:  print mes
 *
 *        Version:  1.0
 *        Created:  2014년 08월 18일 02시 56분 28초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */

static void print_f(char *str)
{
  printf("[FAIL] %s \n", str);
}

static void print_o(char *str)
{
  printf("[OK] %s \n", str);
}

static int err_test(int val, char *str)
{

  if(val < 0) {
    printf("[FAIL] %s fail... \n", str);
  } else {
    printf("[ OK ] %s ok... \n", str);
  }

  return val;
}





