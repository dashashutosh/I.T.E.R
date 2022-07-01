#include <stdio.h>  
int linearSearch(int a[], int n, int val) {   
  for (int i = 0; i < n; i++)  
    {  
        if (a[i] == val)  
        return i+1;  
    }  
  return -1;  
}  
int main() {  
  
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

  int res = linearSearch(a, size, x); // Store result   
  if (res == -1)  
  printf("\nElement is not present in the array");  
  else  
  printf("\nElement is present at %dth position of array\n", res);  
  return 0;  
}  