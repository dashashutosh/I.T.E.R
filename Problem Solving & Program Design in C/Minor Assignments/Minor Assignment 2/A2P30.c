#include<stdio.h>
#include<math.h>

int main()
{
  int size;
  printf("\nEnter the size of array: ");
  scanf("%d",&size);
 
  int a[size];

  printf("\nEnter elements to array: ");
  for(int i=0;i<size;i++)
      scanf("%d",&a[i]);

  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
    {
      if(a[i]==a[j])
      {
        for(int k=j;k<size;k++)
            a[k]=a[k+1];
      j--;
      size--;
      }
    }
  }

  printf("\nDistinct elements of the array: ");
  for(int i=0;i<size;i++)
      printf("%d ",a[i]);
  printf("\n");

  return 0;
}
