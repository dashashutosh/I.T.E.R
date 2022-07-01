//WAP to copy elements of one ArrayList to another

package Chapter_06;

import java.util.*;

public class Prog_11 {

	public static void main(String[] args) {
		
		ArrayList<Integer> L=new ArrayList<>();
		L.add(8);
		L.add(3);
		L.add(2);
		L.add(7);
		L.add(5);
		L.add(1);
		
		ArrayList<Integer> K=new ArrayList<>();
		
		for(int i=0;i<L.size();i++) {
			K.add(i, L.get(i));
		}
		
		System.out.println("After copying elements of ArrayList L to K we have");
		for(int i=0;i<K.size();i++) {
			System.out.println(K.get(i));
		}
		
	}

}
