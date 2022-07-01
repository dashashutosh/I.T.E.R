package assignment_2;
import java.util.Scanner;
public class a2p6 {

	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t= new Triangle();
		Square s=new Square();
		c.area();
		t.area();
		s.area();

	}

}

abstract class Shape
{
	Scanner sc=new Scanner(System.in);
	abstract void area();
}

class Circle extends Shape
{
	
	void area()
	{
		System.out.println("enter the radius of the circle:");
		double r=sc.nextDouble();
		System.out.println("area of circle = "+3.14*r*r);
	}
}

class Triangle extends Shape
{
	
	void area()
	{
		System.out.println("enter the base & height of the triangle:");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		System.out.println("area of triangle = "+0.5*b*h);
	}
}

class Square extends Shape
{
	
	void area()
	{
		System.out.println("enter the side of square:");
		double s=sc.nextDouble();
		System.out.println("area of square = "+s*s);
	}	
}		