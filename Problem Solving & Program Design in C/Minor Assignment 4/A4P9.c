#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
  char str3[]="ITER:IBCS;SOA:Pot*Hot";
  char str4[]="*ITER:IBCS;SOA:Pot*Hot:";
  char str5[]="TOC;;PLC,USP;";

  char *last;
  char *token3;
  token3=strtok_r(str3,":;*",&last);
  printf("\nProgram 3 using strtok_r\n");
  while(token3!=NULL)
  {
    printf("Token=%s\n",token3);
    token3=strtok_r(NULL,":;*",&last);
  }
  printf("--------------------------\n");

  char *token4;
  token4=strtok_r(str4,":;*",&last);
  printf("Program 4 using strtok_r\n");
  while(token4!=NULL)
  {
    printf("Token=%s\n",token4);
    token4=strtok_r(NULL,":;*",&last);
  }
  printf("--------------------------\n"); 
  
  char *token5;
  token5=strtok_r(str5,";,",&last);
  printf("Program 5 using strtok_r\n");
  while(token5!=NULL)
  {
    printf("Token=%s\n",token5);
    token5=strtok_r(NULL,":;*",&last);
  }
   
  return 0;
}
