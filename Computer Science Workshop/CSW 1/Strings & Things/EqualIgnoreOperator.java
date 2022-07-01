package Strings_N_Things;

public class EqualIgnoreOperator {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="HELLo";
		String s3="Welcome";
		String s4="gOOdbye";
		String s5="Goodbye";
		
		System.out.println("s1 equal to s2: "+s1.equals(s2));
		System.out.println("s2 equal to s5: "+s2.equals(s5));
		
		System.out.println("s1 equalignore to s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("s4 equalignore to s5: "+s4.equalsIgnoreCase(s5));
		
		System.out.println("s1 and s2 are ==: "+(s1==s2));
		System.out.println("s1 and s5 are ==: "+(s1==s5));
		System.out.println('a'=='b');
		System.out.println(20==20);
		System.out.println(true==true);
		
	}

}
