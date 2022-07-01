package Chapter_06;

import java.util.Scanner;

public class PrimeNums {
	
	public static boolean primeNums(int n){
		
		for(int i=2;i<n;i++){			
			if(n%i==0){
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find prime numbers upto that number:");
		int num=sc.nextInt();
		
		for(int i=2;i<num;i++){
			boolean x=primeNums(i);
			if(x==true)
				System.out.print(i+" ");
		}
	}

}
