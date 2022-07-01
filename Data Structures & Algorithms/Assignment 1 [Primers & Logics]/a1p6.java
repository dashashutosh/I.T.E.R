import java.util.Scanner;
public class a1p6 {
	public static void Lar( int ar[])
	{
		int x=Integer.MAX_VALUE;
		int y=Integer.MIN_VALUE;
		for (int i=0; i< ar.length;i++)
		{
			if(ar[i]<x)
			{
				x=ar[i];
			}
		}
		System.out.println("Smallest value is: " + x);
		for (int i=0; i< ar.length;i++)
		{
			if(ar[i]>y)
			{
				y=ar[i];
			}
		}
		System.out.println("Largest value is: " + y);
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int n=sc.nextInt();
	int []ar=new int[n];
	System.out.println("Enter array");
	for (int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	Lar(ar);
	
	

	}

}

