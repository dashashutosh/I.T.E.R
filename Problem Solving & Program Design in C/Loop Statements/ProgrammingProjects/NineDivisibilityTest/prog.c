/*
Name - Nikhil Ranjan Nayak
Regd no - 1641012040
Desc - 9 divisibility test of a number.
*/
#include "stdio.h"
void divisibility(int);
void main()
{
	int n;
	printf("\nEnter a number - ");
	scanf("%d", &n);
	
	divisibility(n);
	divisibility(154368);
	divisibility(621594);
	divisibility(123456);
}

void divisibility(int n)
{
	int sum = 0,r;
	printf("\n");
	while(n != 0)
	{
		r = n % 10;
		n = n /10;
		printf("%d ",r);
		sum += r;
	}
	
	if((sum % 9) == 0)
		printf("\nThe number is divisible by 9\n");
	else
		printf("\nThe number is not divisible by 9\n");
}
