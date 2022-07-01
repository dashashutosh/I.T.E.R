import java.util.Scanner;
public class a5p14 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no.");
	int n=sc.nextInt();
	int a=0,b=1,i=2;
	System.out.println("for n="+n+" Fibonacci series is:");
	while(i<n)
	{
		System.out.print(a+" "+b+" ");
		a=a+b;
		b=a+b;
		i=i+2;
	}
		if(i==n)
			System.out.println(a+" "+b+" ");
		else
			System.out.println(a+" ");
			
		
	

	}

}
