
#include <stdio.h>
#include <math.h>

typedef struct
{
  int i;
  char ch[2];
}s_type;

typedef union
{
  int i;
  char ch[2];
}a;

int main()
{
   s_type s1={512,"S"};
   a key;
   key.i=512;
   
   printf("%d %s \n",s1.i,s1.ch);
   
   printf("%d \n",key.i);  //512
   printf("%d \n",key.ch[0]);  //2
   printf("%d \n",key.ch[1]);   //0        
   return(0);
}














/*

   key.ch[0]=50;
   printf("%d \n",key.i);
   printf("%c \n",key.ch[0]);
   printf("%d \n",key.ch[1]);*/

