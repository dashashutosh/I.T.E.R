import java.util.Scanner;
public class prog_12 {


	public static void main(String[] args) {

		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a,b,c:");
	
	int a=sc.nextInt();
		
int b=sc.nextInt();
		
int c=sc.nextInt();
	
	if((a<b)&&(b<c))
	
	System.out.println("non decreasing order:"+a+","+b+","+c);
		
		else if((a<c)&&(c<b))
		System.out.println("non decreasing order:"+a+","+c+","+b);
			
		
		else if((b<a)&&(a<c))
		System.out.println("non decreasing order:"+b+","+a+","+c);
		
		else if((b<c)&&(c<a))
		System.out.println("non decreasing order:"+b+","+c+","+a);
			
		
		else if((c<a)&&(a<b))
		System.out.println("non decreasing order:"+c+","+a+","+b);
		
		else if((c<b)&&(b<a))
		System.out.println("non decreasing order:"+c+","+b+","+a);
			
			
		
	}

}
