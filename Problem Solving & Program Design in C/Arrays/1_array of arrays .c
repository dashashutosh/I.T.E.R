/*
* Demo: 2-D array is an array of arrays */


#include <stdio.h>
#include <math.h>


int
main( )
{
	int s[4][2] = {
			{ 1234, 56 },
			{ 1212, 33 },
			{ 1434, 80 },
			{ 1312, 78 }
			} ;
	int i ;
	for ( i = 0 ; i <= 3 ; i++ )
		printf ( "\nAddress of %d th 1-D array = %u, it should be equal to %u", i, s[i],&s[i][0]) ;
		//printf ( "\nAddress of %d th 1-D array = %u, address of s[%d] = %u", i, s[i],i,&s[i] ) ;		
	return (0);
}
	


