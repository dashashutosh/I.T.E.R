import java.util.Scanner;
public class a5p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
        	 int marks=sc.nextInt();
        	 if(marks>=40)
        		 c++;
         }
		System.out.println(c);
	}

}
