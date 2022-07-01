package Strings_N_Things;

import java.io.*;
import java.util.*;
import java.lang.*;

public class WordWiseReverse {

	public static String WordReverse(String str) {
		
		int i=str.length()-1;
		int start,end=i+1;
		String result=" ";
		while(i>=0) {
			
			if(str.charAt(i)==' ') {
				start =i+1;
				while(start!=end)
					result+=str.charAt(start++);
				
				result+=' ';
				end=i;
			}
			i--;
		}
		return result;
	}
	public static void main(String[] args) {
		
		String s=" Good Morning!! This is Eclipse IDE";
		String result=WordReverse(s);
		System.out.println("Reverse String by word is: "+result);
		
		//Using .split() method
		String str="Welcome to JAVA Programming";
		String a[]=str.split(" ");
		System.out.println("Original String word:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
		System.out.println("Reverse String Word:");
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
		
	}

}
