#include<stdio.h>

int main()
{
  float x=6.7,y=1.2,z=2.3;
  float *p;
  
  p=&x;
  printf("\nValue of x: %0.1f\n",*p);
  
  p=&y;
  printf("\nValue of y: %0.1f\n",*p);

  p=&z;
  printf("\nValue of z: %0.1f\n",*p);

  return 0;
}