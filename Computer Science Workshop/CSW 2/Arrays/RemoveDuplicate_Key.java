package Chapter_06;

import java.util.Scanner;

public class RemoveDuplicate_Key {
	static int temp[];
	
	public static int removeDuplicateKey(int arr[],int n,int key){
		
		int j=0;
		temp=new int[n];
		for(int i=0;i<n-1;i++){
			if(arr[i]!=key){
				temp[j]=arr[i];
				j++;
			}
		}
		if(key!=arr[n-1])
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
		
		System.out.println("Enter the key element to be removed:"); 
		int key=sc.nextInt();
		
		System.out.println("After removing the key element and its duplicates from array: ");
		int j=removeDuplicateKey(arr, size, key);
		for(int i=0;i<j;i++)
			System.out.print(temp[i]+" ");

	}

}
