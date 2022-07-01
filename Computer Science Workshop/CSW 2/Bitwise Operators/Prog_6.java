//WAP to clear a particular bit

package Chapter_5;

import java.util.*;

public class Prog_6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number and position to clear bit: ");
		int n=sc.nextInt();
		int pos=sc.nextInt();
		
		n=n & (~(1<<pos)) ;
		System.out.println("The number after clearing bit from position "+pos+" becomes: "+n);
	}

}
