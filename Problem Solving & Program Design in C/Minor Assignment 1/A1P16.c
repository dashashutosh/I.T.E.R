#include<stdio.h>
#include<math.h>

double SpeedRatio(double M,double m)
{
  return pow((M/m),1/5);
}
 
int main()
{
  double maxSpeed,minSpeed,ratio;
 
  //Input the maxSpeed and minSpeed
  printf("\nEnter the max speed & min speed: ");
  scanf("%lf %lf",&maxSpeed,&minSpeed);

  //Calculate the speed ratio by calling SpeedRatio function
  ratio=SpeedRatio(maxSpeed,minSpeed);
  
  //Display the ratio
  printf("The ratio between successive speeds of a six-speed gearbox with maximum speed %0.2lfrpm and minimum speed %0.2lfrpm is %0.2lf\n",maxSpeed,minSpeed,ratio);

  return 0;
}