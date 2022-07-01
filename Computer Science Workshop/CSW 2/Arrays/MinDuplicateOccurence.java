package Chapter_06;

import java.util.Scanner;

public class MinDuplicateOccurence {
	static int temp[];
	
	/*public static int minOccurence(int arr[],int n,int min,int m){
		int cnt=0,j=0,l=0;
		temp=new int[n];
		
		for(int i=0;i<n-1;i++){
			
			
			if(arr[i]==arr[i+1]){
				temp[i]=arr[i];
				cnt++;
				if((cnt+1)>=m){
					for(int k=0;k<min;k++){
						temp[j]=arr[i];
						j++;
					}	
				}
				
			}
			else{
				cnt=0;
				temp[j]=arr[i];
				j++;
			}
			
		}
	}*/
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
	
		System.out.println("Enter the elements to array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number: ");
		int m=sc.nextInt();
		System.out.println("Enter another number for minimum occurence:");
		int mn=sc.nextInt();
		int min=Math.min(m, mn);
		System.out.println("The elements appearing "+m+" times will appear"+min+" times: ");
		
		System.out.println("After removing the key element and its duplicates from array: ");
		//int j=minOccurence(arr, size, min, m);
		//for(int i=0;i<j;i++)
			//System.out.print(temp[i]+" ");

	}

}
