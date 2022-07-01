/*
* Demo: 2-D array is an array of arrays */


#include <stdio.h>
#include <math.h>

int
main( )
{
	int a[ ] = { 0, 1, 2, 3, 4 } ;	
	int *p[ ] = { a, a + 1, a + 2, a + 3, a + 4 } ;
	
	for(int i=0;i<5;i++)
 	 printf ( "\n%u %u %u %u %d %d \n", p+i, &p[i],*(p+i),p[i], *(*(p+i) ),*p[i] ) ;
	return (0);
}
	


