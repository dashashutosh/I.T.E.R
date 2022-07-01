#include <stdio.h>
        


/*enum WE_days
{
 	  Saturday,Sunday
};*/

enum w_days
{
 	  Monday=100,Tuesday,Wednesday,Thursday=500,Friday,Saturday,Sunday
};

int
main(void)
{

        enum w_days today=Friday, tomorrow;        
       
        printf("%d",today);

	return (0);
}
















/* if(today==Monday)
        	tomorrow=Tuesday;
        else
                tomorrow=(enum w_days)today+1; */	
