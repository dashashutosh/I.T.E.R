//WAP to perform subtraction using bitwise

package Chapter_5;

import java.util.*;

public class Prog_9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		while(b!=0) {
			int borrow=~a&b;
			a=a^b;
			b=borrow<<1;
		}
		System.out.println("Difference is "+a);
		
	}

}
