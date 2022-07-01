import java.util.Scanner;
public class a5p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int n=sc.nextInt();
		int p=n;
		int i=1,sum=0;
		while(n>0)
		{
			int r=n%2;
			sum=sum+(r*i);
			i=i*10;
			n=n/2;
		}
	System.out.println("binary representation of "+p+" is "+sum);
	}
	

}
