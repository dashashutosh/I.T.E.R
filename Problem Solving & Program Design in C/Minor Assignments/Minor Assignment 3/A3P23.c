#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main()
{
  char ch[20];
  printf("\nEnter the product code with valid warehouse name, product ID and size: ");

  gets(ch);

  int i=0,w=0,q=0,p=0;
  char product[20], qualifier[20];

  while( !isdigit(ch[i]) )
  {
    i++;
    w=i;
  }
  
  while( !isalpha(ch[i]) )
  {
    product[p]=ch[i];
    p++;
    i++;
  }
  product[p]='\0';

  while( ch[i]!='\0' )
  {
    qualifier[q]=ch[i];
    q++;
    i++;
  }
  qualifier[q]='\0';

  char warehouse[w];
  strncpy(warehouse,ch,w);
  
  printf("\nWarehouse: %s\nProduct: %s\nQualifier: %s\n",warehouse,product,qualifier);
  
  return 0;
}