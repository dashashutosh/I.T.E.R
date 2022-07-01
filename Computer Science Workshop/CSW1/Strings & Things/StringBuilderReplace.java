package Strings_N_Things;

public class StringBuilderReplace {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder("Hello");
		s.replace(1,4,"JAVA");
		System.out.println(s);
		
		String w="Ram";
		String w1=w.replace('R','S');
		System.out.println(w1);
		
		s.replace(1,2,"d");
		System.out.println(s);
		
	}

}
