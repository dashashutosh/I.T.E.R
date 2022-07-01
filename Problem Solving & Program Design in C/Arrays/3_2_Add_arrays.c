
/*
* Adds corresponding elements of arrays ar1 and ar2, storing the result in
* arsum. Processes first n elements only.
* Pre: First n elements of ar1 and ar2 are defined. arsum’s corresponding
* actual argument has a declared size >= n (n >= 0)
*/

#include <stdio.h>
#define ARRLEN 5
void
add_arrays(const double *ar1, /* input - */
	   const double ar2[], /* arrays being added */
	   double arsum[], /* output - sum of corresponding elements of ar1 and ar2 */
	   int n) /* input - number of element pairs summed */
{
	int i;	

	/* Adds corresponding elements of ar1 and ar2 */
	for (i = 0; i < n; ++i)
		arsum[i] = ar1[i] + ar2[i];
}

void display(const double ar[],int n)
{
  
  for(int i=0;i<n;++i)
    printf("%f \t",ar[i]);
 
}


int main()
{
  double arr1[ARRLEN],arr2[ARRLEN];
  double i;
  double arrsum[ARRLEN]; 
  
  printf("Enter elements of First array:\n");
  for(int i=0;i<ARRLEN;++i)
    scanf("%lf",&arr1[i]);
    
  printf("Enter elements of Second array:\n");
  for(int i=0;i<ARRLEN;++i)
    scanf("%lf",&arr2[i]);
    
  add_arrays(arr1,arr2,arrsum,ARRLEN);
  
  printf("First array is:\n");
  display(arr1,ARRLEN);
  
  printf("\nSecond array is:\n");
  display(arr2,ARRLEN);
    
  printf("\nSum of two input array is:\n");
  display(arrsum,ARRLEN);
  
 
  return(0);
}
