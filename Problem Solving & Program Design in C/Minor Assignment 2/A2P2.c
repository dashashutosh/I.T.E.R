#include<stdio.h>

int main()
{
  int Ia=345;
  float Fb=4.5;
  char Chvar='Z';

  printf("\nValue stored in Ia: %d\n",Ia);
  printf("Address of Ia: %u\n",&Ia);

  printf("\nValue stored in Fb: %0.1f\n",Fb);
  printf("Address of Fb: %u\n",&Fb);
  
  printf("\nValue stored in Chvar: %c\n",Chvar);
  printf("Address of Chvar: %u\n",&Chvar);

  return 0;
}