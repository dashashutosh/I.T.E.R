import java.util.Scanner;
public class a5p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int N=sc.nextInt();
		for(int i=0;i<=N;i++)
		{
			System.out.println(i+"  "+(int)Math.pow(2,i));
		}

	}

}
