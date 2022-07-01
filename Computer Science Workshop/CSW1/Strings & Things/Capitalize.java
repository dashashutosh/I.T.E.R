package Strings_N_Things;

import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		
		char[] c=s.toCharArray();
		boolean flag=true;
		
		for(int i=0;i<c.length;i++) {
			
			if(c[i]==' ') {
				flag=true;
				continue;
			}
			
			if(flag) {
				if(c[i]>=97&&c[i]<=122) {
					c[i]-=32;
				}
			}
			
			flag=false;
		}
		
		System.out.println("After Capitalization of each word in the string: ");	
		System.out.println(c);
	}

}
