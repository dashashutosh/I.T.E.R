import java.util.*;
public class a3p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your lucky no.");
		int n=sc.nextInt();
		try
		{
			if(n<0)
				throw new NumberFormatException("no. entered is -ve");
			else
				System.out.println("your lucky no. is "+n);
				
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
