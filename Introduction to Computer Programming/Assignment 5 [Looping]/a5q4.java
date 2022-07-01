import java.util.Scanner;
public class a5q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=0,n=0,z=0;
		int c=0,sum=0;
		char ch=sc.next().charAt(0);
		while(ch=='y'||ch=='Y')
		{
			 System.out.println("enter an integer:");
			 int i=sc.nextInt();
			 c++;
			 if(i>0)
				 p++;
			 else if(i<0)
				 n++;
			 else if(i==0)
				 z++;
			 sum=sum+i;
			 System.out.println("do you want to enter more?");
			 ch=sc.next().charAt(0);
		}
		System.out.println("positives= "+p);
		System.out.println("negatives= "+n);
		System.out.println("zeroes= "+z);
		double avg=(double)sum/c;
		System.out.println("sum= "+sum);
		System.out.println("average= "+avg);
		
	}

}
