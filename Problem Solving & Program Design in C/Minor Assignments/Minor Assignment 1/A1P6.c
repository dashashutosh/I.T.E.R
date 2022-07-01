#include<stdio.h>
#define PI 3.14159

int main()
{
  double area,radius,circum;
  int num_circ;

  //Input radius of the circle
  printf("\nEnter the radius of circle: ");
  scanf("%lf",&radius);

  //Input total no. of circles
  printf("\nEnter the number of circles: ");
  scanf("%d",&num_circ);

  //Calculate the area and circumference
  area = PI*radius*radius*num_circ;
  circum = 2*PI*radius*num_circ;

  //Output the area and circumference
  printf("For %d no. of circles, total circumference is %0.2lf and total area is %0.2lf\n",num_circ,circum,area);
  
  return 0;
}	