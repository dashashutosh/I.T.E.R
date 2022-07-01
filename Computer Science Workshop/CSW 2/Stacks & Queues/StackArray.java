package Chapter_09;

import java.util.Scanner;

public class StackArray {
	
	int top,size;
	int stack[];
	
	public StackArray(int k) 
	{
		top=-1;
		size=k;
		stack=new int[size];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == size-1);
	}	
	
	public void push(int data)
	{
		if(isFull())
			System.out.println("Stack is Full");
		
		else
			stack[++top]=data;
	}
	
	public void pop()
	{
		if(isEmpty())
			System.out.println("Stack is Empty");
		
		else {
			System.out.println("Popped Element is ");
			System.out.println(stack[top--]);
		}
	}
	
	public void peek() 
	{
		if(!isEmpty())
			System.out.println(stack[size-1]);
		else
			System.out.println(-1);
	}
	
	public void max() 
	{
		int k=0;
		for(int i=size-1;i>=0;i--) {
			if(k<stack[i])
				k=stack[i];
		}
		System.out.println(k);
	}
	
	public void display()
	{
		System.out.println("Stack Elements are:");
		for(int i=size-1;i>=0;i--)
			System.out.println(stack[i]);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of elements you want:");
		int size=sc.nextInt();
		
		StackArray s=new StackArray(size);
		
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
