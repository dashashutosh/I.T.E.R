package Chapter_06;

import java.util.Scanner;

public class PrimeNums_SieveOfEratosthenes {
	
	public static boolean checkPrime(int n){
		
		for(int i=2;i<n;i++){			
			if(n%i==0){
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find prime numbers upto that number:");
		int num=sc.nextInt();
		
		boolean b[]=new boolean[num+1];
		
		for(int i=0;i<=num;i++){
			b[i]=true;
			
			if(i==0||i==1)
				b[i]=false;
		}
		
		for(int i=2;i<=num;i++){
			boolean k=checkPrime(i);
			
			if(k==true){
				for(int j=i*2;j<=num;j=j+i)
					b[j]=false;
			}
			
			if(b[i]==true)
				System.out.print(i+" ");
		}
		
	}

}
