package Regular_Expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternLines {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		if (args.length != 1) {
			System.err.println("Usage: MatchLines pattern");
			System.exit(1);
		}
		
		Pattern patt = Pattern.compile(args[0]);
		Matcher matcher = patt.matcher("");
		
		String line = null;
		while ((line = br.readLine()) != null) {
			matcher.reset(line);
			
			if (matcher.find()) {
				System.out.println("MATCH: " + line);
			}
		}
		
	}

}
