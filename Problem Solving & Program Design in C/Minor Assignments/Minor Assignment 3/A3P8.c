#include<stdio.h>

int main()
{
  double a[6]={1.2, 5.2, 1.8, 1.8, 1.6, 4.7};

  double *ptr1=&a[0], *ptr2=&a[1], *ptr3=&a[2], *ptr4=&a[3], *ptr5=&a[4], *ptr6=&a[5] ;

  
  printf("\nValues of the array using respective pointers:\n");
  printf("-----------------------------------------------\n");

  printf("a[0] = %0.1lf\na[1] = %0.1lf\na[2] = %0.1lf\na[3] = %0.1lf\na[4] = %0.1lf\na[5] = %0.1lf\n", *ptr1, *ptr2, *ptr3, *ptr4, *ptr5, *ptr6);

  return 0;
}