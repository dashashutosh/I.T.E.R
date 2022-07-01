#include<stdio.h>

int sum(int *, int *);

int main()
{
  int a,b;
  
  printf("\nInput the first number: ");
  scanf("%d",&a);

  printf("Input the second number: ");
  scanf("%d",&b);
 
  int s=sum(&a,&b);

  printf("The sum of %d and %d is %d\n",a,b,s);
  
  return 0;
}

int sum(int *a, int *b)
{
  return *a+*b;
}