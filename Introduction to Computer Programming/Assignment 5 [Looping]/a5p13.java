import java.util.Scanner;
public class a5p13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int a=0,b=1,i=2;
		int c;
		System.out.println("First "+n+" terms of Fibonacci 			series are:");
		System.out.print(a+" "+b+" ");
		while(i<n)
		{
			i=i+1;
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
