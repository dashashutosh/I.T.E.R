package Chapter_5;

import java.util.*;

public class Exponent {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to find x^y: ");
		double x=sc.nextDouble();
		int y=sc.nextInt();
		
		double result=1;
		int power=y;
		if(y<0) {
			power=-power;
			x=1/x;
		}
		
		while (power != 0) {
			
			if ((power & 1) != 0) {
			result *= x;
			}
			
			x *= x ;
			power >>>= 1 ;
		}
		
		System.out.println("Result is "+result);
	}

}
