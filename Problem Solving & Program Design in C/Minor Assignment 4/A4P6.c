#include<stdio.h>
#include<string.h>
int main(int argc, char *argv[])
{
  char *str = argv[1];
  char *delim = argv[2];
  char *subdelim = argv[3];
  char *token_ptr, *subtoken_ptr;
  char *token = strtok_r(str, delim, &token_ptr);
  int count=1;
  while(token != NULL)
  {
printf("\nTOKEN %d: %s\n",count++, token);
   char *subtoken = strtok_r(token, subdelim, &subtoken_ptr);
   printf("\tSUBTOKEN: ");
   while(subtoken != NULL)
   {
     printf("%s ", subtoken);
     subtoken = strtok_r(NULL, subdelim, &subtoken_ptr);
      }
   token = strtok_r(NULL, delim, &token_ptr);
  }
  return 0;
}
