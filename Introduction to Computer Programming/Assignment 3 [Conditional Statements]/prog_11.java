import java.util.Scanner;
public class prog_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of weight and height:");
		double wei=sc.nextDouble();
		double hei=sc.nextDouble();
		double bmi=wei/(hei*hei);
		if(bmi<18.5)
		{
			System.out.println("underweight");
		}
		else if(bmi>=18.5&&bmi<=24.9)
		{
			System.out.println("normal weight");
		}
		else if(bmi>=25&&bmi<=29.9)
		{
			System.out.println("overweight");
		}	
		else if(bmi>=30)
		{
			System.out.println("obese");
		}
		else
		{
			System.out.println("invalid entry");
		}
	}

}
