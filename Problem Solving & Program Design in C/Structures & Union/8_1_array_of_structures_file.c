
#include <stdio.h>
#include <math.h>
# define MAX 9

struct planet
{
	char name[40] ;
	double surfT;
	double rotation_time;	
	double orbit_time;		
        double distance_sun;
	double diameter;
	int size_rank;
	int moons;
	double den;
	double grav;
};

void display_planet(struct planet pf1);
int scan_planet(FILE* in, struct planet *plnp);

int
main( )
{

	struct planet planets[MAX];
	int status,i;
	
	FILE* in=fopen("planet.txt","r");
                        
        for(i=0;i<MAX;i++)        
            {
               status=scan_planet(in, &planets[i]);
               if(status!=1)
                 {
                    printf("Some wrong with the input !!! Try again.");
                    status=scan_planet(in, &planets[i]);                 
                 }
            }  
            
            printf ( "\n           ************************************************************************************************* ***********************************************\n  ");       
        
        printf ( "\n             Name           SurfT         Rotation_time    Orbit_time  Distance_sun       Diameter      size_rank         Moons       Density      Gravity\n  ");
        printf ( "\n          ************************************************************************************************* ***********************************************\n  ");
        for(i=0;i<MAX;i++)                   	                    	     display_planet(planets[i]);   		
  	  
         fclose(in);
	return (0);
}

int
scan_planet(FILE* in, struct planet *plnp) /* output - address of planet_t structure to fill */
{
	int result;
        //printf ( "\nEnter Name, Diameter, Moons, Orbit_time, Rotation_time \n" );
	result = fscanf(in,"%s%lf%lf%lf%lf%lf%d%d%lf%lf", plnp->name,
					    &plnp->surfT,
				            &plnp->rotation_time,
					    &plnp->orbit_time,
        				    &plnp->distance_sun,
					    &plnp->diameter,
					    &plnp->size_rank,
					    &plnp->moons,
					    &plnp->den,
					    &plnp->grav);
	
	if (result == 10)
		result = 1;
	else if (result != EOF)
		result = 0;
	return (result);
}


void display_planet(struct planet pf1)
{
   	//printf ( "\n Information about a planet of a solar system:: \n" ) ;
	printf ( "\n %18s %14.2f %14.2f %14.2f %14.2f %14.2f %17d %17d %12.2f %9.2f \n", pf1.name,
	                                        pf1.surfT,
	                                        pf1.rotation_time,
	                                        pf1.orbit_time,
	                                        pf1.distance_sun,
	                                        pf1.diameter,
	                                        pf1.size_rank,
	                                        pf1.moons,
	                                        pf1.den,
	                                        pf1.grav);
}
	

