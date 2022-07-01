/*
* WAP to store the squares of the integers 5,10,15,20,...,50
*/

#include <stdio.h>
#include <math.h>

#define MAX_ITEM 10 /* maximum number of items in list of data */

int
main(void)
{
	int square[10];
	int i,j=5;
	for ( i = 0 ; i < MAX_ITEM ; i++,j+=5 )
		{
		  square[i]=j*j;
		  printf("The square of %d is %d \n",j, square[i]);
		}
	
	return (0);
}
