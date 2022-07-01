import java.util.Scanner;
class Pointtype
{
	int x;
	int y;
	void setPoints(int xc,int yc)
	{
		x=xc;
		y=yc;
	}
	
}
class Circletype extends Pointtype
{
	double r;
	double area;
	double circ;
	void setradius(Circletype o1,Circletype o2)
	
	{
		r=Math.pow(((o1.x-o2.x)*(o1.x-o2.x)+(o1.y-o2.y)*(o1.y-o2.y)),0.5);
		System.out.println("RADIUS IS"+" "+r);
	}
	void ac()
	{
		area=3.14*r*r;
		circ=2*3.14*r;
	}
	void display()
	{
		System.out.println(area+" "+circ);
			
		
	}
}
public class Prog_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coordinates of the center");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		Circletype o1=new Circletype();
		o1.setPoints(x1,y1);
		System.out.println("Enter another point on the circle");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		Circletype o2=new Circletype();
		o2.setPoints(x2,y2);
		
		
		
		o1.setradius(o1,o2);
		o1.ac();
		o1.display();
		

	}

}
