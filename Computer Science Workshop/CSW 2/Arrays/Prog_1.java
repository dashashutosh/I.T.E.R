//WAP to find the second largest element in an array

package Chapter_06;

import java.util.*;

public class Prog_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements  to array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int key,i;
		for(int j=1;j<size;j++) {
			key=arr[j];
			i=j-1;
			
			while(i>=0 && key>arr[i]) {
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		
		System.out.println("Second largest element in the array is "+arr[1]);
	}

}
