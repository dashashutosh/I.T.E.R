//WAP to delete an element from double type ArrayList

package Chapter_06;

import java.util.*;

public class Prog_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Double> L=new ArrayList<>();
		L.add(8.1);
		L.add(3.0);
		L.add(2.9);
		L.add(7.4);
		L.add(5.6);
		L.add(1.0);
		
		System.out.println("Enter a number to delete it from the arraylist:");
		double n=sc.nextDouble();
		
		int k=0;
		for(int i=0;i<L.size();i++) {
			if(L.get(i)==n) {
				k=i;
				L.remove(k);
			}	
		}	
	
		System.out.println("After deleting "+n+" from arraylist we get:");
		
		for(int i=0;i<L.size();i++) 
			System.out.println(L.get(i));
		
	}

}
