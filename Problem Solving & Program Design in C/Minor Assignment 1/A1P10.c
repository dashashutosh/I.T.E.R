#include<stdio.h>

int main()
{
  float ly,by,lh,bh,area_yard,area_house,area_grass,time;
  
  printf("\n**********************\n"); 
  printf("  RECTANGULAR YARD\n");
  printf("**********************\n");

  //Enter the length and breadth of yard
  printf("Enter the length & breadth of yard:\n");
  scanf("%f %f",&ly,&by);
  
  //Enter the length and breadth of house
  printf("Enter the length & breadth of house:\n");
  scanf("%f %f",&lh,&bh);
  
  //Calculating the area of the yard, house & grass to be cut
  area_yard = ly*by;
  area_house = lh*bh;
  area_grass = area_yard-area_house; 

  //Calculating time required to cut down the grass
  time = area_grass*0.5; 
  printf("Time required to cut the grass at rate of 2sq.ft/sec is %0.2f seconds\n",time);
  
  return 0;
}	