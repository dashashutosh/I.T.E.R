
/* User-defined function for Length*/

#include <stdio.h>
#include <string.h>

int
main( )
{
	char source[ ] = "Bamboozled" ;
	char target[20]="ashish" ;
	printf("Before>>\n");
	printf ( "\nsource string = %s", source ) ;
	printf ( "\ntarget string = %s", target ) ;
	
	strcpy ( target, source ) ;
	
	printf("\nAfter>>\n");
	printf ( "\nsource string = %s", source ) ;
	printf ( "\ntarget string = %s", target ) ;
	
	//char *p=strcpy ( target, source ) ;
	//printf ( "\ntarget string = %s", p ) ;

	return (0);
}

