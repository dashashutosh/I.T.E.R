/*
Name - Nikhil Ranjan Nayak
Regd no - 1641012040
Desc - Approximate to 2 places
*/
#include "stdio.h"
#include "math.h"
double scale(double, int);
int add(double);
void main()
{
	double n, x, scaled, final;
	printf("\n Enter a number - ");
	scanf("%lf", &n);
	scaled = scale(n, 2);
	final = add(scaled)*0.01;
	printf("\n Rounded Number - %.2f", final);
}

double scale(double x, int n)
{
	double scale_factor;
	scale_factor = pow(10, n);
	return (x * scale_factor);
}

int add(double x)
{
	return (int)(x + 0.5);
}
