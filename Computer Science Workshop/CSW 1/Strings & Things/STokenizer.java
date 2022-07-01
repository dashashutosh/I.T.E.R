package Strings_N_Things;

import java.util.StringTokenizer;

public class STokenizer {

	public static void main(String[] args) {
		
		System.out.println("Using 1st constructor:");
		StringTokenizer st1=new StringTokenizer("This is Eclipse IDE");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());

		System.out.println("Using 2nd constructor:");
		StringTokenizer st2=new StringTokenizer("This:is:Eclipse: IDE !!",": ");
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		
		System.out.println("Using 3rd constructor:");
		StringTokenizer st3=new StringTokenizer("This:is:Eclipse: IDE !!!",": ",true);
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
		
	}

}
