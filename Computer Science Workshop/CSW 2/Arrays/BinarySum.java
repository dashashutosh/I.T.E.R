package Chapter_06;

import java.util.*;

public class BinarySum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 2 4bit binary no.s");
		int a[]=new int[4];
		int b[]=new int[4];
		int c[]=new int[4];
		
		for(int i=0;i<4;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<4;i++)
			b[i]=sc.nextInt();
	
		int carry=0;
		for(int i=3;i>=0;i--){
			
			if( (a[i]^b[i])==1 )
				c[i]=1^carry;
		
			else if( (a[i]^b[i])==0 ){
				c[i]=0^carry;
				if(a[i]==1)
					carry=1;
				else
					carry=0;
			}	
		}

		System.out.println("Sum of the 4bit binary no.s entered: ");
		
		if(carry==1)
			System.out.print("1 ");
		for(int i=0;i<4;i++)
			System.out.print(c[i]+" ");
		
	}

}
