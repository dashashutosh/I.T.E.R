package Chapter_5;

import java.util.*;

public class ReverseBits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int rev=0;
		while(n>0) {
			rev=rev<<1;
			if((n&1)==1)
				rev=rev^1;
			n=n>>>1;
		}
		
		System.out.println("After reversing the bits, we get "+rev);
	}

}
	