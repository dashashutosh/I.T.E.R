class point{
int x,y;
	
	void setpoint(int i, int j)
	{
		x=i; y=j;
	}
	
	void finddistance(point p1, point p2)
	{
		System.out.println("distance between the 2 points:");
		System.out.println(  (double)(Math.sqrt ( (p1.x-p2.x)*(p1.x-p2.x) )+( (p1.y-p2.y)*(p1.y-p2.y) ) )  );
	}
}
public class a1p11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x1,y1,x2,y2;
		System.out.println("enter co-ordinates of 1st point:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("enter co-ordinates of 2nd point:");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		point p1=new point();
		p1.setpoint(x1,y1);
		point p2=new point();
		p2.setpoint(x2,y2);
		
		point p=new point();
		p.finddistance(p1,p2);

	}

}

