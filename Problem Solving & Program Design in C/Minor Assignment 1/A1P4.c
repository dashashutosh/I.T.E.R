#include<stdio.h>
#include<stdlib.h>

int main()
{
  FILE *fi, *fo;
  fi=fopen("input.txt","r");
  fo=fopen("output.txt","w");
  
  if(fi==NULL)
  {
    printf("\n Error: Cannot open file");
    exit(0);
  }

  int a,b,c;
  printf("Reading values of a, b and c from input.txt file\n");
  fscanf(fi, "%d ,",&a);
  fscanf(fi, "%d ,",&b);
  fscanf(fi, "%d ,",&c);

  printf("Initial value of a=%d ,b=%d and c=%d\n",a,b,c);
  
  a=a+b+c; 
  b=a-(b+c); 
  c=a-(b+c); 
  a=a-(b+c); 

  fprintf(fo,"a=%d ,b=%d and c=%d",a,b,c);
  fclose(fi);
  fclose(fo);

  return 0;
}