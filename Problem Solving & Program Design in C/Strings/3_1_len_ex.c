
/* Length*/

#include <stdio.h>
#include <string.h>
#define STRING_LEN 10

int
main( )
{
	char arr[ ] = "Bamboozled" ;
	int len1, len2 ;
	len1 = strlen ( arr ) ;
	len2 = strlen ( "Humpty Dumpty" ) ;
	printf ( "\nstring = %s length = %d", arr, len1 ) ;
	printf ( "\nstring = %s length = %d\n", "Humpty Dumpty", len2 );
	return (0);
}
