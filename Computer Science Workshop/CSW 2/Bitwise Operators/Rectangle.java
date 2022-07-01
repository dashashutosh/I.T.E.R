package Chapter_5;

import java.util.*;

public class Rectangle {
	
	public int x,y,width,height;
	
	public Rectangle() {}
	
	public Rectangle(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public boolean islntersect(Rectangle R1 , Rectangle R2) {
		
		return (R1.x <= R2.x + R2.width) && (R1.x + R1.width >= R2.x)
			&& (R1.y <= R2.y + R2.height) && (R1.y + R1.height >= R2.y);
	}
	
	public void Intersect(Rectangle R1, Rectangle R2) {
		
		System.out.println("The x&y coordinates and width&height for the rectangle formed by intersection:");
		System.out.println("x: "+ (Math.max(R1.x , R2.x))+  
			    					"\ny: "+ (Math.max(R1.y , R2.y))+ 
			    					"\nwidth: "+ (Math.min(R1.x + R1.width, R2.x + R2.width) - Math.max(R1.x , R2.x))+ 
			    					"\nheight: "+ (Math.min(R1.y + R1.height, R2.y + R2.height) - Math.max(R1.y , R2.y)) ); 
	}
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the x&y coordinates and width&height for 1st rectangle");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int w1=sc.nextInt();
		int h1=sc.nextInt();
		
		System.out.println("Enter the x&y coordinates and width&height for 2nd rectangle");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int w2=sc.nextInt();
		int h2=sc.nextInt();
		
		Rectangle R1=new Rectangle(x1, y1, w1, h1);
		Rectangle R2=new Rectangle(x2, y2, w2, h2);
		
		Rectangle R3=new Rectangle();
		boolean k=R3.islntersect(R1, R2);
		
		if(k==true) {
			System.out.println("Rectangles Intersect");
			Rectangle R=new Rectangle();
			R.Intersect(R1, R2);
		}
		else
			System.out.println("Rectangles don't Intersect");
		
		
	}

}
