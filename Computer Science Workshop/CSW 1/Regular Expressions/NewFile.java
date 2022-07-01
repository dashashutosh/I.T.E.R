package Regular_Expressions;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewFile {

	public static void main(String[] args) throws IOException {
		
		Pattern p=Pattern.compile("[A-Za-z][a-z]+");
		BufferedReader r= new BufferedReader(new FileReader("E:\\STUDY MATERIALS\\JAVA ECLIPSE\\2ndYear\\File.txt"));
		String line;
		
		while((line=r.readLine())!=null) {
			Matcher m=p.matcher(line);
			while(m.find()) {
				System.out.println(m.group(0));
				int s=m.start();
				int e=m.end();
				System.out.println(line.substring(s,e));
			}
		}

	}

}
