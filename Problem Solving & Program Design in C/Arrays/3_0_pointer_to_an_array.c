/* Pointer notation to access 2-D array elements */
# include<stdio.h>

int main( )
{
	/* Usage of pointer to an array */
	int s[]={ 3634,69,8956,27 };
	int (*p)[2] ;
	p=s;
	int i, *pint ;
	for ( i = 0 ; i <=1 ; i++ )
	    {
		
		pint=p;
		printf ( "\n**p prints %d \n *(*p+1) prints %d \n", *(*p+0),*(*p+1)) ;
		printf ( "\n*p[0] prints %d \n *p[1] prints %d \n", (*p)[0],(*p)[1]) ;
		printf ( "\n*(pint+0) prints %d \n *(pint+1) prints %d \n", *(pint+0),*(pint+1)) ;		
		p= p+1 ;
	    }
	  return(0);
}


