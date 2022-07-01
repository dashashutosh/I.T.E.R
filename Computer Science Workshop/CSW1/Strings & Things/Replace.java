package Strings_N_Things;

public class Replace {

	public static void main(String[] args) {
		
		String a="I am done with JAVA Programming -Programming -Programming";
		String a1=a.replaceAll("m", "i");
		
		String b="Hello\t \n ITER \n CSE";
		
		System.out.println(a.replace("Programming", "Data Structure"));
		System.out.println(a.replaceFirst("Programming", "Data Structure"));
	
		System.out.println("replaceAll: "+a1);
		System.out.println("\nString after removing tabs, spaces and new line: ");
		System.out.println(b);
		
	}

}
