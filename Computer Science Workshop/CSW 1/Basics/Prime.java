package Basics;

import java.util.*;

public class Prime {

	public static boolean CheckForPrime(int num) {
		
		boolean isitPrime = true;
		if(num<=1)
		{
			isitPrime = false;
			return isitPrime;
		}
		else 
		{
			for(int i=2;i<=num/2;i++) {
				
				if((num%i)==0) {
					isitPrime = false;
					break;
				}
			
			}
			return isitPrime;
		}
			
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is prime or not:");
		int num=sc.nextInt();
		
		boolean isitPrime=CheckForPrime(num);
		if(isitPrime)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	
	}

}
