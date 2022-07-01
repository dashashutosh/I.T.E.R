#include<stdio.h>
#include<stdlib.h>

int main()
{
  int m,n,side1,side2,hypotenuse;
  
  printf("\n**********************\n"); 
  printf("  PYTHOGOREAN TRIPLET\n");
  printf("**********************\n");

  FILE *fi;
  fi=fopen("input.txt","r");
  
  if(fi==NULL)
  {
    printf("\n Error: Cannot open file");
    exit(0);
  }

  printf("Reading the values of m & n from input.txt file:\n");
  fscanf(fi, "%d ,",&m);
  fscanf(fi, "%d ,",&n);
  
  side1 = (m*m)-(n*n);
  side2 = 2*m*n;
  hypotenuse = (m*m)+(n*n);

  printf("The sides of the right triangle are:\nside1 = %d\nside2 = %d\nhypotenuse = %d\n",side1,side2,hypotenuse);
  
  return 0;
}	