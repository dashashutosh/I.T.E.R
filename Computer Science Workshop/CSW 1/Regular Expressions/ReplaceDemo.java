package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		String patt = "\\bfavor\\b";
		String input = "Do me a favor? Fetch my favorite.";
		System.out.println("1: Input: " + input);
		Pattern r = Pattern.compile(patt);
		Matcher m = r.matcher(input);
		System.out.println("2: Using ReplaceAll: " + m.replaceAll("HELP"));
		
		m.reset();
		
		StringBuffer sb = new StringBuffer();
		System.out.print("3: Append methods: ");
		while (m.find()) {
			m.appendReplacement(sb, "helps");
		}
		m.appendTail(sb); 
		System.out.println(sb.toString());

	}

}
