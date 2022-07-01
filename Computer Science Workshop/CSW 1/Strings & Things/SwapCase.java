package Strings_N_Things;

import java.util.*;

public class SwapCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string:");
		String s=sc.nextLine();
		StringBuffer str=new StringBuffer(s);

		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(Character.isLowerCase(c))
				str.replace(i,i+1,Character.toUpperCase(c)+"");
			else
				str.replace(i,i+1,Character.toLowerCase(c)+"");
		}
		
		System.out.println(str);
		
	}

}
