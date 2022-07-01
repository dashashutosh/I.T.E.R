package Numbers;

public class AdderCommandLine {

	public static void main(String[] args) {
		
		int num = args.length;
	    if (num<2) {
	    	System.out.println("This program requires atleast two command-line arguments.");
	    }
	    else {
		    int sum = 0;

		    for (int i = 0; i < num; i++) {
	                sum += Integer.valueOf(args[i]).intValue();
		    }

		  
	            System.out.println(sum);
	        }

	}

}
