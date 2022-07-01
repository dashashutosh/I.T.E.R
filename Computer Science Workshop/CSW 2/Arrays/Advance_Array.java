package Chapter_06;

import java.util.Scanner;

public class Advance_Array {
	
	static int k=0,cnt=0;
	
	public static int minSteps(int n) {
		if(k!=n)
			cnt++;
		k=n;
		return cnt;
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
		
		int lastIndex=size-1,maxAdv=0,min=0;
		
		for(int i=0;i<=maxAdv && maxAdv<lastIndex;i++){
			maxAdv=Math.max(maxAdv, i+arr[i]);
			min=minSteps(maxAdv);
		}
		
		if(maxAdv>=lastIndex){
			System.out.println("Reached the end position");
			System.out.println("Minimum steps: "+min);
		}
		else
			System.out.println("Can't reach the end position");
	}

}
