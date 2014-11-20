/*
 * =====================================================================================
 *
 *       Filename:  main.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 11월 03일 23시 14분 32초
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

int foo(int initialize, int val)
{
    int local;
    if (initialize) {
        local = val;
    } else {
        printf("local foo is %d\n", local);
    }
}

int bar(int initialize, int val)
{
    int local;
    if (initialize) {
        local = val;
    } else {
        printf("local bar is %d\n", local);
    }
}
int main()

{
    foo(1, 10); //set to 10
    foo(0, 0); //print it
    bar(1, 12); //set to 12
    foo(0, 0); //print foo again
    return 0;
}
