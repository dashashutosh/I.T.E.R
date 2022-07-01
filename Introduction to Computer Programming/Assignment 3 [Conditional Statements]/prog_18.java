import java.util.Scanner;


public class prog_18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the gender,age,fast and last name:");
		char gender=sc.next().charAt(0);
		int age=sc.nextInt();
		String fn=sc.next();
		String ln=sc.next();
		char confirm=sc.next().charAt(0);
		if(gender=='f')
		{
			if(age>=20)
			{ 
				System.out.println("are you married:");
				if(confirm=='y')
			    System.out.println("Mrs."+fn+" "+ln);
				else
			    System.out.println("Ms."+fn+" "+ln);
					
				
			}
			else
			{
		    System.out.println(fn+" "+ln);
			}
		}
		if(gender=='m')
		{
			if(age>=20)
			{ 
				System.out.println("are you married:");
				if(confirm=='y')
			    System.out.println("Mr."+fn+" "+ln);
				else
			    System.out.println(fn+" "+ln);
					
				
			}
			else
			{
		    System.out.println(fn+" "+ln);
			}
		

	   }
		
	}
}


