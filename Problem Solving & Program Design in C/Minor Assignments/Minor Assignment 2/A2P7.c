#include<stdio.h>

int main()
{
  float x=8.6;
  float *p1,*p2,*p3;
  
  p1=&x;
  printf("\nValue of x using pointer p1: %0.1f\n",*p1);
  
  p2=&x;
  printf("\nValue of x using pointer p2: %0.1f\n",*p2);

  p3=&x;
  printf("\nValue of x using pointer p3: %0.1f\n",*p3);

  return 0;
}