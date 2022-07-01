package Chapter_5;

import java.util.*;

public class SwapBits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Enter any 2 positions to swap bits:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		if( ((n>>>i)&1) != ((n>>>j)&1) ) {
			n=n^(1<<i) | (1<<j);
			System.out.println("Swapping positions "+i+" and "+j+" we get "+n);
		}
		else
			System.out.println("Swapping is not possible");
	}

}
