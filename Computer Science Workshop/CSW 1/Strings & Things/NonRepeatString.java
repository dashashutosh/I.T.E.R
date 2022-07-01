package Strings_N_Things;

public class NonRepeatString {

	public static void main(String[] args) {
		
		String s="Mississippi";
		System.out.println("The given string is "+s);
		
		for(int i=0;i<s.length();i++) {
			boolean uniq=true;
			
			for(int j=0;j<s.length();j++) {
				if(i!=j  && s.charAt(i)==s.charAt(j)) {
					uniq=false;
					break;
				}
			}
			
			if(uniq) {
				System.out.println("The first non repeated character in string is "+s.charAt(i));
				break;
			 }	
		}

	}

}
