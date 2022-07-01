package Numbers;

import java.math.BigInteger;

public class VeryLARGENum {

	public static void main(String[] args) {
		
		System.out.println("double max value: "+Double.MAX_VALUE);
		System.out.println("long max value: "+Long.MAX_VALUE);
		BigInteger b1=new BigInteger("1234567890765");
		BigInteger b2=new BigInteger("-567890765432");
		BigInteger b3=new BigInteger("12345");
		
		BigInteger a=b1.abs();
		System.out.println("BigInteger absolute value of b1: "+a);
		BigInteger b=b2.abs();
		System.out.println("BigInteger absolute value of b2: "+b);
		BigInteger c=b3.abs();
		System.out.println("BigInteger absolute value of b3: "+c);
		BigInteger d=b1.add(b3);
		System.out.println("BigInteger addition value of b1&b3: "+d);
		BigInteger e=b1.multiply(b2);
		System.out.println("BigInteger product value of b1&b2: "+e);
		BigInteger f=b2.subtract(b3);
		System.out.println("BigInteger difference of b2&b3: "+f);
		BigInteger g=b1.divide(b3);
		System.out.println("BigInteger quoitent value of b1 by b3: "+g);
		BigInteger h=b1.pow(3);
		System.out.println("BigInteger exponent3 value of b1: "+h);
		
		BigInteger i=b1.negate();
		System.out.println("Negation of b1: "+i);
		
		Boolean j=b1.equals(b3);
		System.out.println("Check if b1 is equal to b3: "+j);
		
		int k=b1.compareTo(b3);
		System.out.println("comparing b1&b3: "+k);
		
		int l=b2.intValue();
		System.out.println("int value of b2: "+l);
		
		float m=b1.floatValue();
		System.out.println("float value of b1: "+m);

	}

}
