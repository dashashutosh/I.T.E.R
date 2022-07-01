package Strings_N_Things;

public class ExpandingandCompress {

	public static void main(String[] args) {
		
		String value="Replace thi	s string wo	rds";
		
		value=value.replaceAll("[\\n\\t ]", "");
		System.out.println("After removing tabs, space and newline: "+value);
		
	}

}
