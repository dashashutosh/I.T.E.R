import java.util.Scanner;
public class prog_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 ages rahul,ayush,ajay:");
		int rahul=sc.nextInt();
		int ayush=sc.nextInt();
		int ajay=sc.nextInt();
		if(rahul>ayush)
		{
			if(rahul>ajay)
			{
				System.out.println("rahul is eldest");
			}
			else
			{
				System.out.println("ajay is eldest");
			}
		
		}
		else
		{
			if(ayush>ajay)
			{
			System.out.println("ayush is eldest");
			}
			else
			{
				System.out.println("ajay is eldest");
			}
		}

	}

}
