
/* User-defined function for Length*/

#include <stdio.h>
#include <string.h>

int xstrlen ( char *s );
int
main( )
{
	char arr[ ] = "Bamboozled" ;
	int len1, len2 ;
	len1 = xstrlen ( arr ) ;
	len2 = xstrlen ( "Humpty Dumpty" ) ;
	printf ( "\nstring = %s length = %d", arr, len1 ) ;
	printf ( "\nstring = %s length = %d", "Humpty Dumpty", len2 ) ;
	return (0);
}

int xstrlen ( char *s )
{
	int length = 0,i=0;	
	while ( *s != '\0' )
	{
		length++ ;
		s++ ;
	}
	return ( length ) ;
}
