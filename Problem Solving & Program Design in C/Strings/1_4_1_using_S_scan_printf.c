
/* %s in scanf and printf */

#include <stdio.h>
#define STRING_LEN 10

int
main(void)
{
	char dept[STRING_LEN]="CSE";
	char days[STRING_LEN]="Tuesday";
	
	printf("%10s \n %10s \n", dept,days);
	
	printf("%-10s \n %-10s \n", dept,days);  //left
return (0);
}
