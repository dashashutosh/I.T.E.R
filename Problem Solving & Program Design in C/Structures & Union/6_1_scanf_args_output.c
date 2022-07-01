
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
int scan_planet(struct planet *plnp);

int
main( )
{

	struct planet p1={"Earth",4567,1,223.5,24.5}, 	              
	              p3={"Earth",4567,1,223.5,24.5},
	              p2;
	int status;
        
        printf ( "\nEnter Name, Diameter, Moons, Orbit_time, Rotation_time \n" );
        scan_planet(&p2);
                         	                             	
	display_planet(p2);   		
        
        

	return (0);
}

int
scan_planet(struct planet *plnp) /* output - address of planet_t structure to fill */
{
	int result;	

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
	

