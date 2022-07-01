import java.util.Scanner;
public class a3p13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		binary(n);
		

	}
	public static void binary(int n)
	{
		if(n==0)
			System.out.print(0+" ");
		else if(n==1)
			System.out.print(1+" ");
		else
		{
			binary(n/2);
			System.out.print(n%2+" ");
		}
			
		
	}
}
