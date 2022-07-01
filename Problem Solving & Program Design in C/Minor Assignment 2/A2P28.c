#include<stdio.h>
#include<math.h>

int main()
{
  double sqroot[11];
  
  printf("\nArray having square roots from 0 to 10: ");
  for(int i=0;i<11;i++)
  {
    sqroot[i]=sqrt(i);
    printf("%0.1lf ",sqroot[i]);
  }

  int cubes[11];

  printf("\nArray having cubes from 0 to 10: ");
  for(int i=0;i<11;i++)
  {
    cubes[i]=i*i*i;
    printf("%d ",cubes[i]);
  }
  printf("\n");

  return 0;
}
