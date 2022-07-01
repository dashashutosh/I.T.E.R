
/* Program to demonstrate printing of a string: each character array always ends with a ‘\0’. */


#include <stdio.h>
#include <math.h>

#define MAX_ITEM 10 /* maximum number of items in list of data */

int
main( )
{
	char name[ ] = "Iter,SOA,BBS" ;
	char *p=name;
	while ( *p!= '\0' )
	{
		printf ( "%c", *p ) ;
		p++ ;
	}
	printf("\n");
	return(0);
}
