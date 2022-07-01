package Strings_N_Things;

public class RemoveChar {

	public static void main(String[] args) {
		
		String s="Welcome to JAVA";
		System.out.println(charRemoveAt(s,5));
		
	}
	
	public static String charRemoveAt(String s,int posn) {
		return s.substring(0,posn) + s.substring(posn+1);
	}
	
}
