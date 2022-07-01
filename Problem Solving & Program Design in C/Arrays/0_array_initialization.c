/*
* Passing array elements to functions
*/

#include <stdio.h>
#include <math.h>

#define MAX_ITEM 5 /* maximum number of items in list of data */


int
main(void)
{
	int arr1[5];
	int arr4[5]={2,3,5,6,7};
	int arr2[]={23,45,56,77,88};
	int arr3[5]={4,5,6};
	
	
	int i;
	printf("***************Print arr1*************** \n");
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  printf("%d \n",arr1[i]); 
		}
		
	printf("\n***************Print arr2*************** \n");
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  printf("%d \n",arr4[i]); 
		}	
		
	printf("\n***************Print arr3*************** \n");
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  printf("%d \n",arr2[i]); 
		}
	
	printf("\n***************Print arr4 ***************\n");
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  printf("%d \n",arr3[i]); 
		}
	
	return (0);
}
