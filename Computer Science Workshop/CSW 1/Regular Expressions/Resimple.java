package Regular_Expressions;

import java.util.regex.Pattern;

public class Resimple {

	public static void main(String[] args) {
		
		String pattern="^Q[^d]\\d+\\.";
		String[] input= {"QA777. is the next flight. It is on time.","Quack, Quack, Quack! "};
		
		Pattern p=Pattern.compile(pattern);
		for(String in: input) {
			boolean found=p.matcher(in).lookingAt();
			System.out.println(" "+pattern+"."+(found ? "matches:-":" doesnt match:- ")+in+"'");
		}
	}

}
