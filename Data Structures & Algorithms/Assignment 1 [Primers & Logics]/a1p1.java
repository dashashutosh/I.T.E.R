import java.util.Scanner;
public class a1p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the values of a,b and c respectively:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b==c)
		{
			System.out.println("The no.s are in order a+b=c");
		}
		else if(a==b-c)
		{
			System.out.println("The no.s are in order a=b-c");
		}
		else if(a*b==c)
		{
			System.out.println("The no.s are in order a*b=c");
		}
	}

}
