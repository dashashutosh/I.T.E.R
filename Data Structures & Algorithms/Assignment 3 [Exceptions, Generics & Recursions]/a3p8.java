import java.util.Scanner;
public class a3p8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int k=power(x,n);
		System.out.println(k);

	}
	public static int power(int x,int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return x;
		else 
			return x*power(x,n-1);
	}

}
