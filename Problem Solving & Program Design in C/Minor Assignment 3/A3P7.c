#include<stdio.h>

int main()
{
  int a[6]={120, 502, 118, 188, 106, 447};

  int *ptr1=&a[0], *ptr2=&a[1], *ptr3=&a[2], *ptr4=&a[3], *ptr5=&a[4], *ptr6=&a[5] ;

  
  printf("\nValues of the array using respective pointers:\n");
  printf("-----------------------------------------------\n");

  printf("a[0] = %d\na[1] = %d\na[2] = %d\na[3] = %d\na[4] = %d\na[5] = %d\n", *ptr1, *ptr2, *ptr3, *ptr4, *ptr5, *ptr6);

  return 0;
}