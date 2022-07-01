package Chapter_5;

import java.util.*;

public class SwapNums {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a is "+a+" b is "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping a is "+a+" b is "+b);
	}

}