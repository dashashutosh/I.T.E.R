package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupCountRun {

	public static void main(String[] args) {
		
		String regex1="(.*)(\\d+)(.*)";
		String input="Welcome to ITER SOA, 123, CS Department";
		Pattern p=Pattern.compile(regex1);
		Matcher m=p.matcher(input);
		if(m.find()) {
			System.out.println("1st group match: "+m.group(1));
			System.out.println("2nd group match: "+m.group(2));
			System.out.println("3rd group match: "+m.group(3));
			System.out.println("No. of groups capturing: "+m.groupCount());
		}
		
		String regex2="(e(\\S+)e)(\\s)";
		String s="ende helloe eye are mee ete";
		Pattern P=Pattern.compile(regex2);
		Matcher M=P.matcher(s);
		while(M.find()) {
			System.out.println(M.group(0));
			System.out.println(M.group(1));
			System.out.println(M.group(2));
		}	
		System.out.println("Total capturing groups: "+M.groupCount());

	}

}
