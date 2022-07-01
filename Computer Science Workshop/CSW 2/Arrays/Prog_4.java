//WAP to search an element is present or not in an integer type ArrayList

package Chapter_06;

import java.util.*;

public class Prog_4 {
	
	public static int Search(ArrayList<Integer> L , int n) {
		
		for(int i=0;i<L.size();i++) {
			if(L.get(i)==n) 
				return 1;
		}	
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> L=new ArrayList<>();
		L.add(8);
		L.add(3);
		L.add(2);
		L.add(7);
		L.add(5);
		L.add(1);
		
		System.out.println("Enter a number to search if its present in the ArrayList or not:");
		int n=sc.nextInt();
		
		int k=Search(L,n);
		if(k==1)
			System.out.println(n+" is present in Arraylist");
		else
			System.out.println(n+" is not present in Arraylist");
				
	}

}
