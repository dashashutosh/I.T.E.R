package Strings_N_Things;

import java.util.*;

public class Concatenation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st string:");
		String s1=sc.nextLine();
		System.out.println("s1 is: "+s1);
		
		System.out.println("Enter 2nd string:");
		String s2=sc.nextLine();
		System.out.println("s2 is: "+s2);
		
		String result=s1.concat(s2);
		System.out.println("Result is: "+result);
		
	}

}
