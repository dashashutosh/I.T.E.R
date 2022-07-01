package Strings_N_Things;

public class StringBuilderCharAt {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java lang package");
		System.out.println("String is: "+sb);
		
		sb.deleteCharAt(5);
		System.out.println("After deletion using CharAt: "+sb);
		
	}

}
