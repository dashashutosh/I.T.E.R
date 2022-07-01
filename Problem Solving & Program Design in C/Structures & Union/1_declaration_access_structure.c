
#include <stdio.h>
#include <math.h>

typedef struct planet PLANET_T;

extern struct planet *ptr;

void scan_planet(struct planet *ptr);

struct planet
{
	char name[40] ;
	double diameter;
	int moons;
	double orbit_time;
	double rotation_time;	
};


void display_planet(struct planet pf1)
{
   	printf ( "\n Information about a planet of a solar system:: \n" ) ;
	printf ( "\n Name %18s \n Diameter %14.2f \n Moons %17d \n Orbit Time %12.2f \n Rotation time %9.2f \n", pf1.name, 
	                              pf1.diameter, 
	                              pf1.moons,
	                              pf1.rotation_time,
	                              pf1.orbit_time);
}

int
main( )
{

	PLANET_T p1, p2 ;
	printf ( "\nEnter name,diameter,moons,orbit_time, rotation_time \n" ) ;
	
	scan_planet(&p1);
	
	printf ( "\nAnd this is what you entered using POINTERS" ) ;
	display_planet(p1);

	
	return (0);
}

void scan_planet(PLANET_T *ptr)
{
                       scanf ( "%s %lf %d %lf %lf", ptr->name, 
	                            &ptr->diameter, 
	                            &ptr->moons,
	                            &ptr->orbit_time,
	                            &ptr->rotation_time);
}	                            
	

