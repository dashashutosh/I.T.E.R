import java.util.Scanner;

class Student{
	String name;
	int roll;
	float marks;
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name, roll and marks of student:");
		name=sc.next();
		roll=sc.nextInt();
		marks=sc.nextFloat();
	}
	
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("roll is "+roll);
		System.out.println("mark is "+marks);
	}
}
public class dsa_a1p9 {

	public static void main(String[] args) {
		
		Student s1=new Student(); 
		Student s2=new Student();
		Student s3=new Student();
		s1.setdata();
		s1.display();
		s2.setdata();
		s2.display();
		s3.setdata();
		s3.display();
	}

}
