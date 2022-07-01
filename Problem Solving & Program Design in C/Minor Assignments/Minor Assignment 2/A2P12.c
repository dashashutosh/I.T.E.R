#include<stdio.h>

int main()
{
  int Ia=23;

  int *ptr1=&Ia;
  printf("\nValue of Ia: %d\n",Ia); 
  printf("Value of Ia via ptr1: %d\n",*ptr1);
  
  *ptr1=33;
  printf("After updating, value of Ia via ptr1: %d\n",*ptr1);

  int *ptr2=&Ia;  
  printf("\nValue of Ia: %d\n",Ia); 
  printf("Value of Ia via ptr2: %d\n",*ptr2);
  
  *ptr2=27;
  printf("After updating, value of Ia via ptr2: %d\n",*ptr2);
  
  int *ptr3=&Ia;  
  printf("\nValue of Ia: %d\n",Ia); 
  printf("Value of Ia via ptr3: %d\n",*ptr3);
  
  *ptr3=58;
  printf("After updating, value of Ia via ptr3: %d\n",*ptr3);

  return 0;
}