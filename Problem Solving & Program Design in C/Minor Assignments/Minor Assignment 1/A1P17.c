#include<stdio.h>

int main()
{
  int n=10;
  if(printf("Is 10 divisible by 5 and 6?: "))
  {
    if(n%5==0 && n%6==0)
       printf("True\n");
    else
       printf("False\n");
  }

  if(printf("Is %d divisible by 5 or 6?: ",n))
  {
    if(n%5==0 || n%6==0)
       printf("True\n");
    else
       printf("False\n");
  }
  
  if(printf("Is 10 divisible by 5 or 6, but not both?: "))
  {
    if(n%5==0 ^ n%6==0)
       printf("True\n");
    else
       printf("False\n");
  } 
  return 0;
}