package Strings_N_Things;

import java.util.Scanner;

public class EqualtoString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st string:");
		String s1=sc.nextLine();
		
		System.out.println("Enter 2nd string:");
		String s2=sc.nextLine();
		
		System.out.println("Check whether these two strings are equal or not:");
		if(s1.equals(s2)==true)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
	}

}
