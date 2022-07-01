//WAP to store elements separately in even and odd array 

package Chapter_06;

import java.util.*;

public class Prog_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements  to array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int even[]=new int[size];
		int odd[]=new int[size];
		
		int e=0,o=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				even[e]=arr[i];
				e++;
			}
			else {
				odd[o]=arr[i];
				o++;
			}	
		}
		
		System.out.print("Even Array is: ");
		for(int i=0;i<e;i++) 
			System.out.print(even[i]+" 	");
		
		System.out.println();
		
		System.out.print("Odd Array is: ");
		for(int i=0;i<o;i++) 
			System.out.print(odd[i]+" 	");
		
	}

}
