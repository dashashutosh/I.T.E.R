import java.util.Scanner;
public class prog_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a,b,c,d,e,f:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double f=sc.nextDouble();
		double x= (e*d-b*f)/(a*d-b*c);
		double y= (a*f-e*c)/(a*d-b*c);
		if((a*d-b*c)==0)
		{
			System.out.println("eq.n has no sol.n");
		}
		else
		{
		 System.out.println("x is "+x+"y is "+y);	
		}
		
	}

}
