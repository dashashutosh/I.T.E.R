package Strings_N_Things;

import java.util.*;

public class VowelsConsonants {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int con=0;
		int vow=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vow++;
			else if(ch>='a' && ch<='z')
				con++;
			}
		
		System.out.println("Vowels: "+vow);
		System.out.println("Consonants: "+con);
		
	}

}
