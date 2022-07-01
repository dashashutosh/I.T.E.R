//WAP to set a particular bit from 0 to 1 by giving position

package Chapter_5;

import java.util.*;

public class Prog_5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number and position to set bit: ");
		int n=sc.nextInt();
		int pos=sc.nextInt();
		
		n=n | (1<<pos) ;
		System.out.println("The number after setting bit from 0 to 1 at position "+pos+" becomes: "+n);
	}

}
