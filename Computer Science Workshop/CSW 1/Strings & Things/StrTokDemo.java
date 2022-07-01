package Strings_N_Things;

import java.util.StringTokenizer;

public class StrTokDemo {
	
	public final static int MAXFIELDS=6;
	public final static String DELIM="|";
	
	public static String[] process(String line) {
		
		String result[]=new String[MAXFIELDS];
		StringTokenizer st= new StringTokenizer(line,DELIM,true);
		int i=0;
		while(st.hasMoreTokens()) {
			String s=st.nextToken();
			if(s.equals(DELIM)) {
				if(i++>=MAXFIELDS)
					throw new IllegalArgumentException("Input line "+line+" has too many fields");
				continue;
			}
			result[i]=s;
		}
		
		return result;
		
	}
	
	public static void printResults(String input,String output[]) {
		
		System.out.println("Input: "+input);
		for(String s:output)
			System.out.println("Output: "+s+" was: "+s);
		
	}

	public static void main(String[] args) {
		
		printResults("A|B|C|D",process("A|B|C|D"));
		printResults("A||C|D",process("A| |C|D"));
		printResults("A||D|E",process("A||D|E"));
		
	}

}
