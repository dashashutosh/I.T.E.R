/*
* Passing array elements to functions
*/

#include <stdio.h>
#include <math.h>


void initialize(int *ptr_1, int n,int item)
{
        int i;
        printf("\nInitializing array with %d:",item);
	for ( i = 0 ; i <= n - 1 ; i++ )
		{
		  //*(ptr+i)=item;
		  ptr_1[i]=item;
		}
}

int
main(void)
{
	int arr1[10];
	int i,num;
	int *ptr=arr1;
	
	printf("\nEnter the value to initialize array with>>");
	scanf("%d",&num);
	initialize(arr1,5,num);
		
	printf("\n***************Printing Array*************** \n");
	for ( i = 0 ; i <= 10 - 1 ; i++ )
		{
		  printf("%d \n",*(ptr+i)); 
		}
		
	
	
	return (0);
}
