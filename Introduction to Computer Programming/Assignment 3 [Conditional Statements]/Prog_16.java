import java.util.Scanner;


public class prog_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks between 1 to 100:");
		int m=sc.nextInt();
		switch(m/10)
		{
		case 10:
		case 9:System.out.println("grade O"); break;
		case 8:System.out.println("grade A"); break;
		case 7:System.out.println("grade B"); break;
		case 6:System.out.println("grade C"); break;
		case 5:System.out.println("grade D"); break;
		case 4:System.out.println("grade E"); break;
		default: System.out.println("grade F");
		
		}

	}

}
