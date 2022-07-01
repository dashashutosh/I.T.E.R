package Chapter_06;

import java.util.*;

public class Dutch_Flag2 {

	public static void dutchFlagPartition(ArrayList<Integer> A, int pivotIndex) {
		
		int pI=pivotIndex;
		int p = A.get(pI);
		int small=0;
		int large=A.size()-1;
		
		for (int i =0; i < A.size(); i++) {
			if (A.get(i) < p) 
				Collections.swap(A , small++, i);
		}
	
		for (int i = A.size() - 1 ; i >= 0 && A.get(i) >= p; --i) {
			if (A.get(i) > p)
				Collections.swap(A , large--, i);
		}
		
	}
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> A=new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(2);
		A.add(0);
		A.add(2);
		A.add(1);
		A.add(1);
		
		System.out.println("Enter the Index position you want for pivot:");
		int pivotIndex=sc.nextInt();
		dutchFlagPartition(A, pivotIndex);
		
		System.out.println("After partitioning ArrayList, we get:");
		
		for(int i=0;i<A.size();i++) 
			System.out.println(A.get(i));	
	}

}
