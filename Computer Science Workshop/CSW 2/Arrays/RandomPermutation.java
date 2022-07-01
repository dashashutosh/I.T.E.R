package Chapter_06;

import java.util.*;

public class RandomPermutation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		Random r=new Random();
		int temp=-1;
		for(int i=0;i<n;i++){
			int rand=r.nextInt(((n-1)-0)+1)+0;
			
			if(temp!=rand)
				a[i]=rand;
			
			temp=rand;
		}
		
		System.out.println("Randomly Permuted Array:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
			

	}

}
