package Numbers;

public class InfiniteProgram {

	public static void main(String[] args) {
		
		double d1=Double.NaN;
		System.out.println("NaN: "+d1);
		double d2=Double.POSITIVE_INFINITY;
		System.out.println("(double) Positive Infinity: "+d2);
		float f=Float.NEGATIVE_INFINITY;
		System.out.println("(float) Negative Infinity: "+f);
		
		//Using isNaN method
		double d3=45.7/0.0;
		System.out.println(Double.isNaN(d3));
		
		double d4=Math.sqrt(-0.44);
		System.out.println(Double.isNaN(d4));
		
		float f1=0/0.00f;
		System.out.println(Double.isNaN(f1));
		
		//Using isInfinite method
		double d5=32.666/0;
		System.out.println(Double.isInfinite(d5));
	
		float f2=Float.POSITIVE_INFINITY*5.7f;
		System.out.println(Float.isInfinite(f2));
	
		float f3=Float.NEGATIVE_INFINITY*4.33f;
		System.out.println(Float.isInfinite(f3));
	
	}

}
