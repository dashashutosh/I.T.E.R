

#include <stdio.h>


int
main(int argc, char*argv[])
{
     double a,b;
     sscanf(argv[1],"%lf",&a);
     sscanf(argv[2],"%lf",&b);
     printf("Sum of %f and %f is %f",a,b,(a+b));
	return(0);
}

