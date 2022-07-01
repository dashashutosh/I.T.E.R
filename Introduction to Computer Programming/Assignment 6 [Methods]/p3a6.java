import java.util.Scanner;
public class a6p3 {
public static int reverse(int num){
	int r=0;
	while(num!=0)
	{
		r=(r*10)+(num%10);
		num=num/10;
	}
	return r;
}
public static boolean isPallindrome(int num){
	int R=0;
	int NUM=num;
	while(num!=0)
	{
		R=(R*10)+(num%10);
		num=num/10;
	}
	if(NUM==R)
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no.");
		int rev=s.nextInt();
		int x=reverse(rev);
		System.out.println("Reverse is "+x);
		boolean y=isPallindrome(x);
		System.out.println(y);
	}

}
