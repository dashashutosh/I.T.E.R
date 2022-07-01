package Chapter_09;

import java.util.Scanner;

class Node {
	
	int data;	
	Node next;	
}

public class StackLL {
	
	Node head;
	int size;
	
	public StackLL(int k) 
	{
		size=k;
	}
	
	public void push(int data) {
		
		Node temp=new Node();
			
		if(temp!=null && !isFull()) {
			temp.data=data;
			temp.next=head;
			head=temp;
		}	
		else
			System.out.println("Stack is full");
	}	
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public boolean isFull()
	{
		Node temp=new Node();
		temp=head;
		int c=0;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		
		return (c==size);
	}
	
	public void pop() {
		
		if(head==null)
			System.out.println("Stack is Empty");
		
		else {
			int x=head.data;
			head=head.next;
			System.out.println("Popped Element is ");
			System.out.println(x);
		}
	}
	
	public void peek() {
		
		if(!isEmpty())
			System.out.println(head.data);
		else
			System.out.println(-1);
	}
	
	public void display() {
		
		System.out.println("Stack Elements are:");
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void max() {
		
		Node temp=head;
		int k=0;
		while(temp!=null) {
			
			if(temp.data>k) 
				k=temp.data;
			
			temp=temp.next;	
		}
		
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of elements you want:");
		int size=sc.nextInt();
		
		StackLL s=new StackLL(size);
		
		System.out.println("Do you want to enter elements to the Stack? (y/n):");
		char ch=sc.next().charAt(0);
		int c=0;
		
		while(ch!='n') {
			s.push(sc.nextInt());
			c++;
			System.out.println("Do you want to add more? (y/n):");
			ch=sc.next().charAt(0);
			if(c==size) {
				System.out.println("Maximum elements added!!");
				break;
			}
		}
		
		System.out.println();
		s.display();
		
		System.out.println("\nIs the stack empty? :"+s.isEmpty());
		System.out.println("Is the stack full? :"+s.isFull());
		
		System.out.println("\nEnter an element you want to push:");
		s.push(sc.nextInt());
		
		System.out.println();
		s.display();
		
		System.out.println("\nMaximum element in the stack is");
		s.max();
		
		System.out.println("\nElement at the top of stack is ");
		s.peek();
		
		System.out.println();
		s.pop();
		
	}

}
