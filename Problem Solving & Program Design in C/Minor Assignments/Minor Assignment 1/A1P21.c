#include<stdio.h>


int factorial(int);
int prime(int);
int oddEven(int);

int main()
{
  char ch;
  int n=5;
  
  for(;;)
  {
    //printf("Enter a no. ");
    //scanf("%d",&n);

    printf("Enter your choice: ");
    scanf("%c",&ch);

    if(ch=='A')
    {
      int ans=factorial(n);
      printf("Factorial is %d",ans);
    }
   
    else if(ch=='B')
    {
      int ans=prime(n);
      printf("Is %d a prime no. ?: %d",n,ans);
    }
 
    else if(ch=='C')
    {
      int ans=oddEven(n);
      if(ans==1)
        printf("%d is Even",n);
      else
        printf("%d is Odd",n);
    }

    else if(ch=='D')
    {
      break;
    }

    else
      printf("invalid choice");
  }
 
  return 0;
}

int factorial(int n)
{
  int p=1;
  
  for(int i=1;i<=n;i++)
      p*=i;
  
  return p;
}

int prime(int n)
{
  int cnt=1;
  for(int i=2;i<=n;i++)
  {
    if(n%i==0)
	cnt++;
  }
  if(cnt==2)
     return 1;
  return 0;
}

int oddEven(int n)
{
  if(n%2==0)
     return 1;
  return 0;
}