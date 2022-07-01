/*
* Returns the largest of the first n values in array list
* Pre: First n elements of array list are defined and n > 0
*/

#include <stdio.h>


int
get_max(const int list[], /* input - list of n integers */ 
        int n) /* input - number of list elements to examine */
{
	int i,
	cur_large; /* largest value so far */
	/* Initial array element is largest so far. */
	cur_large = list[0];
	list[0]=12;

	/* Compare each remaining list element to the largest so far;save the larger */
	for (i = 1; i < n; ++i)
		if (list[i] > cur_large)
			cur_large = list[i];

	return (cur_large);
}

int main()
{
  int item_list[]={12,3,4,21,67,34,1,89,45};
  int largest=get_max(item_list,9);
  printf("The largest element in the given list is: %d",largest);
  return(0);
}
