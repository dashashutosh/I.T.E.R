package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		
		//1st way
		Pattern pt=Pattern.compile(".p");
		Matcher m=pt.matcher("op");
		boolean b1=m.matches();
		System.out.println("1st Pattern regex: "+b1);
		
		//2nd way
		boolean b2=Pattern.compile(".o").matcher("op").matches();
		System.out.println("2nd Pattern regex: "+b2);
		
		//3rd way
		boolean b3=Pattern.matches(".o", "oyo");
		System.out.println("3rd Pattern regex: "+b3);
		
		System.out.println(Pattern.matches(".s", "oo"));
		System.out.println(Pattern.matches(".s", "mms"));
		System.out.println(Pattern.matches("..s", "mms"));
		
		System.out.println("? Quantifier:");
		System.out.println(Pattern.matches("[aas]?","a"));
		System.out.println(Pattern.matches("[aamn]?","aamm"));
		
		System.out.println("+ Quantifier:");
		System.out.println(Pattern.matches("[amn]+","a"));
		System.out.println(Pattern.matches("[amn]+","aaabbc"));
		
		System.out.println("* Quantifier:");
		System.out.println(Pattern.matches("[amn]*","ammmnaa"));
		
	}

}
