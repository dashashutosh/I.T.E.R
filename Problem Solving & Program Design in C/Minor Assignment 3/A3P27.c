#include<stdio.h>
#include<string.h>

int isPallin(char ch[],char rev[]);

int main()
{
  char ch[20],rev[20];
 
  printf("\nEnter a string: ");
  gets(ch);

  if(isPallin(ch, rev))
    printf("%s is a pallindrome string\n",ch);
  else
    printf("%s is not a pallindrome string\n",ch);
   
  return 0;
}

int isPallin(char ch[],char rev[])
{
  int l=strlen(ch)-1;
  int i=0;
  
  while(l>=0)
  {
    rev[i]=ch[l];
    i++;
    l--;
  }

  if(strcmp(ch,rev)==0)
    return 1;

  return 0;
}