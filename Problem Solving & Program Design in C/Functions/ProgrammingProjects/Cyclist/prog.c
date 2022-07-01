/*
Name - Nikhil Ranjan Nayak
Regd no - 1641012040
Desc - Cyclist's rate of acceleration and deceleration
*/
#include "stdio.h"
void instruct();
double calculate_accel(double, double, double);
double calculate_time(double, double);
void main()
{
	instruct();
}

void instruct()
{
	double initial_velocity, final_velocity, time, accel,time_rest;
	printf("\n Enter initial velocity - ");
	scanf("%lf", &initial_velocity);
	printf("\n Enter final velocity - ");
	scanf("%lf", &final_velocity);
	printf("\n Enter time in min - ");
	scanf("%lf", &time);
	time = time/60;
	accel = calculate_accel(initial_velocity, final_velocity, time);
	printf("\n Acceleration - %.2f miles/hr", accel);
	time_rest = calculate_time(initial_velocity, accel);
	printf("\n Time req to come to rest - %.2f hr \n", time_rest);
}

double calculate_accel(double vi, double vf, double time)
{
	double a = (vf - vi)/time;
	return a;
}

double calculate_time(double vi,double accel)
{
	double t = (0 - vi)/accel;
	return t;
}
