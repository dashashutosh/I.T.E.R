#include<stdio.h>
#include<math.h>

double findDistance(double,double,double,double,double,double);

int main()
{
  double x1,y1,z1,x2,y2,z2;
  printf("Enter co-ordinates of 1st point: ");
  scanf("%lf %lf %lf",&x1,&y1,&z1);

  printf("Enter co-ordinates of 2nd point: ");
  scanf("%lf %lf %lf",&x2,&y2,&z2);

  double d=findDistance(x1,y1,z1,x2,y2,z2);

  printf("Distance between the points: %0.2lf",d);

  return 0;
}

double findDistance(double x1,double y1,double z1,double x2,double y2,double z2)
{
  double a,b,c,d;
  a=(x1-x2)*(x1-x2);
  b=(y1-y2)*(y1-y2);
  c=(z1-z2)*(z1-z2);

  d=sqrt(a+b+c);
  return d;
}
  