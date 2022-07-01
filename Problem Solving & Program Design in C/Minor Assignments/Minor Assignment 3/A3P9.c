#include<stdio.h>

int main()
{
  int a[6]={120, 502, 118, 188, 106, 447};

  int *ptr=&a[0];

  printf("\nValues of the array using one pointer:\n");
  printf("-------------------------------------\n");

  for(int i=0;i<6;i++)
      printf("a[%d] = %d\n",i,*(ptr+i));

  return 0;
}