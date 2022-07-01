package Strings_N_Things;

public class ControlCase {

	public static void main(String[] args) {

		String name="Java Programming";
		System.out.println("Normal:\t "+name);
		System.out.println("Upper:\t "+name.toUpperCase());
		System.out.println("Lower:\t "+name.toLowerCase());
		
		String nm="java Programming";
		if(!name.equals(nm))
			System.err.println("equals() correctly reports false");
		else
			System.err.println("equals() incorrectly reports true");
		
		if(name.equalsIgnoreCase(nm))
			System.err.println("equalsIgnoreCase() correctly reports true");
		else
			System.err.println("equalsIgnoreCase() incorrectly reports false");
		
	}

}
