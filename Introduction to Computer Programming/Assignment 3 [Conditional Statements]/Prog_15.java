import java.util.Scanner;
public class Prog_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double s=Math.sqrt((x*x)+(y*y));
		if(s<=10)
		{
			System.out.println(x+","+y+" lies inside the circle");
		}
		else
		{
			System.out.println(x+","+y+" lies outside the circle");
		}
	}

}
