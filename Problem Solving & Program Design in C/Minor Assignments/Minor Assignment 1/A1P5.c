#include<stdio.h>
#define RATE 0.35

int main()
{
  
  float beg,end,dist_travelled,total_fare;
  printf("\n************************************\n");
  printf("  MILEAGE REIMBURSEMENT CALCULATOR\n");
  printf("************************************\n");
  
  //Enter the beginning & ending odometer reading
  printf("Enter beginning & ending odometer reading: ");
  scanf("%f %f",&beg,&end);

  //Calculating the total disance travelled  
  dist_travelled=end-beg;
  printf("You travelled: %0.1f miles.",dist_travelled);
 
  //Calculating the total fare it will cost at $0.35 per mile 
  total_fare=dist_travelled*RATE;
  printf(" At $%0.2f per mile,\nyour reimbursement is $%0.2f\n",RATE,total_fare);	

  return 0;
}	