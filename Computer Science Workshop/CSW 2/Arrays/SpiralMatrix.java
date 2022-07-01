package Chapter_06;

import java.util.*;

public class SpiralMatrix {
	
	public static void Spiral(int arr[][],int a,int b) {
											  		
		if(a==b-1)
			System.out.print(arr[a][b-1]);
		
		else {
			
			for(int x=a;x<b-1;x++)
				System.out.print(arr[a][x]+",");
			
			for(int x=a;x<b-1;x++)
				System.out.print(arr[x][b-1]+",");
			
			for(int x=b-1;x>a;x--)
				System.out.print(arr[b-1][x]+",");
			
			for(int x=b-1;x>a;x--)
				System.out.print(arr[x][a]+",");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2D array size:");
		int size=sc.nextInt();
		
		System.out.println("enter array elements");
		int arr[][]=new int[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("elements in spiral ordering:");
		int a=0,b;
		while(size>0) {
			
			b=size;
			Spiral(arr,a,b);
			a++;
			size--;
		}
	}

}
