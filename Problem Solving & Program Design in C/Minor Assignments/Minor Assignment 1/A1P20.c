#include<stdio.h>
#define L 0.5
#include<math.h>

int main()
{
  double x,sum=0;
  printf("Enter the value of x: ");
  scanf("%lf",&x);
  
  double term=(x-1)/x;

  for(int i=0;i<9;i++)
  {
    sum+=term;
    term=L*pow(term,i+1);
  }

  printf("Natural logarithm of %0.1lf is %lf",x,sum);

  return 0;
}