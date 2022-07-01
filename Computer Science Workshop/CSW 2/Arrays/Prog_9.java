//WAP to merge the elements of 2 ArrayLists into a single ArrayList

package Chapter_06;

import java.util.*;

public class Prog_9 {

	public static void main(String[] args) {
		
		ArrayList<Integer> A=new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		ArrayList<Integer> B=new ArrayList<>();
		B.add(6);
		B.add(7);
		B.add(8);
		
		System.out.println("Elements of ArrayList A:");
		for(int i=0;i<A.size();i++) 
			System.out.println(A.get(i));
		
		System.out.println("Elements of ArrayList B:");
		for(int i=0;i<B.size();i++) 
			System.out.println(B.get(i));
		
		
		System.out.println("After joining A & B, combined elements of new ArrayList:");
		A.addAll(B);	
		for(int i=0;i<A.size();i++) 
			System.out.println(A.get(i));	
		
	}	

}
