
/* User-defined function for Length*/

#include <stdio.h>
#include <string.h>

void xstrcat ( char *t, char *s );
int
main()
{

	char source[ ] = "Folks!" ;
	char target[30] = "Hello" ;
	xstrcat ( target, source ) ;
	printf ( "\nsource string = %s", source ) ;
	printf ( "\ntarget string = %s", target ) ;
	return (0);
}

void xstrcat ( char *t, char *s )
{
        printf("\n *****************************Using function \n");
        int len=strlen(t);
        
/*        printf("%d",len);
        printf("%u\n",t);        
        printf("%u",t);*/
        
        t=t+len;
	while ( *s != '\0' )
		{
			*t = *s ;
			s++ ;
			t++;
		}
	*t='\0';
}
