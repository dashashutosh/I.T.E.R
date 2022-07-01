#include<stdio.h>
#include<math.h>

void multiply(int a[], int b[], int size)
{
  for(int i=0;i<size;i++)
     printf("%d ",a[i]+b[i]);

  printf("\n");
}

int main()
{
  int size;
  printf("\nEnter the effective size of array: ");
  scanf("%d",&size);
 
  int a[size],b[size];

  printf("\nEnter elements to array a: ");
  for(int i=0;i<size;i++)
      scanf("%d",&a[i]);

  printf("Enter elements to array b: ");
  for(int i=0;i<size;i++)
      scanf("%d",&b[i]);

  printf("\nSum of corresponding elements of both arrays: ");
  multiply(a,b,size);

  return 0;
}
