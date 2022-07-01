package Strings_N_Things;

import java.util.Random;

public class RandomForLoop {

	public static void main(String[] args) {
		
		System.out.println("Random number generator using math function:");
		for(int i=0;i<=5;i++)
			System.out.println("Random number: "+i+":"+Math.random());
		
		System.out.println("Random number generator using Random class:");
		Random rand=new Random();
		int upperbound=25;
		
		int int_random=rand.nextInt(upperbound);
		double double_random=rand.nextDouble();
		float float_random=rand.nextFloat();
		
		System.out.println("Random integer value from 0 to "+(upperbound-1)+":"+int_random);
		System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
		System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
		
		int rand_int1=rand.nextInt(1000);
		int rand_int2=rand.nextInt(1000);
		
		System.out.println("Random Integers: "+rand_int1);
		System.out.println("Random Integers: "+rand_int2);
	
	}

}
