
public class Program_24 {

	public static void main(String[] args) {
		double a,b,c,d,e,max,min,avg;
		a=Math.random();
		b=Math.random();
		c=Math.random();
		d=Math.random();
		e=Math.random();
		System.out.println("random values are:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		max=Math.max(a,Math.max(b,Math.max(c,Math.max(d,e))));
		min=Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));
		System.out.println("max is: "+max);
		System.out.println("min is: "+min);
		avg=(a+b+c+d+e)/5;
		System.out.println(avg);

	}

}
