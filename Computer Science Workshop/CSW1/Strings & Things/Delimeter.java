package Strings_N_Things;

import java.util.StringTokenizer;

public class Delimeter {

	public static void main(String[] args) {
	
		String url="http://www.nta.nic.in/recruitment.php";
		StringTokenizer multiTokenizer=new StringTokenizer(url,"://",true);
		while(multiTokenizer.hasMoreTokens())
			System.out.println(multiTokenizer.nextToken());

	}

}
