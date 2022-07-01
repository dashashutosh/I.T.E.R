
/* Program to demonstrate printing of a string */


#include <stdio.h>
#include <math.h>

#define MAX_ITEM 10 /* maximum number of items in list of data */

int
main(void)
{
	char name[ ] = "Iter,SOA,BBSkdajfjbvkjzdnvkjzxjv xjkbvxjFbvkjzx vnxc vjxc cvnzxcv kjl" ;
	char *cptr=name;
	int i = 0 ;
	while ( *(cptr+i) !='\0' )
	{
		printf( "%c", *(cptr+i) ) ;
		i++ ;
        }
        printf("\n");
	return (0);
}
