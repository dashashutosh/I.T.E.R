package Strings_N_Things;

public class LongestPallindrome {

	public static void main(String[] args) {
		
		String str="thequickbrownfoxxofnworbquickthe";
		System.out.println("Given string is: "+str);
		System.out.println("Length of the pallindromic substring is: "+longPallinSubstr(str));
		
	}

	public static void printSubstr(String str,int l,int h) {
		System.out.println(str.substring(l,h+1));
	}
	
	public static int longPallinSubstr(String str) {
		
		int n=str.length();
		boolean table[][]=new boolean[n][n];
		int mlength=1;
		
		for(int i=0;i<n;++i) 
			table[i][i]=true;
		
		int start=0;
		for(int i=0;i<n-1;++i) {
			if(str.charAt(i)==str.charAt(i+1)) {
				table[i][i+1]=true;
				start=i;
				mlength=2;
			}
		}
		
		for(int k=3;k<=n;++k) {
			
			for(int i=0;i<n-k+1;++i) {
				int j=i+k-1;
				
				if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)) {
					table[i][j]=true;
					start=i;
					mlength=k;
				}
			}
		}
		
		System.out.print("The longest pallindrome substring in the given string is: ");
		printSubstr(str, start, start+mlength-1);
		return mlength;
	
	}
	
}
