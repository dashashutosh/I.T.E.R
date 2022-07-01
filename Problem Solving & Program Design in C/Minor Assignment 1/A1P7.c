#include<stdio.h>
#define PI 3.14159

double cylinderArea(double radius);
double cylinderVolume(double area,double length);
 
int main()
{
  double radius; 
  double length; 
  double area;   
  double volume;
 
  //Input the radius and length 
  printf("\nEnter the radius and length of a cylinder: ");
  scanf("%lf %lf",&radius,&length);

  //Calculate the area
  area=cylinderArea(radius);

  //Calculate the volume
  volume=cylinderVolume(area,length);
  
  printf("The area of cylinder is %0.4lf\n",area);
  printf("The volume of cylinder is %0.4lf\n",volume);

  return 0;
}

double cylinderArea(double radius)
{
  return PI*radius*radius;
}

double cylinderVolume(double area,double length)
{
  return area*length;
}