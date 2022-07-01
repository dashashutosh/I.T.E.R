//WAP to count no.of bits that are set to 1 in an integer in O(log n) time

package Chapter_5;

import java.util.*;

public class Prog_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal no. to find no. of 1's present in its binary representation: ");
		int x=sc.nextInt();
	
		int cnt=0;
		while(x!=0) {
			x &= (x-1);  						
			cnt++;
		}
		System.out.println("No. of 1's present: "+cnt);		

	}

}
