/* INITLIALIZED */

#include <stdio.h>
#include <string.h>

int
main( )
{
	char *names[] = {"akshay",
				"parag",
				"raman",
				"srinivas",
				"gopal",
				"rajesh"
			 } ;
	char *temp ;	
	printf ( "Original: %s %s", names[2], names[3] ) ;
	temp = names[2] ;
	names[2] = names[3] ;
	names[3] = temp ;
	printf ( "\nNew: %s %s", names[2], names[3] ) ;
	return(0);
}


