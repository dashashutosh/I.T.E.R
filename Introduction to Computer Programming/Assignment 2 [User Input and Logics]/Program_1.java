import java.util.Scanner;


public class Program_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double c,f;
		System.out.println("Enter degree in celsius: ");
		c=sc.nextDouble();
		f=((9.0/5)*c)+32;
		System.out.println(c + " Celsius is " + f + " Fahrenheit");

	}

}
