#include<stdio.h>

int main()
{
  int arr[5];
  
  printf("\nInput 5 elements in the array:\n");
  for(int i=0;i<5;i++)
  {
    printf("arr[%d]: ",i);
    scanf("%d",&arr[i]);
  }

  int min,max;
  min=max=arr[0];

  for(int i=0;i<5;i++)
  {
    if(min>arr[i])
       min=arr[i];
    if(max<arr[i])
      max=arr[i];
  }

  printf("Minimum element is: %d\n",min);
  printf("Maximum element is: %d\n",max);
    
  return 0;
}
