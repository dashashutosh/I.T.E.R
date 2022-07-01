import java.util.Scanner;
public class a3p10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=fibbo(n);
		System.out.println(k);

	}
	public static int fibbo	(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibbo(n-1)+fibbo(n-2);		
	}

}
