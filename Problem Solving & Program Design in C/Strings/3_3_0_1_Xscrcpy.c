
/* User-defined function for Length*/

#include <stdio.h>
#include <string.h>

char* xstrcpy ( char *t, char *s );
int
main( )
{
	char source[ ] = "Bamboozled" ;
	char target[20]="ashish" ;
	char check[45];
	printf("Before>>\n");
	printf ( "\nsource string = %s", source ) ;
	printf ( "\ntarget string = %s", target ) ;
	
	strcpy(check,xstrcpy ( target, source )) ;
	
	printf("\nAfter>>\n");
	printf ( "\nsource string = %s", source ) ;
	printf ( "\ntarget string = %s", target ) ;
	printf ( "\n check string = %s", check ) ;

	return (0);
}

char* xstrcpy ( char *t, char *s )
{
        printf("\n *****************************Using function \n");
        char *r;
        r=t;
	while ( *s != '\0' )
		{
			*t = *s ;
			s++ ;
			t++;
		}
	*t='\0';
	return r;
}
