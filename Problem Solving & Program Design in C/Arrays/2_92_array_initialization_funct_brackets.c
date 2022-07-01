/*
* Passing array elements to functions
*/

#include <stdio.h>
#include <math.h>


void initialize(int ptr[], int n,int item)
{
        int i;
        printf("%u \n",ptr);    // should it print address same as base address
        printf("With ptr[]\n");
        printf("\nInitializing array with %d:",item);
	for ( i = 0 ; i <= n - 1 ; i++ )
		{
		  *(ptr+i)=item;
		}
}

int
main(void)
{
	int arr1[10];
	int i,num;
	int *ptr=arr1;
	
	printf("%u \n",arr1);	// what is the base address?
	printf("\nEnter the value to initialize array with>>");
	scanf("%d",&num);
	initialize(arr1,10,num);
	
	
	printf("\n***************Printing Array*************** \n");
	for ( i = 0 ; i <= 9 ; i++ )
		{
		  printf("%d \n",*(ptr+i)); 
		}
		
	
	
	return (0);
}
