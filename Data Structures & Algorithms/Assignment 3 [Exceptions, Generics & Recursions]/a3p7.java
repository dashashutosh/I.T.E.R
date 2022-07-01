import java.util.Scanner;
public class a3p7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int k=fact(a);
		System.out.println(k);

	}



public static int fact(int n)
	{
		if(n==0)
			return 1;
		else 
			return n*fact(n-1);
	}
}