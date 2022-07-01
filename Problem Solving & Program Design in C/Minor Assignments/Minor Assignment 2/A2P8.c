#include<stdio.h>

int main()
{
  int a=12,b=25,c=18;
  int *ptr;

  printf("\nInitial Value of a: %d\n",a);
  printf("Initial Value of b: %d\n",b);
  printf("Initial Value of c: %d\n",c);

  printf("\nAfter incrementing by 10 using pointer:\n");
  printf("------------------------------------------\n");

  ptr=&a;
  printf("Value of a: %d\n",*ptr+10);
  
  ptr=&b;
  printf("Value of b: %d\n",*ptr+10);

  ptr=&c;
  printf("Value of c: %d\n",*ptr+10);

  return 0;
}