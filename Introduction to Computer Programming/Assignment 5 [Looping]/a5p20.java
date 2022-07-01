import java.util.Scanner;
public class a5p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a no.");
	    int n=sc.nextInt();
	    System.out.println("prime factors are:");
	    int i=2;
	    while(n!=1)
	    {
	    	if(n%i==0)
	    	{
	    		System.out.print(i+" ");
	    		n=n/i;
	    	}
	    	else
	    		i++;
	    }
	    
	}

}
