
#include <stdio.h>
#include <math.h>

/* Memory map of structure elements */
int
main( )
{
	struct book
	{
		char name[40] ;
		double price ;
		int pages ;
		int ISBN;
	} ;
	struct book b1 = { "Sorry", 130.00, 550,45 };		
	printf ( "\nAddress of structure is given by &b1=%u or &b1.name=%u",&b1, &b1.name ) ;
        
        // Structures are not implemented using pointers, b1 is not the base address/ its a structure variable.
        //b1=b1+1;  // mismatched oerands.
        
        //addresses of individual components of the structure variable b1 of type struct book.
	printf ( "\nAddress of name  = %u,  value=%d", &b1.name,b1.name) ;
	printf ( "\nAddress of price = %u,  value=%d", &b1.price,b1.price) ;
	printf ( "\nAddress of pages = %u,  value=%d", &b1.pages,b1.pages) ;
	printf ( "\nAddress of ISBN  = %u,  value=%d", &b1.ISBN,b1.ISBN) ;
	return 0;
}

