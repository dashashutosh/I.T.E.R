#include<stdio.h>

void bubble(int a[], int n)   
 {  
   int i, j, temp;  
   for(i = 0; i < n; i++)    
    {    
      for(j = i+1; j < n; j++)    
        {    
            if(a[j] < a[i])    
            {    
                temp = a[i];    
                a[i] = a[j];    
                a[j] = temp;     
            }     
        }     
    }     
 } 
 
int main ()    
{    
  int size;
  printf("\nEnter the size of array: ");
  scanf("%d",&size);
 
  int a[size];

  printf("\nEnter elements to array: ");
  for(int i=0;i<size;i++)
      scanf("%d",&a[i]);
  bubble(a, size);  
    
    printf("\nAfter using bubble sort, array elements are: ");      for(int i=0;i<size;i++)
      printf("%d ",a[i]);
    printf("\n");
    
    return 0;
}   