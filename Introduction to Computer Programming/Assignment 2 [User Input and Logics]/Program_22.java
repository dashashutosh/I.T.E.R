
public class Program_22 {

	public static void main(String[] args) {
		double p,t,r,x,val;
		p=Double.parseDouble(args[0]);
		t=Double.parseDouble(args[1]);
		r=Double.parseDouble(args[2]);
		x=Math.exp(r*t);
		val=p*x;
		System.out.println("desired value is: "+val);
		
	}

}
