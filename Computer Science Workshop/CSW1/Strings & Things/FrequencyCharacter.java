package Strings_N_Things;

import java.util.*;

public class FrequencyCharacter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		int counter[]=new int[256];
		for(int i=0;i<str.length();i++) {
			counter[(int)str.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			if(counter[i]!=0)
				System.out.println("The character "+(char)i+" has occured for "+counter[i]+" times");
		}		
		
		//Using toCharArray()
		System.out.println("Enter another string: ");
		String st=sc.nextLine();
		char c[]=st.toCharArray();
		int size=c.length;
		System.out.println("Frequency of the string character using toCharArray(): ");
		for(int i=0;i<size;i++) {
			
			int count=0;
			for(int j=0;j<size;j++) {
				if(c[j]==c[i])
					count++;
			}
			
			System.out.println("The character "+c[i]+" has occured for "+count+" times");
		}
		
	}

}
