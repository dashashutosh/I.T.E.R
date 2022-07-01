package Strings_N_Things;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		
		String str[]= {"Tripathi", "Stark", "Chris", "Robert", "Ganesh Gaitonde"};
		System.out.println("Randomly selected name: "+str[new Random().nextInt(str.length)]);

	}

}
