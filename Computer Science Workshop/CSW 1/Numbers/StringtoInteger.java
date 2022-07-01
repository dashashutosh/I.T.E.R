package Numbers;

public class StringtoInteger {

	public static void main(String[] args) {
		
		String s="12245";
		int i=Integer.parseInt(s);
		int a=10000;
		System.out.println("integer value: "+i);
		System.out.println("sum of a & i: "+Integer.valueOf(a+i));
		
		String S="12345t";
		boolean num=true;
		try {
			int n=Integer.parseInt(S);
		} catch(NumberFormatException e) {
			num=false;
		}
		
		if(num)
			System.out.println(S+" is a valid no.");
		else
			System.out.println(S+" is not a valid no.");
	}

}
