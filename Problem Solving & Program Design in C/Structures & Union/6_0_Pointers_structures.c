
#include <stdio.h>
#include <math.h>

/* Memory map of structure elements */

struct book
	{
		char name[40] ;
		double price ;
		int pages ;
		int ISBN;
	} ;
int
main( )
{
	
	struct book b1 = { "Sorry", 130.00, 550,45 };		
	printf ( "\nAddress of structure is given by &b1=%u or &b1.name=%u \n",&b1, &b1.name ) ;
	printf("%u %d \n",b1,b1);
          
        struct book* ptr2b1=&b1; // pointer to a structure variable
        printf("\nAddress stored at ptr2b1 = %u and *ptr2b1= %u and &ptr2b1= %u %u",ptr2b1,*ptr2b1,&ptr2b1,b1);
        
                
        // Structures are not implemented using pointers, b1 is not the base address/ its a structure variable.
        //b1=b1+1;  // mismatched operands.
        
        //addresses of individual components of the structure variable b1 of type struct book.
	printf ( "\nAddress of name  = %u,  value=%s", &b1.name,b1.name) ;
	printf ( "\nAddress of price = %u,  value=%f", &b1.price,b1.price) ;
	printf ( "\nAddress of pages = %u,  value=%d", &b1.pages,b1.pages) ;
	printf ( "\nAddress of ISBN  = %u,  value=%d", &b1.ISBN,b1.ISBN) ;
	return 0;
}

