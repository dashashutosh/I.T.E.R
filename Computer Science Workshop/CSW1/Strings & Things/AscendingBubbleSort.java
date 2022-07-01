package Strings_N_Things;

public class AscendingBubbleSort {

	public static void main(String[] args) {
		
		String s[]= {"Tripathi", "Stark", "Chris", "Robert", "Ganesh Gaitonde"};
		String temp;
		for(int i=0;i<s.length;i++) {
			
			for(int j=0;j<s.length-1;j++) {
				
				if(s[j].compareTo(s[j+1])>0) {
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
				
			}
		}
		
		System.out.println("Ascending order of string: ");
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+"     ");
		
	}

}
