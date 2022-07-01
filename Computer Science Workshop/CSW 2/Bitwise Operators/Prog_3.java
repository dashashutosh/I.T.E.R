//WAP to turn off the rightmost set bit of an integer

package Chapter_5;

import java.util.*;

public class Prog_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		if(n%2==0)
			System.out.println("Not a valid no. to turn off rightmost bit.");
		else {
			System.out.println("After turning off rightmost set bit, we get: ");
			System.out.println(n&(n-1));
		}	
	}

}
