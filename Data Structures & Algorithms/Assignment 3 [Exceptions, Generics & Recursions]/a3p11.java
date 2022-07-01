import java.util.Scanner;
public class a3p11 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int k=gcd(m,n);
	System.out.println(k);

	}
	public static int gcd(int m,int n)
	{
		if(n==0||n==1)
			return m;
		else if(n>m)
			return gcd(n,m);
		else
			return gcd(n,m%n);
	}
}
