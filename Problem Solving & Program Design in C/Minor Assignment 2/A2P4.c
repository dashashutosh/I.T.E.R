#include<stdio.h>

int main()
{
  int i=45,j=12,k=23;
  int *p;
  
  p=&i;
  printf("\nValue of i: %d\n",*p);
  
  p=&j;
  printf("\nValue of j: %d\n",*p);

  p=&k;
  printf("\nValue of k: %d\n",*p);

  return 0;
}