#include<stdio.h>

int main()
{
  int a[10]={0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

  printf("\nValues of array a     Address\n");
  printf("-------------------   --------\n");

  for(int i=0;i<10;i++)
       printf("a[%d] = %d             %u\n",i,a[i],&a[i]);

  return 0;
}