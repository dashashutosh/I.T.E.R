#include<stdio.h>
#include<math.h>

int main()
{
  int size1;
  printf("\nEnter size of array1: ");
  scanf("%d",&size1);

  int a1[size1];
  printf("Enter elements to array1: ");
  for(int i=0;i<size1;i++)
    scanf("%d",&a1[i]);

  int size2;
  printf("\nEnter size of array2: ");
  scanf("%d",&size2);

  int a2[size2];
  printf("Enter elements to array2: ");
  for(int i=0;i<size2;i++)
    scanf("%d",&a2[i]);

  int size=size1+size2,k=0,temp;
  int a3[size];
  
  for(int i=0;i<size;i++)
  {
    if(i<size1)
       a3[i]=a1[i];
    else
    {
       a3[i]=a2[k];
       k++;
    }
  }

  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
    {
        if(a3[i]>a3[j])
        {
           temp=a3[i];
           a3[i]=a3[j];
           a3[j]=temp;
        }
    }
  }

  printf("\nThe merge sorted array is: ");
  for(int i=0;i<size;i++)
    printf("%d ",a3[i]);
  printf("\n");

  return 0;
}
