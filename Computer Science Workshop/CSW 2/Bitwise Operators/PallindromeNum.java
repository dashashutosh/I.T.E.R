package Chapter_5;

import java.util.*;

public class PallindromeNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int N=n;
		int rev=0;
		while(n!=0) {
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		
		if(rev==N)
			System.out.println("It is a Pallindrome number");
		else
			System.out.println("It is not a Pallindrome number");
	}

}
