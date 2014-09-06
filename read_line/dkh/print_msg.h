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

inline void print_f(char *str)
{
  printf("[FAIL] %s \n", str);
}

inline void print_o(char *str)
{
  printf("[OK] %s \n", str);
}

inline int err_test(int val, char *str)
{

  if(val < 0) {
    printf("[FAIL] %s : %d fail... \n", str, val);
  } else {
    printf("[ OK ] %s : %d ok... \n", str, val);
  }

  return val;
}

