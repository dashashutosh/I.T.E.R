
#include <stdio.h>
#include <math.h>

void display_books(struct book b2);

struct book
	{
		char name[40] ;
		double price ;
		int pages ;
		int ISBN;
	} ;
	
int main( )
{

	struct book b1 = { "USP Book", 130.00, 550,7865 } ;
	struct book b2 = b1;
	

	
	//display_books(b1);
	//display_books(b2);


	
	return 0;
}

void display_books(struct book b2)
{
       	printf ("\n***************** b1 *********************");
	printf ( "\n Value of name = %s", b2.name ) ;
	printf ( "\n Value of price = %f", b2.price ) ;
	printf ( "\n Value of pages = %d", b2.pages ) ;
	printf ( "\n Value of pages = %d", b2.ISBN ) ;
}

