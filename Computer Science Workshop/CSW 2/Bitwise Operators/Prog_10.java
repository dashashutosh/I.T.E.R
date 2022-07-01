//WAP to perform multiplication using bitwise

package Chapter_5;

import java.util.Scanner;

public class Prog_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int p=0;
		while(b>0) {
			if((b&1) != 0)
				p=p+a;
			a=a<<1;
			b=b>>1;
		}
		System.out.println("Product is "+p);

	}

}
