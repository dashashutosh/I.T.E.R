package Chapter_5;

import java.util.*;

public class CountBits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal no. to find no. of 1's present in its binary representation: ");
		int x=sc.nextInt();
	
		short cnt=0;
		while(x!=0) {
			cnt += (x&1);  						
			x>>>=1;
		}
		System.out.println("No. of 1's present: "+cnt);	
	}

}
