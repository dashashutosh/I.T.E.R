
public class Program_15 {

	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		int x=(int)(Math.random()*(a-b+1))+b;
		System.out.println(x);
		

	}

}
