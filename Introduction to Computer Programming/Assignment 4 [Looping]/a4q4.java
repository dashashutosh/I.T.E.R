import java.util.Scanner;
public class a4q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int i=sc.nextInt();
		int f=sc.nextInt();
		int u=sc.nextInt();
		System.out.println("count from: "+i);
	    System.out.println("count to: "+f);
	    System.out.println("count by: "+u);
	    
        for(int k=i;k<=f;k=k+u)
        {
        	System.out.print(k+" ");
        }
	}

}
