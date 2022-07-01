import java.util.Scanner;



public class ATM {

	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amnt,twoth,fiveh,twoh,oneh;
		amnt=sc.nextInt();
		twoth=amnt/2000;
		fiveh=(amnt%2000)/500;
		twoh=((amnt%2000)%500)/200;
		oneh=(((amnt%2000)%500)%200)/100;
		System.out.println("amount is: "+amnt);
		System.out.println("2000 notes: "+twoth);
		System.out.println("500 notes: "+fiveh);
		System.out.println("200 notes: "+twoh);
		System.out.println("100 notes: "+oneh);
	}

}
