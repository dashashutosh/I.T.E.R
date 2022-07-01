#include<stdio.h>
#include<math.h>

void compute_root(double,double,double);

int main()
{
  double a,b,c;

  printf("Enter the coefficients for the quadratic equation: ");
  scanf("%lf %lf %lf",&a,&b,&c);

  compute_root(a,b,c);

  return 0;
}

void compute_root(double a,double b,double c)
{
  double root1,root2,D;
  D=(b*b)-(4*a*c);
  
  if(D>0)
  {
    root1=(-b+sqrt(D))/(2*a);
    root2=(-b-sqrt(D))/(2*a); 
    printf("Roots of the equation are %0.2lf %0.2lf",root1,root2); 
  }

  else if(D==0)
  {
    root1=(-b+sqrt(D))/(2*a);
    printf("Roots of the equation are %0.2lf %0.2lf",root1,root1);
  }
  
  else
    printf("There are no real roots for the equation");
}