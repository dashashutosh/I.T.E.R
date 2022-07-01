package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupCount {

	public static void main(String[] args) {
		
		String pattern="(.*)(\\d{6})";
		String input="ashutosh 1941012274";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		System.out.println("Total group: "+m.groupCount());

	}

}
