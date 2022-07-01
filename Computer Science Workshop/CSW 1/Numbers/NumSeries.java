package Numbers;

import java.util.BitSet;

public class NumSeries {

	public static void main(String[] args) {
		
		String months[]= {"January", "February", "March", "April"};
		for(int i=0;i<months.length;i++) 
			System.out.println("Month: "+months[i]);
			
		System.out.println("Through BitSet class:");
		BitSet b=new BitSet();
		b.set(0);
		b.set(3);
		
		for(int i=0;i<months.length;i++) {
			if(b.get(i))
				System.out.println("Month: "+months[i]);
		}
		
		System.out.println("Alternative short way:");
		int num[]= {0,1,3};
		for(int n:num)
			System.out.println("Month: "+months[n]);
	
		BitSet B=new BitSet();
		B.set(23);
		B.set(4);
		B.set(589);
		B.set(33);
		System.out.println("BitSet uncontigious Integer series: "+B);
	}

}
