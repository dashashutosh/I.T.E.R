/* Pointer notation to access 2-D array elements */
# include<stdio.h>

int main( )
{
	int s[4][2] = {
			{ 1234, 56 },
			{ 1212, 33 },
			{ 1434, 80 },
			{ 1312, 78 }
			} ;
	int i, j ;
	
	for ( i = 0 ; i <= 3 ; i++ )
	  {
		printf ( "\n" ) ;
		printf("********** Row: %d***********",i);
		for ( j = 0 ; j <= 1 ; j++ )
		{
		   printf("\nUsing s[%d][%d]=%d \n",i,j,s[i][j]);
		   printf("Using *(s[%d]+%d)=%d \n",i,j,*(s[i]+j));
		   printf( "Using *(*(s + %d ) + %d )=%u %u\n",i,j,*(s + i ),s[i] );
		}
	  }
	  return(0);
}


