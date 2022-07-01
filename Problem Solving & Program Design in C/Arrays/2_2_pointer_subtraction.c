# include <stdio.h>

main( )
{
	int arr[ ] = { 10, -20, 30, 45, 67, 56, -74 } ;
	int *i, *j ;
	i = &arr[1] ;
	j = &arr[6] ;
	printf ( "%d %d %d", j - i,i-j, *j - *i ) ;
}
