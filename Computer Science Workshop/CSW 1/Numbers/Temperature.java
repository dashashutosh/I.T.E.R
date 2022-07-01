package Numbers;

import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double c,f;
		System.out.println("enter temperature in fahrenheit:");
		f=sc.nextDouble();
		c=(5*(f-32))/9;
		System.out.println(f+"fahrenheit in celsius is: "+c);
		
	}

}
