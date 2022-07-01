#include<stdio.h>

void sum_n_avg(double, double, double, double*, double*);

int main()
{
  double one, two, three, sum_of_3, avg_of_3;
  
  printf("\nEnter three numbers:\n");
  scanf("%lf %lf %lf", &one, &two, &three);

  sum_n_avg(one, two, three, &sum_of_3, &avg_of_3);
  
  printf("Sum is %0.1lf\n",sum_of_3);
  printf("Average is %0.1lf\n",avg_of_3);

  return 0;
}

void sum_n_avg(double one, double two, double three, double *sum, double *avg)
{
  *sum=one+two+three;
  *avg=*sum/3.0;
}