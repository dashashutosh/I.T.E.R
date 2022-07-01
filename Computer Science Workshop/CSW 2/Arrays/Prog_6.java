//WAP to delete all elements from ArrayList

package Chapter_06;

import java.util.ArrayList;

public class Prog_6 {

	public static void main(String[] args) {
		
		ArrayList<String> L=new ArrayList<>();
		L.add("Hello");
		L.add("Everyone");
		L.add("Good Morning");
		L.add("Welcome to Eclipse");
		L.add("Thank you !!");
		
		System.out.println("ArrayList contains:");
		for(int i=0;i<L.size();i++) 
			System.out.println(L.get(i));
		System.out.println("Size is: "+L.size());	
	
		System.out.println("After deleting all elements ArrayList contains:");	
		L.clear();
		for(int j=0;j<L.size();j++) 
			System.out.println(L.get(j));
		System.out.println("Size is: "+L.size());
	
	}

}
