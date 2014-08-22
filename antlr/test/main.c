
#include <stdio.h>

int f1(int num)
{
  return num * 2;
}

int main()
{
  int a = 10;
  int *p = NULL;

  p = &a;
  a = f1(*p);

  printf("result : %d \n", a);
}


