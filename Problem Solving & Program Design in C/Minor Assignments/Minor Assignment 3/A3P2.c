#include<stdio.h>

int main()
{
  char ch[12]="ITER SOA";
  char *ptr=&ch[0];

  printf("\nDisplayed string using pointer:\n");
  
  int i=0;
  while(ch[i]!='\0')
  {
    printf("%c",*(ptr+i));
    i++;
  }
  printf("\n");

  return 0;
}