import java.util.Scanner;
public class a1P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			c[i]=a[i]*b[i];
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(c[i]);
		}
	}

}
