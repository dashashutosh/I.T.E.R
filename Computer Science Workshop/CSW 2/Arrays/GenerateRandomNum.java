package Chapter_06;

import java.util.*;

public class GenerateRandomNum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("\nEnter the size to generate random nums:");
		int k=sc.nextInt();
		
		int a[]=new int[n];
		
		Random r=new Random();
		for(int i=0;i<k;i++){
			int rand=r.nextInt(((n-1)-0)+1)+0;
			int s=i;
			int temp=s;
			s=rand;
			rand=temp;
			
			a[i]=s;
			a[s]=i;
		}    			
		
		for(int i=0;i<k;i++)
			System.out.println(i+","+a[i]+" "+a[i]+","+a[a[i]]);
		
	}
}
