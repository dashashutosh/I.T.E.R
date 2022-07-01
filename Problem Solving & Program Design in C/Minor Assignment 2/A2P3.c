#include<stdio.h>

int main()
{
  int a=5,b=6;

  printf("\nBefore Swapping:\n");
  printf("-------------------\n");
  printf("Value stored in a: %d\n",a);
  printf("Address of a: %u\n",&a);
  printf("\nValue stored in b: %d\n",b);
  printf("Address of b: %u\n",&b);
  
  a=a+b;
  b=a-b;
  a=a-b;

  printf("\nAfter Swapping:\n");
  printf("-------------------\n");
  printf("Value stored in a: %d\n",a);
  printf("Address of a: %u\n",&a);
  printf("\nValue stored in b: %d\n",b);
  printf("Address of b: %u\n",&b);

  return 0;
}