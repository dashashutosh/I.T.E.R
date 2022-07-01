#include<stdio.h>

int main()
{
  int a=12,b=52,c=8;
  int *ptr1=&a, *ptr2=&b, *ptr3=&c;

  printf("\nInitial Value of a: %d\n",a);
  printf("Initial Value of b: %d\n",b);
  printf("Initial Value of c: %d\n",c);

  printf("---------------------------------------------------\n");

  printf("Value of a incremented by 10 using pointer ptr1: %d\n",*ptr1+10);
  
  printf("Value of b incremented by 10 using pointer ptr2: %d\n",*ptr2+10);

  printf("Value of c incremented by 10 using pointer ptr3: %d\n",*ptr3+10);

  return 0;
}