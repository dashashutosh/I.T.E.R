#include<stdio.h>
#include<math.h>

int find_largest(int a[],int size)
{
  int max=a[0];
  for(int i=0;i<size;i++)
  {
    if(max<a[i])
      max=a[i];
  }
  return max;
}

int main()
{
  int size;
  printf("\nEnter the size of array: ");
  scanf("%d",&size);
 
  int a[size];

  printf("\nEnter elements to array: ");
  for(int i=0;i<size;i++)
      scanf("%d",&a[i]);

  int l=find_largest(a,size);
  printf("\nLargest element of the array: %d\n",l);
  
  return 0;
}
