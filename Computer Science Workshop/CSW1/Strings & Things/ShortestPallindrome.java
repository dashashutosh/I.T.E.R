package Strings_N_Things;

public class ShortestPallindrome {

	public static void main(String[] args) {
		
		 String s = "abccab";
		    System.out.print(ShortestPalindrome(s));
	}
	
	public static char ShortestPalindrome(String s) {
	    int n = s.length();
	    char ans = s.charAt(0);
	    for(int i = 1; i < n; i++)
	        ans = (char) Math.min(ans, s.charAt(i));
	 
	    return ans;
	}

}
