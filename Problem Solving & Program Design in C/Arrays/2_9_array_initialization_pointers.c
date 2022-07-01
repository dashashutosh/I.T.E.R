/*
* Passing array elements to functions
*/

#include <stdio.h>
#include <math.h>

#define MAX_ITEM 10 /* maximum number of items in list of data */


int
main(void)
{
	int arr1[MAX_ITEM];
	int i,num;
	int *ptr=arr1;
	
	printf("\nEnter the value to initialize array with>>");
	scanf("%d",&num);
	
	printf("\nInitializing array with %d:",num);
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  *(ptr+i)=num;
		}
	
	printf("\n***************Printing Array*************** \n");
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  printf("%d \n",ptr[i]); 
		}
		
	
	
	return (0);
}
