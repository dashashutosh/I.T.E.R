package Environment;

public class jvm {

	public static void main(String[] args) {
		
		java.util.Properties jvm = System.getProperties();
		jvm.list(System.out);
	
	}

}
