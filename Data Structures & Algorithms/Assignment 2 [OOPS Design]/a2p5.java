
public class Person {

	
		String name;int age;
		Person(String n,int a)
		{
			name=n;
			age=a;
		}
	}
	class Student extends Person
	{
		String course;
		int roll;
		double mark;
		Student(String n,int a,String c,int r,double m)
		{
			super(n,a);
			course=c;
			roll=r;
			mark=m;
		}
		void disp()
		{
			System.out.println(name+" "+age+" "+course+" "+roll+" "+mark);
		}
		class Teacher extends Person
		{
			String sub;int conthr;
			Teacher(String n,int a,String s,int c)
			{
				super(n,a);
				sub=s;
				conthr=c;
			}
			void disp()
			{
				System.out.println(name+" "+age+" "+sub+" "+mark);
			}
		}
		public class Test
		{
			public static void main(String[] args)
			{
				Student S=new Student("Raja",19,"Btech",45,90);
				S.disp();
				Teacher T=new Teacher("Biswa",40,"Dsa",25);
				T.disp();
		}
	}
	
			
		
		
		

	}


