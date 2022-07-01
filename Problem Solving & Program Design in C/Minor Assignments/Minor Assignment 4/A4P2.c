#include <stdio.h>
#include <string.h>
void main()
{
  char s1[]="ITER-IBCS-SOA-IDS-SUM-CSE";
  char s2[]="iter ibcs soa ids sum";
  char *t,*p;
  t=strtok(s1,"-");
  p=strtok(s2," ");
  printf("For String 1 \n");
  while(t!=NULL)
  {
    printf("Token= %s \n ",t);
    t=strtok(NULL,"-");
  }
  printf("For String 2 \n");
  while(p!=NULL)
  {
    printf("Token= %s \n ",p);
    p=strtok(NULL," ");
  }
}
