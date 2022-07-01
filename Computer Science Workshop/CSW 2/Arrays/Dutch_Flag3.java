package Chapter_06;

import java.util.*;

public class Dutch_Flag3 {
	
	public static void dutchFlagPartition(ArrayList<Integer> A, int pivotIndex) {
		
		int pI=pivotIndex;
		int p = A.get(pI);
		int small=0;
		int large=A.size();
		int equal=0;
		
		while (equal<large) {
			if (A.get(equal) < p) 
				Collections.swap(A , small++, equal++);
			
			else if(A.get(equal)==p)
				++equal;
			
			else
				Collections.swap(A, equal, --large);
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
