#include <stdio.h>
#include <string.h>
int main()
{
  char str[] = "lesson-plan-usp-DOS";
  char *token;
  char *last;
  token = strtok_r(str, "-", &last);
  while (token!=NULL) 
  {
    printf("Token: %s\n", token);
    token = strtok_r(NULL, "-", &last);
  }
  return (0);
}
