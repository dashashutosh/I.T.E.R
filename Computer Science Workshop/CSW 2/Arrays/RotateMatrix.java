package Chapter_06;

import java.util.*;

public class RotateMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of square matrix:");
		int size=sc.nextInt();
		
		int a[][]=new int[size][size];
		int r[][]=new int[size][size];
		
		System.out.println("\nEnter elements to the matrix:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
				a[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				r[j][(size-1)-i]=a[i][j];
			}
		}
		
		System.out.println("\nMatrix after 90degree clockwise rotation:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
				System.out.print(r[i][j]+" ");
			System.out.println();
		}
		
	}

}
