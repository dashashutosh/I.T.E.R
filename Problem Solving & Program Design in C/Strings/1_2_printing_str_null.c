
/* Program to demonstrate printing of a string: each character array always ends with a ‘\0’. */


#include <stdio.h>
#include <math.h>

#define MAX_ITEM 10 /* maximum number of items in list of data */

int
main( )
{
	//char name[5] = "Iter,SOA,BBS" ;
	char name[20]="numbers and strings";
	char *ptr=name;
	int i = 0 ;
	while ( *(ptr+i) != '\0' )
	{
		printf ( "%c", *(ptr+i) ) ;
		i++ ;
	}
	printf("\n");
	return(0);
}
