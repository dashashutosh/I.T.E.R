#include<stdio.h>

int main()
{
  char str[100];
  printf("\nInput the string: ");
  gets(str);

  printf("The given sentence is: ");
  puts(str);

  int i=0;
  while(str[i]!='\0')
  {
    if(str[i]>=97 && str[i]<=122)
       str[i]-=32;

    else if(str[i]>=65 && str[i]<=90)
       str[i]+=32;

    i++;
  }

  printf("After case reversal the string is: ");  
  puts(str);

  return 0;
}
