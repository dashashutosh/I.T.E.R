package Chapter_06;

import java.util.*;

public class Multiply_arbitaryIneger {
	
	static int pro=0,cnt=0;
	public static int Product(int p){
		pro+=(int)(p*Math.pow(10, cnt));
		cnt++;
		return pro;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 2 numbers:");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		
		System.out.println("Enter 2 numbers in form of array");
		int a[]=new int[s1];
		int b[]=new int[s2];
		
		for(int i=0;i<s1;i++)			//Input 1st number in array a
			a[i]=sc.nextInt();
		
		for(int i=0;i<s2;i++)			//Input 2nd number in array b
			b[i]=sc.nextInt();
		
		int sign=1;
		if( (a[0]^b[0])<0 )				//Check for sign of the product
			sign=-1;
		
		for(int i=s2-1;i>=0;i--){ 		//for array b
			int n=0,r=0,k=0,p=0;
			b[0]=Math.abs(b[0]);
			
			for(int j=s1-1;j>=0;j--){ 	//for array a
				a[0]=Math.abs(a[0]);	
				
				n=( b[i]*a[j] )+(n/10);
				r=n%10;
				if(j==0)
					p+=(int)(n*Math.pow(10, k));
				else
					p+=(int)(r*Math.pow(10, k));
				k++;	
			}
			
			int res=Product(p);
			if(i==0)
				System.out.println("Product of the 2 no.s is "+(sign*res));
		}
		
	}

}
