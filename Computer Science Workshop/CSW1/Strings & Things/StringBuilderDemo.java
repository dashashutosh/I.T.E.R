package Strings_N_Things;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String s1="Hello"+", "+"World";
		System.out.println(s1);
		
		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		sb.append(',');
		sb.append(' ');
		sb.append("World");
		
		String s2=sb.toString();
		System.out.println(s2);
		
		System.out.println(new StringBuilder()
				.append("Hello")
				.append(',')
				.append(' ')
				.append('!')
				.append("World")
				.append('!'));
		
	}

}
