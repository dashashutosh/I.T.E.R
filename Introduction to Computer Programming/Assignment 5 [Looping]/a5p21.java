import java.util.Scanner;
public class a5p21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 integers:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	while(y!=0)
	{
		int r=x%y;
		x=y;
		y=r;
	}
	System.out.println(x);
	}

}
