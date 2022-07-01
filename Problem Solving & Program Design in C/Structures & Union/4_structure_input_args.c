
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

int
main( )
{

	struct planet p1={"Earth",4567,1,223.5,24.5}, 
	              p2={"Mars",45345,2,23.5,1234.5} ;
	              
        printf ( "\nEnter Name, Diameter, Moons, Orbit_time, Rotation_time \n" ) ;
        
        display_planet(p1);
       
        
	
       // display_planet(p1);
        display_planet(p2);

	return (0);
}

void display_planet(struct planet pf1)  //pf1=p1
{
 
   printf ( "\n Information about a planet of a solar system:: \n" ) ;
	printf ( "\n Name %18s \n Diameter %14.2f \n Moons %17d \n Orbit Time %12.2f \n Rotation time %9.2f \n", pf1.name, 
	                                      pf1.diameter, 
	                                      pf1.moons,
	                                      pf1.rotation_time,
	                                      pf1.orbit_time);
   	

}
	

