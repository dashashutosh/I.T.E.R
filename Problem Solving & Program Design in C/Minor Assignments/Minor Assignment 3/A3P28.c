#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<ctype.h>

int alpha(char str[])
{
  int i=0,cnt=0;
  while(str[i]!='\0')
  {
    if(isalpha(str[i]))
       cnt++;
    i++;
  }
  return cnt;
}

int uppercase(char str[])
{
  int i=0,cnt=0;
  while(str[i]!='\0')
  {
    if(isupper(str[i]))
       cnt++;
    i++;
  }
  return cnt;
}

int lowercase(char str[])
{
  int i=0,cnt=0;
  while(str[i]!='\0')
  {
    if(islower(str[i]))
       cnt++;
    i++;
  }
  return cnt;
}

int space(char str[])
{
  int i=0,cnt=0;
  while(str[i]!='\0')
  {
    if(str[i]==' ')
       cnt++;
    i++;
  }
  return cnt;
}

int digits(char str[])
{
  int i=0,cnt=0;
  while(str[i]!='\0')
  {
    if(isdigit(str[i]))
       cnt++;
    i++;
  }
  return cnt;
}


int main()
{
  int i=0;
  char str[50];
  char ch;

  printf("\nEnter a string: ");
  
  ch=getchar();
  while(ch!='\n')
  {
    str[i]=ch;
    i++;
    ch=getchar();
  }
  str[i]='\0';

  int a,u,l,s,d,p;

  a=alpha(str);
  u=uppercase(str);
  l=lowercase(str);
  s=space(str);
  d=digits(str);
  p=i-(a+s+d);

  printf("No. of alphabets: %d\nNo. of uppercase letters: %d\nNo. of lowercase letters: %d\nNo. of spaces: %d\nNo. of digits: %d\nNo. of punctuation symbols: %d\n",a,u,l,s,d,p);

  return 0;
}
