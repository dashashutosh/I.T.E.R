package Strings_N_Things;

public class SubString {

	public static void main(String[] args) {
		
		String a="Welcome to JAVA";
		
		String b=a.substring(5);
		System.out.println(b);
		
		String c=a.substring(5,9);
		System.out.println(c);
		
		String d=a.substring(8,a.length());
		System.out.println(d);
		
	}

}
