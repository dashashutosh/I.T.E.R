
#include <stdio.h>
#include <math.h>


struct planet
{
	char name[40] ;
	double diameter;
	int moons;
	double orbit_time;
	double rotation_time;	
};

void display_planet(struct planet pf1);
 int planet_equal(struct planet ,struct planet );
 
 
/*struct planet scanf_planet1()
 {
    int status;
    struct planet p2;
    for (status=scanf ( "%s%lf%d%lf%lf", p2.name, 
	                             &p2.diameter, 
	                             &p2.moons,
	                             &p2.orbit_time,
	                             &p2.rotation_time); status!=5 && status!=EOF;
	      status=scanf ( "%s%lf%d%lf%lf", p2.name, 
	                             &p2.diameter, 
	                             &p2.moons,
	                             &p2.orbit_time,
	                             &p2.rotation_time)) 
	                             
	              printf(" %d Invalid input. Try again !!!\n",status);
	              
	              
	              return(p2);
	           }*/
 
 
 

int
main( )
{

	struct planet p1={"Earth",4567,1,223.5,24.5}, 	              
	              p3={"Earth",4567,1,223.5,24.5},
	              p2;
	              
	          //    p2=scanf_planet1();
	              
        //struct planet *pp2;            
	//pp2=&p2;
	 
	int status;
                    
        printf ( "\nEnter Name, Diameter, Moons, Orbit_time, Rotation_time \n" );
        
	for (status=scanf ( "%s%lf%d%lf%lf", p2.name,
	                             &p2.diameter,       
	                             &p2,moons,
	                             &p2.orbit_time,
	                             &p2.rotation_time); status!=5 && status!=EOF;
	      status=scanf ( "%s%lf%d%lf%lf", p2.name,
	                             &p2.diameter, 
	                             &p2.moons,
	                             &p2.orbit_time,
	                             &p2.rotation_time)) 
	                             
	              printf(" %d Invalid input. Try again !!!\n",status);
		                                                         	                             	                                                         	                             	
	display_planet(p1);   		
        
        if (!planet_equal(p1,p2))
            display_planet(p2);

	return (0);
}

/*
 * Determines whether or not the components of planet_1 and planet_2 match
 */
   int
   planet_equal(struct planet fplanet_1, /* input - planets to */
                struct planet fplanet_2) /* compare */
   {
	return (strcmp(fplanet_1.name, fplanet_2.name) == 0 &&
 	               fplanet_1.diameter == fplanet_2.diameter &&
                       fplanet_1.moons == fplanet_2.moons &&
                       fplanet_1.orbit_time == fplanet_2.orbit_time &&
                       fplanet_1.rotation_time == fplanet_2.rotation_time);
   }

void display_planet(struct planet pf1)
{
   	printf ( "\n Information about a planet of a solar system:: \n" ) ;
	printf ( "\n Name %18s \n Diameter %14.2f \n Moons %17d \n Orbit Time %12.2f \n Rotation time %9.2f \n", pf1.name, 
	                              pf1.diameter, 
	                              pf1.moons,	                              
	                              pf1.orbit_time,
	                              pf1.rotation_time);
}
	
	
	
	
	
/*for (status=scanf ( "%s%lf%d%lf%lf", (*pp2).name, 
	                             p2diameter, 
	                             p2moons,
	                             p2orbit_time,
	                             p2rotation_time); status!=5 && status!=EOF;
	      status=scanf ( "%s%lf%d%lf%lf", (*pp2).name, 
	                             p2diameter, 
	                             p2moons,
	                             p2orbit_time,
	                             p2rotation_time)) 
	                             
	              printf(" %d Invalid input. Try again !!!\n",status);	*/
	
	
	
	
	
	
	
/*int
scan_planet(struct planet *plnp) /* output - address of planet_t structure to fill 
{
	int result;
	//printf("%u",(*plnp));

	result = scanf("%s%lf%d%lf%lf", (*plnp).name,
					&(*plnp).diameter,
					&(*plnp).moons,
					&(*plnp).orbit_time,
					&(*plnp).rotation_time);
	if (result == 5)
		result = 1;
	else if (result != EOF)
		result = 0;
	return (result);
}*/
