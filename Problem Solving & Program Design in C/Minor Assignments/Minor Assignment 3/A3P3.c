#include<stdio.h>

int main()
{
  char ch[20];
  printf("\nEnter a string: ");
  gets(ch);
  
  int i=0;
  printf("\nCharacter   Address\n");
  printf("---------   --------\n");

  while(ch[i]!='\0')
  {
    printf("%c           %u\n",ch[i],&ch[i]);
    i++;
  }

  return 0;
}