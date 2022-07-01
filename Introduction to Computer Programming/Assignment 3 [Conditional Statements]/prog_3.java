import java.util.Scanner;
public class prog_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("the no. is even");
		}
		else
		{
			System.out.println("the no. is odd");
		}
	}

}
