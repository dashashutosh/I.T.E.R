#include<stdio.h>

int main()
{
  int Ivar=454;
  int *ptr=&Ivar;
  int **Tptr=&ptr;

  printf("\nValue stored in Ivar: %d\n",*ptr);
  printf("Address of Ivar: %u\n",ptr);

  printf("\nValue stored in ptr: %u\n",*Tptr);
  printf("Address of ptr: %u\n",Tptr);
  
  printf("\nValue stored in Tptr: %u\n",Tptr);
  printf("Address of Tptr: %u\n",&Tptr); 

  return 0;
}