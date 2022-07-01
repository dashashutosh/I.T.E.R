package Strings_N_Things;

public class StringSplit {

	public static void main(String[] args) {
		
		String[] tokens=" Good Morning, Welcome to JAVA, This is Eclipse IDE, We are working under String split, Do, you know that ?".split(",");
		for(String token:tokens)
			System.out.println(token);
		
	}

}
