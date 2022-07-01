#include <stdio.h>
#include<string.h>
void Strcpy(char d[],char s[],int n)
{
  int i;
  for(i=0;i<n;i++)
  {
    s[i]=d[i];
  }
  s[i]='\0';

  printf("%s",s);

}
void Strct(char d[],char s[])
{
  int i=0;
  for(i=0;i<strlen(d);i++)
  {
    s[i]=d[i];
  }
  s[i]='\0';
  
}
int main(void) 
{
  char a[10]="SAURANSU";
  char b[10]; 
  int n;
  printf("Enter the number of characters:");
  scanf("%d",&n);
  Strcpy(a,b,n);
  return 0;
}