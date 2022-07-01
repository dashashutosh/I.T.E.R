#include<stdio.h>

int add(int*, int*);
int subtract(int*, int*);
int multiply(int*, int*);
int divide(int*, int*);

int main()
{
  printf("\nMENU DRIVEN CALCULATOR:\n");
  printf("--------------------------\n");
  printf("A. Addition\nS. Subtraction\nM. Multiplication\nD. Division\n");
  
  char ch;
  printf("\nEnter your choice: ");
  scanf("%c",&ch);

  int a,b;
  printf("Enter two numbers: ");
  scanf("%d %d",&a,&b);
  
  int sum,diff,prod,quoitent;

  switch(ch)
  {
    case 'A':
          sum=add(&a,&b);
          printf("Sum of %d and %d is %d\n",a,b,sum);
          break;

    case 'S':
          diff=subtract(&a,&b);
          printf("Difference between %d and %d is %d\n",a,b,diff);
          break;

    case 'M':
          prod=multiply(&a,&b);
          printf("Product of %d and %d is %d\n",a,b,prod);
          break;

    case 'D':
          quoitent=divide(&a,&b);
          printf("Quoitent when %d divides %d is %d\n",a,b,quoitent);
          break;

    default:
           printf("Invalid Choice\n");    
  }

  return 0;
}

int add(int *a,int *b)
{
  return *a+*b;
}

int subtract(int *a,int *b)
{
  return *a-*b;
}

int multiply(int *a,int *b)
{
  int prod = *a * *b;
  return prod;
}

int divide(int *a,int *b)
{
  int q = *a / *b;
  return q;
}