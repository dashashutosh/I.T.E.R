package Regular_Expressions;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class StartEnd {

	public static void main(String[] args) {
		
		String pattern=" pqr ";
		String input=" abc pqr xyz ";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		
		while(m.find())
			System.out.println("Pattern found from "+m.start()+" to "+m.end());

	}

}
