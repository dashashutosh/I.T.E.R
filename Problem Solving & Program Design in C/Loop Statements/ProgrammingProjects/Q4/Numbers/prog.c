/*
Name - Nikhil Ranjan Nayak
Regd no - 1641012040
Desc - To find the smallest, largest, and average values in a collection of N numbers.
*/
#include "stdio.h"
void main()
{
	int n, i, sum = 0, largest, smallest, t;
	double average;
	printf("\nEnter number of inputs - ");
	scanf("%d\n", &n);
	for(i = 0; i < n; i++)
	{
		if(i > 0)
		{
			scanf("%d", &t);
			if(t > largest)
				largest = t;
			if(t < smallest)
				smallest = t;
			sum += t;
		}
		else
		{
			scanf("%d", &t);
			largest = t;
			smallest = t;
			sum += t;
		}
	}
	average = sum / n;
	printf("\nLargest - %d", largest);
	printf("\nSmallest - %d", smallest);
	printf("\nSum - %d", sum);
	printf("\nAverage - %.2f\n", average);
}
