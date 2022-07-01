package Regular_Expressions;

import java.util.regex.*;

public class MaxnumExtract {

	public static void main(String[] args) throws NumberFormatException {
		
		String s="I have scored 88 in Physics, 85 in Maths, 90 in CS and 98 in DSA";
		String regex="\\d+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
	
		int max=0;
	
		while(m.find()) {
			int num=Integer.parseInt(m.group());
			if(num>max)
				max=num;
		}
	
		System.out.println("Maximum extracted no. is: "+max);
			
		
	}

}
