
public class Program_23 {

	public static void main(String[] args) {
		double a,b,c;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		double d=Math.max(a,b);
		double max=Math.max(d,c);
		double e=Math.min(a,b);
		double min=Math.min(d,c);
		double mid=(a+b+c)-(max+min);
		System.out.println("ascending order is: "+min+" "+mid+" "+max);
		

	}

}
