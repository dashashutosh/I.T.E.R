//WAP to add 5 elements to ArrayList and print in reverse order

package Chapter_06;

import java.util.*;

public class Prog_8 {

	public static void main(String[] args) {

		ArrayList<Integer> L=new ArrayList<>();
		L.add(8);
		L.add(3);
		L.add(2);
		L.add(7);
		L.add(5);
		
		System.out.println("ArrayList elements in reverse order:");
		for(int i=L.size()-1;i>=0;i--) 
			System.out.print(L.get(i));
	}
	
}
