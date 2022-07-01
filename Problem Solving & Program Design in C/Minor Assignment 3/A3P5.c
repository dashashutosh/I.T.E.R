#include<stdio.h>

int main()
{
  int a[5]={10, 13, 20, 33, 44};
  double b[6]={10.2, 13.3, 20.0 , 33.3, 45.3, 89.9};  

  int *ptr_a=a;
  double *ptr_b=b;
  
  printf("\nValues of array a     Address\n");
  printf("-------------------   --------\n");

  for(int i=0;i<5;i++)
    printf("a[%d] = %d             %u\n",i,*(ptr_a+i),ptr_a+i);

  printf("\nValues of array b     Address\n");
  printf("-------------------   --------\n");

  for(int i=0;i<6;i++)
    printf("b[%d] = %0.1lf           %u\n",i,*(ptr_b+i),ptr_b+i);

  return 0;
}