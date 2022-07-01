

#include <stdio.h>
#include <stdlib.h>
#define ARRLEN 5

/*
* Finds the position of the smallest element in the subarray
* list[first] through list[last].
* Pre: first < last and elements 0 through last of array list are defined.
* Post: Returns the subscript k of the smallest element in the subarray;
* i.e., list[k] <= list[i] for all i in the subarray
*/



int
get_min_range(const int data[], /* input - arrayof numbers */
            int First, int last) /* input - number of elements */
{
	int i, small_sub; /* subscript of smallest value so far */
	small_sub = First; /* Assume first element is smallest. */
	for (i = First+1; i <=last; ++i)
		if (data[i] < data[small_sub])
			small_sub = i;
	return (small_sub);
}


/*
* Sorts the data in array list
* Pre: first n elements of list are defined and n >= 0
*/
void
select_sort(int list[], /* input/output - array being sorted */
            int n) /* input - number of elements to sort */
{
	int fill, /* first element in unsorted subarray */
	    temp, /* temporary storage */
	    index_of_min; /* subscript of next smallest element */

	for (fill = 0; fill < n-1; ++fill) {
	/* Find position of smallest element in unsorted subarray */
		index_of_min = get_min_range(list, fill, n-1);

	/* Exchange elements at fill and index_of_min */
		if (fill != index_of_min) {
			temp = list[index_of_min];
			list[index_of_min] = list[fill];
			list[fill] = temp;
		}
	}
}


int
main(void)
{
  int arr1[ARRLEN];
  int i;

  printf("Enter elements of the array:\n");
  for(i=0;i<ARRLEN;++i)
    scanf("%d",&arr1[i]);
  
  select_sort(arr1,ARRLEN);
  
  printf("Sorted Array :\n"); 
  for(i=0;i<ARRLEN;++i)
    printf("%d \n",arr1[i]);   
  return(0);           
}



