//WAP to convert ArrayList to array

package Chapter_06;

import java.util.*;

public class Prog_7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> L=new ArrayList<>();
		L.add(8);
		L.add(3);
		L.add(2);
		L.add(7);
		L.add(5);
		L.add(1);
		
		int arr[]=new int[L.size()];

		int j=0;
		for(int i=0;i<L.size();i++) {
			arr[j]=L.get(i);
			j++;
		}
		
		System.out.println("After converting Arraylist to array:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"        ");
	}

}
