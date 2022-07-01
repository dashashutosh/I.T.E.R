package Strings_N_Things;

import java.util.StringTokenizer;

public class Count {
	
	public static int countWords(String s) {
		
		if(s==null || s.isEmpty())
			return 0;
		StringTokenizer tokens=new StringTokenizer(s);
		return tokens.countTokens();
		
	}

	public static void main(String[] args) {
		
		String str="Good Morning !! Welcome to JAVA, This is Eclipse IDE";
		System.out.println("No. of words in the string: "+countWords(str));
		
	}

}
