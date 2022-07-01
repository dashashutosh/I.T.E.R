# include<stdio.h>

void main(int argc,char *argv[])
{    
    int n,i,j;
    printf("%d",argc);
     for(i=0;i<argc;i++)
            printf("\n%s\n",argv[i]);
            
    sscanf(argv[1],"%d",&n);        
    
   
    
    
      for(j=1;j<10;j++)
        {
          for(i=2;i<=n;i++)
            printf("%d x %d = %d \t",i,j,j*i);
          printf("\n");
        }
            




}
