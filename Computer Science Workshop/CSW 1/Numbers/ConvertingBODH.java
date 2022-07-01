package Numbers;

public class ConvertingBODH {

	public static void main(String[] args) {
		
		for(int radix:new int[] {2, 8, 10, 16}) {
			int num=42;
			System.out.println(num+" formatted base "+radix+" is "+Integer.toString(num,radix));
		}
		
		//without using for loop
		int n=109;
		String s1=Integer.toString(n,2);
		String s2=Integer.toString(n,8);
		String s3=Integer.toString(n,10);
		String s4=Integer.toString(n,16);
		System.out.println(n+" base 2 is "+s1);
		System.out.println(n+" base 8 is "+s2);
		System.out.println(n+" base 10 is "+s3);
		System.out.println(n+" base 16 is "+s4);
		
		//without using .toString() method
		int x=74;
		System.out.println("Given no. is "+x);
		System.out.println("Binary no. is "+Integer.toBinaryString(x));
		System.out.println("Octal no. is "+Integer.toOctalString(x));
		System.out.println("Hexadecimal  no. is "+Integer.toHexString(x));
	
		//converting strings to BODH
		String s="1010"; //only binary no. 
		Integer b=Integer.parseInt(s,2);
		Integer o=Integer.parseInt(s,8);
		Integer d=Integer.parseInt(s,10);
		Integer h=Integer.parseInt(s,16);
		System.out.println("Given string no. is "+s);
		System.out.println("Binary no. is "+b);
		System.out.println("Octal no. is "+o);
		System.out.println("Decimal no. is "+d);
		System.out.println("Hexadecimal no. is "+h);
		
	}

}
