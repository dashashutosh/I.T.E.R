import java.util.Scanner;


public class Program_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double mins,yrs,days;
		System.out.println("enter total minutes:");
		mins=sc.nextDouble();
		yrs=mins/525600;
		days=mins/1440;
		System.out.println(mins+"minutes is "+yrs+"years and "+days+"days");
		

	}

}
