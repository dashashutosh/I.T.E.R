package Chapter_06;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements  to array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int j=-1,k;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				j++;
				k=arr[j];
				arr[j]=arr[i];
				arr[i]=k;
			}
		}
		
		System.out.println("Odd elements of array followed by even elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"    ");
		
	}

}
