import java.util.Scanner;
public class a5q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=1;
       int term=1;
       int sign=-1;
       int i=2;
       while(i<=n)
       {
    	   term=term+2;
    	   sum=sum+(sign*term);
    	   sign=-sign;
    	   i++;
       }
       System.out.println("sum= "+sum);
		
	}

}
