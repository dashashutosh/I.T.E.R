package Regular_Expressions;

import java.util.regex.*;
import java.io.*;

public class ReadMobileno {

	public static void main(String[] args) throws IOException {

		PrintWriter pw=new PrintWriter("Output.txt"); //ITS FUNCTION IS TO WRITE NO.S TO OUTPUT FILE
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		BufferedReader br=new BufferedReader(new FileReader("Input.txt")); //ITS FUNCTION IS TO READ FROM INPUT FILE
		String s=br.readLine();
		
		while(s!=null) {
			Matcher m=p.matcher(s);
			while(m.find())
				pw.println(m.group()); //HERE IT WRITES ONLY THE MOBILE NO. (FROM THE REG EXPRESSION CONDITION) FROM INPUT TO OUTPUT FILE
			s=br.readLine();
		}
		pw.flush();
		
	}

}
