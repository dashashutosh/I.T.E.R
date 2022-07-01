/* INITLIALIZED */

#include <stdio.h>
#include <string.h>


int
main( )
{
	char dest[40];
	int m=12,d=2,y=2021;
	sprintf(dest,"%d-%d-%d",d,m,y);
	printf("%s",dest);
	
	int j;
	double k;
	char l[89];
	sscanf("12 34.6 ashish","%d%lf%s",&j,&k,l);
	printf("\n %d %f %s",j,k,l);
	return(0);
}


