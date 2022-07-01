#define LINE_DELIMITER "\n"
#define WORD_DELIMITER " "
#include<stdio.h>
#include<string.h>

static int wordcount(char *);
double wordaverage(char *);


int main()
{
  char str[]="This is a line of text\n It is the second line\n then next line";
  double wordavg=wordaverage(str);
  printf("Word avg per line=%f\n",wordaverage);
  return 0;
}

static int wordcount(char *s)
{
  char *token,*sptr1;
  token=strtok_r(s,WORD_DELIMITER,&sptr1);
  int c=0,c1=0;
  while(token!=NULL)
  {
    printf("Token =%s\n",token);
    token=strtok_r(NULL,WORD_DELIMITER,&sptr1);
    c1++;
  }
  return c1;
}

double wordaverage(char *s)
{
  int linecount=0,words,sum=0;
  char *nextline,*sptr2;
  nextline=strtok_r(s,"\n",&sptr2);
  while(nextline!=NULL)
  {
    words=wordcount(nextline);
    sum=sum+words;
    nextline=strtok_r(NULL,"\n",&sptr2); linecount++;
  }
     return (double)sum/linecount;
    }
