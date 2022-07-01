/* Driver to test fill_to_sentinel function */

#include <stdio.h>
#include <string.h>
#define A_SIZE 2
//#define SENT "-1"

void
fill_to_sentinel(int dbl_max, char* sentinel, char dbl_arr[][30], int *dbl_sizep);


int
main(void)
{
	char arr[A_SIZE][30];
	char SENT[]="-1";
	int in_use, /* number of elements of arr in use */
	    i;

	fill_to_sentinel(A_SIZE, SENT, arr, &in_use);

	printf("List of Names\n");
	for (i = 0; i < in_use; ++i)
		printf("%s\n", arr[i]);

	return (0);
}



/*
* Gets data to place in dbl_arr until value of sentinel is encountered in
* the input.
* Returns number of values stored through dbl_sizep.
* Stops input prematurely if there are more than dbl_max data values before
* the sentinel or if invalid data is encountered.
* Pre: sentinel and dbl_max are defined and dbl_max is the declared size
* of dbl_arr
*/
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



/*
void display(const double ar[],int n)
{
  
  for(int i=0;i<n;++i)
    printf("%f \t",ar[i]);
 
}*/


