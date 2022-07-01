# include <stdio.h>

main( )
{
	int arr[ ] = { 10, 20, 36, 72, 45, 36 } ;
	int *ptr;
	
	ptr=arr;
/*	printf("Value at index 0: %d \n", *ptr);
        printf("Value at index 0: %d \n", *(ptr+0));
        printf("Value at index 0: %d \n", *(ptr+1));*/
        

        printf("Value at index 0: %d \n", arr[0]);
        printf("Value at index 0: %d \n", *(arr+0));
        printf("Value at index 0: %d \n", *(0+arr));
        printf("Value at index 0: %d \n", 0[arr]);
        
        for (int i=0;i<6;i++)
          printf("Value at index 0: %d = %d \n", *(arr+i),*(ptr+i)); 
        
}
