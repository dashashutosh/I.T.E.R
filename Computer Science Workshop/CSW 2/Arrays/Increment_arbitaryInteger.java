package Chapter_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Increment_arbitaryInteger {

	public static void main(String[] args) {
		
		System.out.println("After Incrementing 8999:");
		ArrayList<Integer> L=new ArrayList<>();
		L.add(8);
		L.add(9);
		L.add(9);
		L.add(9);
		int last=L.get(L.size()-1);
		if(last>=0&&last<=8) {
			L.set(L.size()-1, last+1);
		}
		else if(last==9) {
			L.set(L.size()-1, 0);
			
			for(int i=L.size()-2;i>=0;i--) {
				
				if(L.get(i)>=0&&L.get(i)<=8) {
					L.set(i,L.get(i)+1);
					break;
				}
				else if(L.get(i)==9) {
					L.set(i, 0);
					continue;
				}	
			
				
			}
		}
		
		for(int i=0;i<L.size();i++) { 
			if(L.get(0)==0)
				L.add(0, 1);
			System.out.println(L.get(i));
		}
	}

}
