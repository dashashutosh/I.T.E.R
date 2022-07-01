

#include <stdio.h>
#include <string.h>
#define STRSIZ 20
int
main( )
{
        //case 1
	char source[ ] = "Folks!" ;
	char target[30] = "Hello" ;
	strcat ( target, source ) ;
	printf ( "\n case 1: \nConcatenated string = %s", target ) ;

	
	//case 2
	char T1[STRSIZ] = "Jupiter ",
	     T2[STRSIZ] = "Jupiter ",
	     T3[STRSIZ] = "Jupiter ",
		s1[STRSIZ] = "Symphony and Symphony 123456";
	    
	strcat(T1, s1);
	printf ( "\n case 2: \nConcatenated string = %s", T1) ;
	
	//case 3
	strncat(T2, s1, 11);
	printf ( "\n case 3: \nConcatenated string = %s", T2) ;
	
	//case 4
	if (strlen(T3) + strlen(s1) < STRSIZ) {
		strcat(T3, s1);
	} else {
		strncat(T3, s1, STRSIZ - strlen(T3) - 1);
		T3[STRSIZ - 1] = '\0';
	}
	printf ( "\n case 4: \nConcatenated string = %s", T3) ;
	return (0);
}

