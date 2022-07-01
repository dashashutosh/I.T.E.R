package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CanonExample {

	public static void main(String[] args) {

		String regExp="b\u0307";
		Pattern p=Pattern.compile(regExp,Pattern.CANON_EQ);
		Matcher m=p.matcher("\u1E03");
		
		if(m.find())
			System.out.println("Match found");
		else
			System.out.println("Match not found");
		
		String regex="B\u030A";
		Pattern P=Pattern.compile(regex,Pattern.CANON_EQ);
		String[] input= {"\u00E5", "B\u0311", "B\u0325", "B\u030A", "B\u1E03", "B\uFB03"};
		
		for(String elementinput : input) {
			Matcher M=P.matcher(elementinput);
		
			if(M.matches())
				System.out.println(elementinput+" is a match for "+regex);
			else
				System.out.println(elementinput+" is not a match for "+regex);
		
		}
	
	}

}
