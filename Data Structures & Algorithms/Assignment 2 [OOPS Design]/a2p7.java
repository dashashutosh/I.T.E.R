import java.util.Scanner;


public class a2p7 {

	public static void main(String[] args)
{
		
		D d1=new D();
		d1.count();
		d1.display();

	}

}

interface Q
{
	void display();
	void count();

}

class D implements Q
{
	Scanner sc=new Scanner(System.in);
	static int maxcount;
	String name;
	public void count()
	{
		System.out.println(" enter a name ");
		 name=sc.next();
		maxcount=name.length();
	}
	public void display()
	{
		System.out.println("name is: "+name+" and no.of characters present in it: "+maxcount);
	}
}

