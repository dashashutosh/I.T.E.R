package Chapter_06;

import java.util.*;

public class PartitionArray {
	
	public static void swap(int a[], int i, int j) {
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
	}	

	public static int partition(int a[], int l, int r, int pivot) {
		
		 l=l-1;
		 int r1=r;
		 while(true) {
			 while(a[++l]<pivot);
			 while(r1>0 && a[--r1]>pivot);
		
			 if(l>=r1)
				 break;
			 else
				 swap(a,l,r1);
		 }
		 swap(a,l,r);
		 printArray(a);
		 System.out.println();
		 return l;
	}
	
	public static void printArray(int a[]) {
		 System.out.println("After partitioning array elements: ");
		 for(int i=0;i<a.length;i++) 
				System.out.print(a[i]+" 	");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		System.out.println("Enter the array elements: ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) 
			a[i]=sc.nextInt();
		
		int pivot=a[size-1];
		int p=partition(a, 0, size-1, pivot);
		
		System.out.println("Pivot element is in index position: "+p);
	}

}
