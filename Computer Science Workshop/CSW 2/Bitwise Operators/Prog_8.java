//WAP to perform addition using bitwise

package Chapter_5;

import java.util.*;

public class Prog_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		while(b!=0) {
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		System.out.println("Sum is "+a);
		
	}

}
