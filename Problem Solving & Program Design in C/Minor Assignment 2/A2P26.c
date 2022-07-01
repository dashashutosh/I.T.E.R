#include<stdio.h>
#include<math.h>

int main()
{
  double a[9]={15.3, 4, 90, 34, 2.5, 104, 7, 25, 82};

  double sum=0,sum_sd=0,mean,standard_dev;

  printf("\nGiven array elements are:\n");

  for(int i=0;i<9;i++)
  {
    printf("%0.1lf\n",a[i]);
    sum+=a[i];
    sum_sd+=a[i]*a[i];
  }

  mean = sum/9.0;
  standard_dev = sqrt((sum_sd/9.0)-(mean*mean));

  printf("\nMean value is %0.1lf\n",mean);
  printf("Standard Deviation value is %0.1lf\n",standard_dev);
  
  return 0;
}
