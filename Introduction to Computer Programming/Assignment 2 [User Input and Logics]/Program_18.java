
public class Program_18 {

	public static void main(String[] args) {
		double x,y,z;
		x=Double.parseDouble(args[0]);
		y=Double.parseDouble(args[1]);
		z=Double.parseDouble(args[2]);
		boolean p= ((x<y)&&(y<z)) || ((x>y)&&(y>z));
		System.out.println(p);

	}

}
