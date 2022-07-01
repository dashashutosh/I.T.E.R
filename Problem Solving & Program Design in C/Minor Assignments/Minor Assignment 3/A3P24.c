#include<stdio.h>
#include<stdlib.h>
#include <string.h>
char *trim(char *string)
{
    int stPos,endPos;
    int len=strlen(string);
    for(stPos=0;stPos<len && string[stPos]==' ';++stPos);
    for(endPos=len-1;endPos>=0 && string[endPos]==' ';--endPos);
    char *trimmedStr = (char*)malloc(len*sizeof(char));
    strncpy(trimmedStr,string+stPos,endPos+1);
    return trimmedStr;
}

int main()
{
    char sr[100];
    printf("\nEnter a string:\n");
    scanf("%[^\n]s",sr);
    char *string =trim(sr);
    printf("\nAfter removing leading and trailing spaces, string is:\n%s\n",string);    
    return 0;
}