#include <stdio.h>

int binarySearch(int array[], int x, int low, int high) {

  while (low <= high) {
    int mid = low + (high - low) / 2;

    if (array[mid] == x)
      return mid;

    if (array[mid] < x)
      low = mid + 1;

    else
      high = mid - 1;
  }

  return -1;
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

  int x;
  printf("\nEnter the element to be searched: ");
  scanf("%d",&x);
  
  int result = binarySearch(a, x, 0, size - 1);
  if (result == -1)
    printf("Not found\n");
  else
    printf("Element is found at index %d", result);
  return 0;
}