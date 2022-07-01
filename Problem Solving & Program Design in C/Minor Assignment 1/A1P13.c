#include<stdio.h>
#include<math.h>
#define PI 3.14159

double compute(int,int,int);

int main()
{
  int b=3,c=4,angle=60;
  double res=compute(b,c,angle);
 
  printf("side a is: %0.1lf",res);
  return 0;
}

double compute(int b,int c,int angle)
{
  double val= cos((PI/180)*angle);
  double a=(b*b)+(c*c)-(2*b*c*val);
  return sqrt(a);
}