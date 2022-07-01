package Chapter_09;

import java.util.Scanner;

public class RPN_Stack {
	
	
	static int k=0,i=1,res=0;
	int top;
	static int stack[];
	int size;
	
	public RPN_Stack(int k) 
	{
		top=-1;
		size=k;
		stack=new int[size];
	}
	public void push(int data) {
		
		stack[++top]=data;
		/*Node temp=new Node();
		temp.data=data;
		temp.next=head;
		head=temp;*/
	}
	
	public void display() {
		
		System.out.println("Stack Elements are:");
		for(int i=size-1;i>=0;i--)
			System.out.println(stack[i]);
	}
	
	public static void RPN(char ch) {
		
		int x=0;
		if(k==0) {
			res=stack[0];
			x=stack[1];
		}
		
		k++;
		if(k!=0)
			x=stack[i++];
		
		switch(ch)
		{
			
			case '+':
				res+=x; break;
			case'-':
				res-=x; break;
			case'*':
				res-=x; break;
			case'/':
				res-=x; break;	
			default:
				System.out.println("Invalid Entry!!");
		
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=0;
		
		System.out.println("Enter the expression");
		String r=sc.nextLine();
		
		for(int i=0;i<r.length();i++) {
			if(Character.isDigit(r.charAt(i)))
				a++;
		}
		System.out.println(a);
		
		RPN_Stack s=new RPN_Stack(a);
		
		for(int i=r.length()-1;i>=0;i--) { 
			
			if(Character.isDigit(r.charAt(i)))
				s.push(r.charAt(i)-'0');
			else
				RPN(r.charAt(i));
				
		}
		
	}

}
