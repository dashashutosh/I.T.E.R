//WAP to perform division using bitwise

package Chapter_5;

import java.util.Scanner;

public class Prog_11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend and divisor: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(b==0)
			System.out.println("Cant divide by zero!");
	
		int q=0;
		while(a>=b) {
		    int k=0,x=a,y=b;
		    
		    while(x>=y) {
		    	y=y<<1;
		    	k++;
		    }
		    
			a=x-(y>>1);
			q=q+(int)Math.pow(2, (k-1));
		}
		
		System.out.println("Quotient is "+q);
		System.out.println("Remainder is "+(a));
	}

}
