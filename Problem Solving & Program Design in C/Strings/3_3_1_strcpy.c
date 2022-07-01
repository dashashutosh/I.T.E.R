
/* User-defined function for Length*/

#include <stdio.h>
#include <string.h>

int
main( )
{
	char result[10], s1[15] = "Jan. 30, 1996";
	strncpy(result, s1, 9);
	result[9] = '\0';

	//char *p=strcpy ( target, source ) ;
	printf ( "\ntarget string = %s", result ) ;
	
	strncpy(result, &s1[5], 2);
	result[2] = '\0';
	
	printf ( "\nUpdated target string = %s", result ) ;
	
	strcpy(result, &s1[9]);
	printf ( "\nUpdated target string = %s", result ) ;

	return (0);
}

