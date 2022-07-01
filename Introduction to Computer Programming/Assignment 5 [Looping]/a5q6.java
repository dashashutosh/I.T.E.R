import java.util.Scanner;


public class a5q6 {

	public static void main(String[] args) {
		 	
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("enter the total no. of numbers to find H.M:");
		 	int n=sc.nextInt();
		 	double sum=0;
		 	System.out.println("enter "+n+" numbers to find its H.M");
		 	for(int i=1;i<=n;i++)
		 	{
		 		double nums=sc.nextDouble();
		 		sum+= (double)(1/nums);
		 	}
		 		double HM=(double)(n/sum);
		 		System.out.println("harmonic mean is= "+HM);
		 	
	}

}

