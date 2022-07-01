#include<stdio.h>
#include<string.h>

void bubble_sort(char ch[][50], int n)
{
  char temp[50];

  for(int j=0;j<n-1;j++)
  {
    for(int i=j+1;i<n;i++)
    {
      if(strcmp(ch[j],ch[i])>0)
      {
        strcpy(temp,ch[j]);
        strcpy(ch[j],ch[i]);
        strcpy(ch[i],temp);
      }
    }
  }
}

int main()
{
  char ch[50][50];
  int n;

  printf("\nEnter the no.of strings you want: ");
  scanf("%d",&n);

  printf("\nEnter %d no.of strings:\n",n);

  for(int i=0;i<n;i++)
    scanf("%s",ch[i]);

  printf("\nSorting the strings using bubble sort we get:\n");
  bubble_sort(ch,n);

  for(int i=0;i<n;i++)
    printf("%s\n",ch[i]);

  return 0;
}
