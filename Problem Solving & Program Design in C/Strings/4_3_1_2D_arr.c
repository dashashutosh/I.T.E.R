/* INITLIALIZED */

#include <stdio.h>
#include <string.h>

int
main( )
{
	char names[][10] = {"akshay",
				"parag",
				"raman",
				"bharat",
				"gopal",
				"rajesh"
			 } ;
	int i ;
	char t ;
	
	printf ( "\nOriginal: %s %s", &names[1][0], &names[4][0] ) ;
	for ( i = 0 ; i <= 9 ; i++ )
	{
		t = names[1][i] ;
		names[1][i] = names[4][i] ;
		names[4][i] = t ;
	}
	printf ( "\nNew: %s %s", &names[1][0], &names[4][0] ) ;
	return(0);
}


