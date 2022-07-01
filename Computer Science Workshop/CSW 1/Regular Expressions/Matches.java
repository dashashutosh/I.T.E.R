package Regular_Expressions;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Matches {

	public static void main(String[] args) {
		
		String pattern=" abc .* ";
		String input=" d abc pqr xyz ";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		
		if(m.matches())
			System.out.println("Pattern "+pattern+" found in string "+input);
		else
			System.out.println("Pattern "+pattern+" not found in string "+input);
		
		//Using find()
		if(m.find())
			System.out.println("Pattern "+pattern+" found in string "+input);
		else
			System.out.println("Pattern "+pattern+" not found in string "+input);
		
		//Using lookingAt()()
		if(m.lookingAt())
			System.out.println("Pattern "+pattern+" found in string "+input);
		else
			System.out.println("Pattern "+pattern+" not found in string "+input);
				
	}

}
