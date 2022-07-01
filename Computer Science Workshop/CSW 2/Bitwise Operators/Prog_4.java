//WAP to check if a number entered is a power of 2

package Chapter_5;

import java.util.Scanner;

public class Prog_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		if( n!=0 && ((n&(n-1)) ==0) )
				System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}

}
