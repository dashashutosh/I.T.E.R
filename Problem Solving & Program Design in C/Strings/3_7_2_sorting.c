

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define A_SIZE 5
#define SENT "-1"

void
fill_to_sentinel(int dbl_max, char* sentinel, char dbl_arr[][30], int *dbl_sizep);


int
get_min_range(const char data[][30], /* input - arrayof numbers */
            int First, int last) /* input - number of elements */
{
	int i, small_sub; /* subscript of smallest value so far */
	small_sub = First; /* Assume first element is smallest. */
	for (i = First+1; i <=last; ++i)
		if (strcmp(data[i],data[small_sub])<0)
			small_sub = i;
	return (small_sub);
}


/*
* Sorts the data in array list
* Pre: first n elements of list are defined and n >= 0
*/
void
select_sort(char list[][30], /* input/output - array being sorted */
            int n) /* input - number of elements to sort */
{
	char temp[30]; /* temporary storage */
	int fill, index_of_min; /* subscript of next smallest element */

	for (fill = 0; fill < n-1; ++fill) {
	/* Find position of smallest element in unsorted subarray */
		index_of_min = get_min_range(list, fill, n-1);
               
	/* Exchange elements at fill and index_of_min */
		if (fill != index_of_min) {
			strcpy(temp,list[index_of_min]);
			strcpy(list[index_of_min],list[fill]);
			strcpy(list[fill],temp);
		}
		
	}
}


int
main(void)
{
  	char arr[A_SIZE][30];
	int in_use, /* number of elements of arr in use */
	    i;

	fill_to_sentinel(A_SIZE, SENT, arr, &in_use);

	printf("List of Names (Unsorted) %d\n",in_use);
	for (i = 0; i < in_use; ++i)
		printf("%s\n", arr[i]);
  

        select_sort(arr,in_use);
  
  	printf("Sorted Array :\n"); 
  	for (i = 0; i < in_use; ++i)
		printf("%s\n", arr[i]);
  
  	return(0);           
}

void
fill_to_sentinel(int dbl_max, /* input - declared size of dbl_arr */
	         char* sentinel, /* input - end of data value in input list */
                 char dbl_arr[][30], /* output - array of data */
		 int *dbl_sizep) /* output - number of data values stored in dbl_arr */
{
	char data[30];
	int i, status;

	/* Sentinel input loop */
	i = 0;
	status = scanf("%s", data);
	while (status == 1 && strcmp(data,sentinel)!=0 && i < dbl_max) {
		strcpy(dbl_arr[i],data);
		++i;
		status = scanf("%s", data);
	}

	/* Issues error message on premature exit 
	if (status != 0) {
		printf("\n*** Error in data format ***\n");
		printf("*** Using first %d data values ***\n", i);
	} else */
	
	if (strcmp(data,sentinel)!=0) {
		printf("\n*** Error: too much data before sentinel ***\n");
		printf("*** Using first %d data values ***\n", i);
	}

	/* Sends back size of used portion of array */
	*dbl_sizep = i;
}



