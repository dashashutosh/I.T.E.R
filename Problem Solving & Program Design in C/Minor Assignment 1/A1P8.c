#include<stdio.h>

int main()
{
  int n;
  int gross;
  int dozen;
  int left;
  
  printf("Enter the no. of eggs you have: ");
  scanf("%d",&n);

  gross = n/144;
  dozen = (n%144)/12;
  left = (n%144)%12;
  
  printf("Your no.of eggs is %d gross, %d dozen and %d",gross,dozen,left);

  return 0;
}