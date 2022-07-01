package Chapter_06;

import java.util.*;

public class PascalTriangle {
	
	public static int fact(int a) {
		
		int p=1;
		for(int i=a;i>0;i--) {
			p*=i;
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of rows:");
		int row=sc.nextInt();
		
		System.out.println("\nPascal Triangle for upto "+row+" rows:");
	
		for(int i=0;i<row;i++) {
		
			for(int j=0;j<=i;j++) {
				int r=fact(i) / (fact(j) * fact(i-j));
				System.out.print(r+" ");
			}	
			System.out.println();
		}
		
	}
}
