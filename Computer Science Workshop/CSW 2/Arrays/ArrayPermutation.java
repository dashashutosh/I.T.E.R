package Chapter_06;

import java.util.*;

public class ArrayPermutation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int ind[]=new int[size];
		
		System.out.println("enter the elements to the array:");
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		
		System.out.println("enter the index elements for array permutation:");
		for(int i=0;i<size;i++)
			ind[i]=sc.nextInt();
		
		for(int i=0;i<size;i++){
			
			int n=i;
			
			while(ind[n]>=0){
				
				int s=ind[n],temp;
				temp=a[i];
				a[i]=a[s];			
				a[s]=temp;
				
				int k=ind[n];		
				
				ind[n]=k-size;		
				n=k;
			}
		}
		
		System.out.println("Array elements after permutation:");
		
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		
	}
}
