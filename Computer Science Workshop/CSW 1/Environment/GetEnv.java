package Environment;

public class GetEnv {

	public static void main(String[] args) {
		
		System.out.println("System.getenv(\"PATH\")= "+System.getenv("PATH"));
		System.out.println(System.getenv("TEMP"));
		System.out.println(System.getenv("USERNAME"));
		System.out.println("User.dir: "+System.getProperty("user.dir"));
		System.out.println("Home: "+System.getProperty("home.name"));
		System.out.println("OS: "+System.getProperty("os.name"));
		System.out.println("Runtime: "+System.getProperty("java.runtime.version"));
		System.out.println("Version: "+System.getProperty("java.specification.version"));
		System.out.println("Home: "+System.getProperty("java.home"));
		System.out.println("Username: "+System.getProperty("user.name"));
		System.out.println("File Separator: "+System.getProperty("file.separator"));
		System.out.println("Compiler: "+System.getProperty("java.compiler"));
		System.out.println("Path: "+System.getProperty("java.class.path"));
		
	}

}
