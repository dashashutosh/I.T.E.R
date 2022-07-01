import java.util.Scanner;
public class p10a6 {
public static void printchars(char ch1,char ch2, int n){
	int c=0;
	c=n;
	for(int i=ch1;i<=ch2;i++)
	{
		c++;
		System.out.print((char)i+" ");
		if(c%10==0)
			System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		int x=s.nextInt();
		printchars(a,b,x);
	}

}
