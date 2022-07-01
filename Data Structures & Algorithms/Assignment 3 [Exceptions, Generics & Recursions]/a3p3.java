import java.util.*;

public class a3p3 
{

	public static void main(String[] args) 
	{
		student s=new student();
		s.input();

	}

}

class student
{
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("enter name and mark");
		String name=sc.next();
		int mark=sc.nextInt();
		try
		{
			if(mark>100)
				throw new MarksOutOfBoundException(" invalid mark");
			else
				System.out.println("your name is "+name+" and mark is "+mark);
				
		}
		catch(MarksOutOfBoundException str)
		{
			System.out.println(str);
		}
		
	}
}

public class MarksOutOfBoundException extends Exception 
{

	MarksOutOfBoundException(String s)
	{		
	}
}
}





	