#include<stdio.h>

int main()
{
  int a=52,b=18;
  int *p1=&a,*p2=&b;

  if(*p1>*p2)
     printf("\n%d is greater than %d\n",*p1,*p2);

  else
     printf("%d is greater than %d",*p2,*p1);
  
  return 0;
}