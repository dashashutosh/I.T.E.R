import java.util.Scanner;
public class prog_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90)
		{
			System.out.println("it is a capital letter");
		}
		else if(ch>=97&&ch<=122)
		{
			System.out.println("it is a small letter");
		}
		else if(ch>=48&&ch<=57)
		{
			System.out.println("it is a numerical digit");
		}
		else if((ch>=0&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=127))
			{
				System.out.println("it is a special symbol");
			}
		}
	}


