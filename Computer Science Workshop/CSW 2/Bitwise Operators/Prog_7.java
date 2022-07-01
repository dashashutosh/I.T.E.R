//WAP to check if a bit is set or not

package Chapter_5;

import java.util.*;

public class Prog_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number and position(starting from 1) to check if bit is set or not: ");
		int n=sc.nextInt();
		int pos=sc.nextInt();
		
		if( (n&(1<<(pos-1)) ) >0 )
			System.out.println("SET");
		else
			System.out.println("NOT SET"); 
	}

}
