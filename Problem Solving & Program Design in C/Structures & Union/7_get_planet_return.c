
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
struct planet get_planet(void);

int
main( )
{

	struct planet p1={"Earth",4567,1,223.5,24.5}, 	              
	              p3={"Earth",4567,1,223.5,24.5},
	              p2;
	int status;
        
        printf ( "\nEnter Name, Diameter, Moons, Orbit_time, Rotation_time \n" );
        p2=get_planet();               	                             	
	display_planet(p1);   		
        
        display_planet(p2);

	return (0);
}

/*
* Gets and returns a planet_t structure
*/
struct planet
get_planet(void)
{
	struct planet planetX;

	scanf("%s%lf%d%lf%lf",  planetX.name,
				&planetX.diameter,
				&planetX.moons,
				&planetX.orbit_time,
				&planetX.rotation_time);
	return (planetX);
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
	

