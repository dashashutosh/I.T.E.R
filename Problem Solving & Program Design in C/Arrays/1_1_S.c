/*
* Passing array elements to functions
*/

#include <stdio.h>
#include <math.h>

#define MAX_ITEM 5 /* maximum number of items in list of data */

void display(int x)
{
    printf( "\nelement = %d",x) ;
}

int
main(void)
{
	int a[5]={2,3,5,6,7};
	int i;
	printf("Funciton : Call by address \n");
	for ( i = 0 ; i <= MAX_ITEM - 1 ; i++ )
		{
		  display(a[i]); // call by address
		}
	
	return (0);
}
