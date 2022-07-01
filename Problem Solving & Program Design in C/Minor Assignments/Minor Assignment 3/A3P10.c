#include<stdio.h>

int main()
{
  char a[6]={'S', 'A', 'B', 'C', 'D', 'E'};
  char *p=a;

  printf("\nValues of the array using one pointer:\n");
  printf("--------------------------------------\n");
  
  int i=0;
  while(i<6)
  {
    printf("a[%d] = %c\n",i,*(p+i));
    i++;
  }

  return 0;
}