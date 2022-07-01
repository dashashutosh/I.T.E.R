
public class Program_21 {

	public static void main(String[] args) {
		double t,x;
		t=Double.parseDouble(args[0]);
		t=Math.toRadians(t);
		x= Math.sin(2*t)+Math.sin(3*t);
		System.out.println(x);

	}

}
