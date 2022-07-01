import java.util.Scanner;
public class a1p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of lines you want");
		int n=sc.nextInt();
		String a[]=new String[n];
		Scanner sc1=new Scanner(System.in);
		for(int x=0;x<n;x++)
		{
			 a[x]= sc1.nextLine();
		}
		System.out.println(" Lines in reverse order are:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
