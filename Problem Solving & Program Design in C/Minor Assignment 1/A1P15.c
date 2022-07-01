#include<stdio.h>

double Celsius(double d)
{
  return 10*d+20;
}
double fahrenheit(double c)
{
  return 1.8*c+32;
}
 
int main()
{
  double depth,celsius,Fahrenheit;
 
  //Input the Depth
  printf("\nEnter the depth: ");
  scanf("%lf",&depth);

  //Calculate the temperature in Celsius by calling Celsius function
  celsius=Celsius(depth);
  
  //Calculate the temperature in Fahrenheit by calling Fahrenheit function
  Fahrenheit=fahrenheit(celsius);

  //Display the Celsius and Fahrenheit degrees
  printf("Celsius temperature at depth %0.2lfkm is %0.2lfdegrees & Fahrenheit temperature is %0.2lfdegrees\n",depth,celsius,Fahrenheit);

  return 0;
}