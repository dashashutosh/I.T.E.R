
/* User-defined function for Length*/

#include <stdio.h>
#include <string.h>

int
main( )
{
	char *last, *first, *middle;
	//char pres[20] = "Adams, John Quincy";
	char pres[20] = "Jan. 30,  1996";
	char pres_copy[20];
	strcpy(pres_copy, pres);
	
	last = strtok(pres_copy, "., ");
	first = strtok(NULL, ", ");
	middle = strtok(NULL, ", ");
	printf ( "\n%s \n%s \n%s", last,first,middle ) ;

	return (0);
}

