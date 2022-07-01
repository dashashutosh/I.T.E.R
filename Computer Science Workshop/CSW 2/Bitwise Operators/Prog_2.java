//WAP to detect if 2 integers have opposite signs

package Chapter_5;

import java.util.Scanner;

public class Prog_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integers to check if they have opposite signs or not: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a^b)<0)
			System.out.println("Opposite signs");
		else
			System.out.println("Equal signs");
	}

}
