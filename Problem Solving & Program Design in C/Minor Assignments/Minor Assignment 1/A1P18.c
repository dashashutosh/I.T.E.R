#include<stdio.h>

int main()
{
  char msg[100];
  int N=109;
  printf("Enter a string message: ");
  scanf("%s",&msg);
  int i=1;
  while(i<=N)
  {
    if(i%10==1)
       printf("\n%dst %s\n",i,msg);
    
    else if(i%10==2)
       printf("%dnd %s\n",i,msg);

    else if(i%10==3)
       printf("%drd %s\n",i,msg);

    else  
      printf("%dth %s\n",i,msg);

    i++;
  }  

  return 0;
}