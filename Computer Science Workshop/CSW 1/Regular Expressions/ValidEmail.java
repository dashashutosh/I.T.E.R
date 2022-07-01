package Regular_Expressions;

import java.util.regex.*;

public class ValidEmail {

	public static void main(String[] args) {
	//	try {
			
			Pattern p=Pattern.compile("([a-zA-Z0-9]"+"[a-zA-Z0-9_.]*"+"@[a-zA-Z0-9]"+"+([.][a-zA-Z]+)+)");
			String email="dashashutosh.01@gmail.com";
			Matcher m=p.matcher(email);
			if(m.find())
				System.out.println("Valid Email");
			else
				System.out.println("Invalid Email");
			
	//	} catch(Exception e) {
		//	System.out.println(e);
		
		
	}

}
