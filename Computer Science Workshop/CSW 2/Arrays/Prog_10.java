//WAP to swap 2 elements of an ArrayList 

package Chapter_06;

import java.util.*;

public class Prog_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> A=new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		System.out.println("Enter the 2 index positions with which you want to swap elements:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=A.get(a);
		A.set(a, A.get(b));
		A.set(b,c);
		
		System.out.println("After swapping positions "+a+" and "+b+" ArrayList elements are");
		for(int i=0;i<A.size();i++) 
			System.out.println(A.get(i));
	}

}
