/*
* Passing array elements to functions
*/

#include <stdio.h>
#include <math.h>

//#define MAX_ITEM 15 /* maximum number of items in list of data */

void display(int *fun_ptr, int num)
{
    int i;
    for ( i = 0 ; i <= num - 1 ; i++ )
		{
		  printf("%d \n",i[fun_ptr]); // call by value
		}
}

int
main(void)
{
	int a[5]={2,3,5,6,7};
	
	int *ptr;
	ptr=a;
	printf("Funciton : Call by address \n");
	display(ptr,5);   // pass the entire array // call by address
	return (0);
}
