//WAP to find occurence of an element in an array

package Chapter_06;

import java.util.*;

public class Prog_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements  to array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number to count its occurence:");
		int n=sc.nextInt();
		int cnt=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==n)
				cnt++;
		}
		
		System.out.println(n+" occurs "+cnt+" times");
	}

}
