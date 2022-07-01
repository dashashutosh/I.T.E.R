import java.util.Scanner;


public class a3q12 {

	public static void main(String[] args) 
{
		int[] x=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int k=0;k<x.length;k++)
		{
		x[k]=sc.nextInt();
		}
		System.out.println("Enter the searching elements");
		int search=sc.nextInt();
		int ans=bi(x[x.length],x[0],x[x.length-1],search);
		System.out.println("The searched element is"+ans);
}
    static int bi(int a[],int f,int l,int key)
{
	if(f>l)
		return -1;
     int mid=(f+l)/2;
     if(a[mid]==key)
    	 return mid;
     else if(key<a[mid])
    	 return bi(a,f,mid-1,key);
     else 
    	 return bi(a,mid+1,l,key);
}
}
