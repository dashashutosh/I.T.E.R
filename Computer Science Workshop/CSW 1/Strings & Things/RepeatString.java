package Strings_N_Things;

public class RepeatString {

	public static void main(String[] args) {

		String s="Mississippi";
		System.out.println("The given string is "+s);
		
		for(int i=0;i<s.length();i++) {
			boolean uniq=false;
			
			for(int j=0;j<s.length();j++) {
				if(i!=j  && s.charAt(i)==s.charAt(j)) {
					uniq=true;
					break;
				}
			}
			
			if(uniq) {
				System.out.println("The first repeated character in string is "+s.charAt(i));
				break;
			 }	
		}

	}

}
