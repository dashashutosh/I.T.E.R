package Chapter_09;

import java.util.Scanner;

public class QueueLL {
	
	Node front,rear;
	
	public QueueLL()
	{
		front=null;
		rear=null;
	}
	
	public boolean isEmpty()
	{
		return front==null;
	}
	
	public void enqueue(int x)
	{
		Node temp=new Node();
		if(front==null)
		{
			temp.data=x;
			front=rear=temp;
		}
		
		else
		{
			Node Temp= new Node();
			Temp.data=x;
			rear.next=Temp;
			rear=Temp;
		}
	}
	
	public void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is Empty");
		
		else
		{
			int temp=front.data;
			if(front.next==null)
				rear=null;
			
			front=front.next;
			System.out.println("Removed Element is: ");
			System.out.println(temp);
		}
	}
	
	public void display()
	{
		System.out.println("Queue Elements are:");
		Node temp=front;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void max() 
	{
		int k=0;
		Node temp=front;
		while(temp!=null)
		{
			if(temp.data>k)
				k=temp.data;
			temp=temp.next;
		}
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		QueueLL q=new QueueLL();
		
		System.out.println("Enter the no.of elements you want to enqueue:");
		int k=sc.nextInt();
		
		System.out.println("\nEnter "+k+" elements into the queue:");
		for(int i=0;i<k;i++)
			q.enqueue(sc.nextInt());
		
		q.dequeue();
		
		System.out.println();
		q.display();
		
		System.out.println("\nMax element in queue is ");
		q.max();
		
	}

}
