

#include <stdio.h>
#include <stdlib.h> //gets and puts

int
main( )
{
        //case 1
	char nameusing_scan[30];
	char nameusing_gets[30];
	
	char bad;
	 
	printf ( "Enter your Full name>>");
	scanf("%s",nameusing_scan);
	printf ( "\n case 1: Name using scanf = %s \n", nameusing_scan) ;
	/*scanf("%c",&bad);
	while(bad !='\n')
	  scanf("%c",&bad);*/
	
	printf("Now using gets>>");	
	gets(nameusing_gets);	
        printf ( "\n case 2: Name using gets = %s \n Now printing using puts: ", nameusing_gets);
        puts(nameusing_gets);
        puts("DONE");
	return (0);
}

