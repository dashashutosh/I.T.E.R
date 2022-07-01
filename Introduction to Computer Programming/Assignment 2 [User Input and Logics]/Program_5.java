import java.util.Scanner;


public class Program_5 {

	public static void main(String[] args) 
	{
		Scanner imput=new Scanner(System.in);
		System.out.println("Enter the starting velocity V0");
		double V0,V1,T,A;
		V0=imput.nextDouble();
		System.out.println("Enter the ending velocity V1");
		V1=imput.nextDouble();
		System.out.println("Enter the time span T");
		T=imput.nextDouble();
		A= (V1-V0)/T;
		System.out.println("The avarage A is"+A);
		
		
		
		
		

	}

}
