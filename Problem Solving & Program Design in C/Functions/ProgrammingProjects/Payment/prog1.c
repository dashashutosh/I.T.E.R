/*
Name - Nikhil Ranjan Nayak
Regd no - 1641012040
Desc - Payment Calculator
*/
#include "stdio.h"
#include "math.h"
double payment_cal(double, double, int);
double principle_cal(double, double);
int main()
{
	int total_payments;
	double downpayment, price, annual_interest, principle,payment;
	printf("\n Enter purchase price - $ ");
	scanf("%lf", &price);
	printf("\n Enter down payment- $ ");
	scanf("%lf", &downpayment);
	printf("\n Enter annual interest- ");
	scanf("%lf", &annual_interest);
	printf("\n Enter total payments- ");
	scanf("%d", &total_payments);
	principle = principle_cal(price, downpayment);
	payment = payment_cal(principle, annual_interest, total_payments);
	printf("\n Amount borrowed - $ %.2f ", principle);
	printf("\n Monthly payment - $ %.2f ", payment);
}

double payment_cal(double principle, double annual_interest, int total_payments)
{
	double payment = (((double)annual_interest/1200)*principle)/(1 - pow((1 + annual_interest/1200), -1*total_payments));
	return payment; 
}

double principle_cal(double price, double downpayment)
{
	// double principle = price/(1 + (annual_interest*total_payments));
	double principle = price - downpayment;
	return principle;
}

