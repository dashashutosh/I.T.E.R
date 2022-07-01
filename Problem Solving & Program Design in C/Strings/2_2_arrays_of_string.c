

#include <stdio.h>
#include <string.h>
#include<stdlib.h>

int
main( )
{
	char names[][10] = { "akshay",
				"parag",
				"raman",
				"bharat",
				"gopal",
				"rajesh"
			 } ;
	char month[12][10] = {"January", "February", "March", "April",
				"May", "June", "July", "August",
				"September", "October", "November",
				"December"};
	int i ;
/*	for ( i = 0 ; i <6 ; i++ )
	{
	     	printf ( "Enter Name %d in name list \n",i+1) ;
		scanf ( "%s",names[i]) ;
	}*/
	int m;
	for ( i = 0 ; i <6 ; i++ )
	{
		printf ( "Name %d in name list is %s \n",i+1,names[i]) ;
	}
	
	for ( i = 0 ; i <12 ; i++ )
	{
	        m=rand()%6;
		printf ( "%s likes %s month \n",names[m],month[i]) ;
	}
	
	return(0);
}

