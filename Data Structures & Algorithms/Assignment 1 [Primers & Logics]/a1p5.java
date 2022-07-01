import java.util.Scanner;
public class a1p5 {
	public static boolean isodd(int i)
	{
		int c=0;
		for(int j=0;j<=i;j=j+2)
		{
			if(j==i)
				c++;
		}
		if(c==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int n=sc.nextInt();
		boolean x=isodd(n);
		System.out.println(x);

	}

}
