import java.util.Scanner;

class Studentdetails{
	String name;
	int roll;
	double marks;
	
	void setdata(String n,int r,double m)
	{
		name=n;
		roll=r;
		marks=m;
	}
	
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("roll is "+roll);
		System.out.println("mark is "+marks);
	}
}
public class dsa_a1p10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int b=sc.nextInt();
		double c=sc.nextDouble();
		
		Studentdetails s=new Studentdetails();
		s.setdata(a,b,c);
		s.display();
		
	}

}
