import java.util.Scanner;


public class Program_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a          b            pow(a,b)");
		System.out.println( a+"     "+b+   "        "+(int)Math.pow(a,b));
		System.out.println(++a+"    "+ ++b+"        "+(int)Math.pow(a,b));
		System.out.println(++a+"    "+ ++b+"        "+(int)Math.pow(a,b));
		System.out.println(++a+"    "+ ++b+"        "+(int)Math.pow(a,b));
	}

}
