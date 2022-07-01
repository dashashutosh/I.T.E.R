package Strings_N_Things;

import java.util.Scanner;

public class PallindromeCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check whether it is pallindrome or not:");
		String str=sc.nextLine();
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
			rev=rev+str.charAt(i);
		
		if(str.equals(rev))
			System.out.println(str+" is pallindrome");
		else
			System.out.println(str+" is not pallindrome");
		
	}

}
