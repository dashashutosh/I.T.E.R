#include<stdio.h>
#include<string.h>

char* string_concatenate(char *s, char *t);

int main()
{
  char S[20],T[20];

  printf("\nEnter a string: ");
  gets(S);

  printf("Enter another string: ");
  gets(T);

  printf("\nConcatenating the 2 strings we get: %s\n",string_concatenate(S,T));

  return 0;
}

char* string_concatenate(char *s, char *t)
{
  int i=0, l=strlen(s);
  while(*(t+i)!='\0')
  {
    *(s+l)=*(t+i);
    l++;
    i++;
  }

  return s;  
}