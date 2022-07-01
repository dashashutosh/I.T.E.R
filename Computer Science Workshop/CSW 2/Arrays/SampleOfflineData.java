package Chapter_06;

import java.util.Random;
import java.util.Scanner;

public class SampleOfflineData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("\nEnter the elements to the array:");
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		
		System.out.println("\nEnter specified size for subset:");
		int k=sc.nextInt();
		int cnt=0;
		
		Random r=new Random();
		for(int i=0;i<size;i++){
			
			if(cnt>k)
				break;
			
			int rand=r.nextInt((k-0)+1)+0;
			int temp=a[i];
			a[i]=a[rand];
			a[rand]=temp;
			cnt++;
		
		}
		
		System.out.println("\nSubset elements are:");
		for(int i=0;i<k;i++)
			System.out.print(a[i]+" ");
	}

}
