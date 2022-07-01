package Strings_N_Things;

import java.io.*;
import java.lang.*;

public class DefineString {

	public static void main(String[] args) {
		
		String s1="Welcome to JAVA";
		String s2= new String("This is Eclipse IDE");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		String s3="Welcome to JAVA";
		s3.concat("+hhh");
		System.out.println(s3);
	}

}
