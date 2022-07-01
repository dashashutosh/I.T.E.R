package Chapter_5;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		
		int a=5,b=7;
		System.out.println("Bitwise AND: "+ (a&b));
		System.out.println("Bitwise OR: "+ (a|b));
		System.out.println("Bitwise XOR: "+ (a^b));
		System.out.println("Bitwise complement of a: "+ (~a));
		System.out.println("Bitwise complement of b: "+ (~b));
		
	}
	
}
