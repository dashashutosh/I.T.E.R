

#include <stdio.h>
#define STRING_LEN 10

int
main(void)
{

	char str1[ ] = "Hello" ;
	char str2[10] ;
	
	char *s = "Good Morning" ;
	char *q;
	
	
	str2=str1;  // ERROR
	q=s; //works
	
	str1="Bye"; //Error
	s="Good Night";


return (0);
}
