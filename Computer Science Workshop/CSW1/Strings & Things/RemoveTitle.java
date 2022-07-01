package Strings_N_Things;

public class RemoveTitle {

	public static void main(String[] args) {
		
		String s="Mr. Sachin Tendulkar";
		int n=s.indexOf('.');
		System.out.println("Name with title: "+s);
		System.out.println("After removing title:"+s.substring(n+1));

	}

}
