package Numbers;

public class SumRevPallin {

	public static void main(String[] args) {
		
		 int num = 1991, r= 0;
		 int p=num;
		 while(num != 0) {
			 int d=num % 10;
	            r = r* 10 + d;
	            num /= 10;
	        }
		 System.out.println("Reversed Number: " + r);
		 int s=p+r;
		 
		 System.out.println("we have to check if "+s+" is pallindrome or not:");
		 int rev,sum=0,temp;   
		 temp=s;
		 while(s>0) {    
			  rev=s%10;  
			  sum=(sum*10)+rev;    
			  s=s/10;    
		  }    
		 
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");
		 
	}

}
