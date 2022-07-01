import java.util.Scanner;
interface Empinterface

{
	abstract void displayemp();
	abstract void givebonus(double amount);
}
abstract class Employee
{
	int empId;
	String fname;
	String iname;
	double salary;
}
	class Manager extends Employee implements Empinterface
	{
		double bonus;
		
		Manager()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(" enter empid ,fname,last name and salary...");
			empId=sc.nextInt();
			fname=sc.next();
			iname=sc.next();
			salary=sc.nextDouble();
			
			
		}
		public void displayemp()
		{
			System.out.println("empId: "+empId);
			System.out.println("fname: "+fname);
			System.out.println("Iname: "+iname);
			
			
		}
		public void givebonus(double amount)
		{ bonus=amount;
			if(bonus<0)
			{
				System.out.println("salary: "+salary);
			}
			else
			{
				System.out.println("salary: "+(salary+bonus));
			}
		}
		
	}

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of employees");
		int size=sc.nextInt();
		Manager m[]=new Manager[size];
		for(int i=0;i<size;i++)
		{
			m[i]=new Manager();
			m[i].displayemp();
			System.out.println("Enter bonus amount");
			double bonus=sc.nextDouble();
			m[i].givebonus(bonus);
		}
		

	}}


