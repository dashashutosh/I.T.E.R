import java.util.Scanner;

public class prog_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a,b,c:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
        double D= (b*b)-4*a*c;
        double r1=(-b+Math.sqrt(D))/(2*a);
        double r2=(-b-Math.sqrt(D))/(2*a);
        if(D>0)
        {
        	System.out.println("eq.n has 2 real roots");
            System.out.println("roots are: "+r1+" and "+r2);
        }
        else if(D<0)
        {
        	System.out.println("eq.n has no real roots");
        }
        else if(D==0)
        {
        	System.out.println("eq.n has one root");
            System.out.println("roots are: "+r1+" and "+r2);
        }
        else
        {
        	System.out.println("invalid entry");
        }
        
        		

	}

}
