package Chapter_5;

import java.util.*;

public class Parity {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal no. to find its parity: ");
		int n=sc.nextInt();
		int x=n;
		
		int p=0;
		while(n!=0) {
			p=p^1;
			n=n&(n-1);
		}
		System.out.println("Parity for the no. "+x+" is "+p);
		
	}

}
