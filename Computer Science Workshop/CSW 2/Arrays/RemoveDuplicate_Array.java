package Chapter_06;

import java.util.Scanner;

public class RemoveDuplicate_Array {
	static int temp[];
	
	public static int removeDuplicate(int arr[],int n){
		
		int j=0;
		temp=new int[n];
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[n-1];
		return j;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
	
		System.out.println("Enter the elements to array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("After removing the duplicate elements from array: ");
		int j=removeDuplicate(arr, size);
		for(int i=0;i<j;i++)
			System.out.print(temp[i]+" ");
	}

}
