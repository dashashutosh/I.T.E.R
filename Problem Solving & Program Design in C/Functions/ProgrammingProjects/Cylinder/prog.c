/*
Name - Nikhil Ranjan Nayak
Regd no - 1641012040
Desc - Cylinder containers calculator
*/
#include "stdio.h"
#define PI 3.14
void instruct();
double calculate(double ,double , double , double);
double area(double, double);
void main()
{
	double radius, height, cost_per_square, quantity, total_cost, each_cost;
	
	instruct();
	
	scanf("%lf", &radius);
	scanf("%lf", &height);
	scanf("%lf", &cost_per_square);
	scanf("%lf", &quantity);
	
	each_cost = calculate(radius, height, cost_per_square, 1);
	total_cost = calculate(radius, height, cost_per_square, quantity);
	
	printf("\n Cost of each container - %.2f", each_cost);
	printf("\n Total Cost - %.2f \n", total_cost);
}

void instruct()
{
	printf("\n Enter the radius of the base of cylinder - ");
	printf("\n Enter the height of cylinder - ");
	printf("\n Enter the cost per square centimeters of cylinder - ");
	printf("\n Enter quantity - \n");
}

double calculate(double radius, double height, double cost_per_square, double quantity)
{
	double cost = cost_per_square * area(radius, height) * quantity;
	return cost;
}

double area(double radius, double height)
{
	double tsa = (2 * PI * radius) + (2 * PI * radius * height);
}
