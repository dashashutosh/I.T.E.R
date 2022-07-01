/* Pointer notation to access 2-D array elements */
# include<stdio.h>

/* Three ways of accessing a 2-D array */
# include<stdio.h>

void display ( int *q, int row, int col );
void show ( int ( *q )[4], int row, int col );
void print ( int q[ ][4], int row, int col );

int main( )
{
	int a[3][4] = {
			1, 2, 3, 4,
			5, 6, 7, 8,
			9, 0, 1, 6
			} ;
	display ( a, 3, 4 ) ;
	show ( a, 3, 4 ) ;
	print ( a, 3, 4 ) ;
	return 0;
}

void display ( int *q, int row, int col )
{
	int i, j ;
	printf("Using formal parameter int *q in display \n");
	for ( i = 0 ; i < row ; i++ )
	   {
		for ( j = 0 ; j < col ; j++ )	    
			 printf ( "%d = %d \t", * ( q + i * col + j ),q[i * col + j] ) ;
			printf ( "\n" ) ;
	   }
        printf ("\n" ) ;
}


void show ( int ( *q )[4], int row, int col )
{
	int i, j ;
	//int *p ;
	printf("Using formal parameter int (*q)[4] \n");
	for ( i = 0 ; i < row ; i++ )
	{
		//p = q + i ;
		for ( j = 0 ; j < col ; j++ )
			{
			   //printf ( "%d ", * ( p + j ) ) ;
			   printf ( "%d ", q[i][j] ) ;}
		printf ( "\n" ) ;
	}
	printf ( "\n" ) ;
}

void print ( int q[ ][4], int row, int col )
{
	int i, j ;
	printf("Using formal parameter int q[][4] \n");
	for ( i = 0 ; i < row ; i++ )
	{
		for ( j = 0 ; j < col ; j++ )
			printf ( "%d ", q[i][j] ) ;
		printf ( "\n" ) ;
	}
	printf ( "\n" ) ;
}
