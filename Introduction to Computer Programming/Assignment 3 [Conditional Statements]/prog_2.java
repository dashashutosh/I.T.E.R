import java.util.Scanner;

public class prog_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks:");
		double m=sc.nextDouble();
		if(m>=40)
		{
			System.out.println("you have passed");
		}
		else
		{
			System.out.println("sorry! you have failed");
		}


	}

}
