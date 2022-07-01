import java.util.Scanner;
public class a3p9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=reverse(n);
		System.out.println(k);

	}
	public static int reverse	(int n)
	{
		if(n<10)
			return n;
		else 
		{
				System.out.print(n%10);
				return reverse(n/10);
		}		
	}

}
