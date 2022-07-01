package Chapter_11;

import java.util.Scanner;

public class Priority_Queue {
	
	int max,arr[],n;
	
	public Priority_Queue(int size)
	{
		max=size;
		arr=new int[max];
		n=0;
	}
	
	public void add(int val) 
	{
		int i;
		
		if(n==0)
		{
			arr[0]=val;
			n++;
			return;
		}
		
		for(i=n-1;i>=0;i--) 
		{
			if(val>arr[i])
				arr[i+1]=arr[i];
			else
				break;
		}
		
		arr[i+1]=val;
		n++;
	}
	
	public int remove() 
	{
		return arr[--n];
	}
	
	public int peek() 
	{
		return arr[0];
	}
	
	public void displayPQ() 
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the maximum size you want:");
		int size=sc.nextInt();
		
		Priority_Queue pq=new Priority_Queue(size);
		
		System.out.println("Do u want to add elements? (y/n):");
		char ch=sc.next().charAt(0);
		
		while(ch!='n') 
		{
			pq.add(sc.nextInt());
			System.out.println("Do u want to add more? (y/n):");
			ch=sc.next().charAt(0);
		}
		
		System.out.println("Elements of PriorityQueue are ");
		pq.displayPQ();
		
		pq.remove();
		System.out.println("\nAfter removing elements in Priority Queue are");
		pq.displayPQ();
		
		System.out.println("\nPeeked out element is "+pq.peek());
		
		sc.close();   
	}

}
