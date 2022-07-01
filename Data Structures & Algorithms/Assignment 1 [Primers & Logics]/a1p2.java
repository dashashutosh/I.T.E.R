import java.util.Scanner;
public class a1p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. greater than 2:");
		int n=sc.nextInt();
		int c=0;
		while(n>1)
		{
			n=n/2;
			c++;
		}
		System.out.println("The no. of divisions performed: "+c);
	}

}
