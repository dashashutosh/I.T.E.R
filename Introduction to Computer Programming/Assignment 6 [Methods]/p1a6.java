import java.util.Scanner;
public class p1a6 {
	public static int addsimple(int x,int y){
		int res=x+y;
		return res;
	}
	public static int subtractsimple(int x,int y){
		int res=y-x;
		return res;
	}
	public static int multiplysimple(int x,int y){
		int res=x*y;
		return res;
	}
	public static double dividesimple(int x,int y){
		double res=((double)(y)/x);
		return res;
	}
	public static int remaindersimple(int n,int m){
		int res=n%m;
		return res;
	}
	public static double sqrootsimple(int n){
		double res=Math.sqrt((double)n);
		return res;
	}
		
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		System.out.println("enter your choice");
		char ch=s.next().charAt(0);
		int a=s.nextInt();
		int b=s.nextInt();
		int add=addsimple(a,b);
		int sub=subtractsimple(a,b);
		int mult=multiplysimple(a,b);
		double div=dividesimple(a,b);
		int rem=remaindersimple(a,b);
		double sqr=sqrootsimple(a);
		switch(ch)
		{
		case '+':System.out.println("Sum is "+add);
		case '-':System.out.println("Difference is "+sub);
		case '*':System.out.println("Product is "+mult);
		case '/':System.out.println("Quoitent is "+div);
		case '%':System.out.println("Remainder is "+rem);
		case 's':System.out.println("Square root is "+sqr);
		
		}
	}

}
