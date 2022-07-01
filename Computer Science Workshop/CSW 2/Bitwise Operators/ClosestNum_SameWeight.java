package Chapter_5;

import java.util.*;

public class ClosestNum_SameWeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a non -ve number: ");
		int n=sc.nextInt();
		
		System.out.println("For "+n+" the closest integer with same weight is ");
		for(int i=0;i<64;i++) {
			if( (((n>>>i)&1) != ((n>>>(i+1))&1)) ) {
				n=n^( (1<<i) | (1<<(i+1)) );
				System.out.println(n);
				break;
			}
		}
		
	}

}
