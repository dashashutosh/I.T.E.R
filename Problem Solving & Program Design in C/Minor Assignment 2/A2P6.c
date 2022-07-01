#include<stdio.h>

int main()
{
  int x=89;
  int *p1,*p2,*p3;
  
  p1=&x;
  printf("\nValue of x using pointer p1: %d\n",*p1);
  
  p2=&x;
  printf("\nValue of x using pointer p2: %d\n",*p2);

  p3=&x;
  printf("\nValue of x using pointer p3: %d\n",*p3);

  return 0;
}