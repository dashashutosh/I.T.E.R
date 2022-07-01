import java.util.Scanner;
public class a1p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of integers you want");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the integers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]*arr[j])%2!=0)
					System.out.println("Pair of no.s with odd product: "+arr[i]+","+arr[j]);
			}
		}
	}

}
