package Strings_N_Things;

public class Shortform {

	public static void main(String[] args) {
		
		String name="Mahendra Singh Dhoni";
		System.out.println("Full name is: "+name);
		name=name.trim();
		
		String s1="";
		String s2="";
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch!=' ')
				s2=s2+ch;
			else {
				s1+=s2.charAt(0)+" . ";
				s2="";
			}
		}
		
		s1+=s2;
		System.out.println("Name in short form: "+s1);
		
	}

}
