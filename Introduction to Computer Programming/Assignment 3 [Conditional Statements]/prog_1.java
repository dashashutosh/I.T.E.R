import java.util.Scanner;


public class prog_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		double hei=sc.nextDouble();
		if(hei>=6)
		{
			System.out.println("i am tall");
		}
		else
		{
			System.out.println("i am not tall");
		}
	}

}
