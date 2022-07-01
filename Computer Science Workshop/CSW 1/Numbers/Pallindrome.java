package Numbers;

import java.util.*;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. to check if its pallindrome or not:");
		 int rev,sum=0,temp;    
		 int num=sc.nextInt();
		 temp=num;    
		 
		 while(num>0) {    
			  rev=num%10;  
			  sum=(sum*10)+rev;    
			  num=num/10;    
		  }    
		 
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    

	}

}
