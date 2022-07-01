package Basics;

import java.util.Scanner;

class B {

	private String name;
	private String accno;
	private long balance;
	
	Scanner sc=new Scanner(System.in);
	
	void openAccount() {
		
		System.out.println("Enter Account no.");
		accno=sc.nextLine();
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter balance:");
		balance=sc.nextLong();
		
	}
	
	void showAccount() {
		
		System.out.println(accno+" , "+name+" , "+balance);
		
	}
	
	void deposit() {
		
		long amt;
		System.out.println("Enter the amount you want to deposit:");
		amt=sc.nextLong();
		balance=balance+amt;
		
	}
	
	void withdraw() {
		
		long amt;
		System.out.println("Enter the amount you want to withdraw:");
		amt=sc.nextLong();
		
		if(balance>=amt)
			balance=balance-amt;
		else
			System.out.println("Less Balance Transaction failed");
	
	}
	
	boolean search(String accn) {
		
		if(accno.equals(accn)) {
			showAccount();
			return true;
		}
		else
			return false;
		
	}
	
}

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many customers do you want to input:");
		int n=sc.nextInt();
		
		B b[]=new B[n];
		for(int i=0;i<b.length;i++) {
			b[i]=new B();
			b[i].openAccount();
		}
		
		int num;
		boolean found;
		do {
			
			System.out.println("MAIN MENU\n 1. Display All\n 2. Search by Account\n 3. Deposit\n 4. Withdrawal\n 5. Exit");
			System.out.println("Enter your choice:");
			num=sc.nextInt();
			switch(num) {
				
					case 1:
						for(int i=0;i<b.length;i++)
							b[i].showAccount();
						break;
						
					case 2:
						System.out.println("Enter Account no. you want to search:");
						String accn=sc.next();
						found=false;
						for(int i=0;i<b.length;i++) {
							found=b[i].search(accn);
							if(found)
								break;
						}
						if(!found)
							System.out.println("Search failed Account does not exist");
						break;
						
					case 3:
						System.out.println("Enter Account no.");
						accn=sc.next();
						found=false;
						for(int i=0;i<b.length;i++) {
							found=b[i].search(accn);
							if(found) {
								b[i].deposit();
								break;
							}
						}	
						if(!found)
							System.out.println("Search failed Account does not exist");
						break;
						
					case 4:
						System.out.println("Enter Account no.");
						accn=sc.next();
						found=false;
						for(int i=0;i<b.length;i++) {
							found=b[i].search(accn);
							if(found) {
								b[i].withdraw();
								break;
							}
						}	
						if(!found)
							System.out.println("Search failed Account does not exist");
						break;
						
					case 5:
						System.out.println("Thanks for visiting our BANK");
						break;
						
					default:
						System.out.println("Invalid input!");
				
			}
			
		} while(num!=5);
	}

}
