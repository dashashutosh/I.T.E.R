package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REMatchTwoFields {

	public static void main(String[] args) {
		
		String input="CSE, EEE, ITER SOA";
		Pattern p=Pattern.compile("(.*), (.*), (.*)");
		Matcher m=p.matcher(input);
		if(!m.matches())
			throw new IllegalArgumentException("Bad input");
		
		System.out.println(m.group(2) + '-' +m.group(1));
		System.out.println(m.group(3) + '-' +m.group(1));
		System.out.println(m.group(3) + '-' +m.group(2));
		
	}

}
