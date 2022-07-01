#include<stdio.h>

int main()
{
  char a[5]={'I', 'B', 'C', 'S', '\0'};
  char *pa=a;

  char b[5]={'S', 'O', 'A', 'D', 'U'};  
  char *pb=b;
  
  printf("\nValues of array a     Address\n");
  printf("-------------------   --------\n");
  
  int i=0;
  while(i<5)
  {
    printf("%c                     %u\n",*(pa+i),pa+i);
    i++;
  }

  printf("\nValues of array b     Address\n");
  printf("-------------------   --------\n");
  
  i=0;
  while(i<5)
  {
    printf("%c                     %u\n",*(pb+i),pb+i);
    i++;
  }   

  return 0;
}