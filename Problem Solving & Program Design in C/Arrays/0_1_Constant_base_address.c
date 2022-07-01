/*
* WAP to show that base address of an array is constant and cannot be changed through assignment.
*/

#include <stdio.h>
#include <math.h>

#define MAX_ITEM 10 /* maximum number of items in list of data */

int
main(void)
{
	int square[MAX_ITEM];
	int sq1[MAX_ITEM]={34,6};
	square=sq1;
	int i,j=5;
	for ( i = 0 ; i < MAX_ITEM ; i++,j+=5 )
		{
		  square[i]=j*j;
		  printf("The square of %d is %d \n",j, square[i]);
		}
	
	return (0);
}
