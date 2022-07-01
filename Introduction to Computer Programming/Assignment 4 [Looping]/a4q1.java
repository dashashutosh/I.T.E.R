import java.util.Scanner;
public class a4q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a message: ");
		String msg=sc.next();
		String k=null;
		int i=1;
		while(i<=10){
			if(i%10==1)
				k=i+"st";
			else if(i%10==2)
				k=i+"nd";
			else if(i%10==3)
				k=i+"rd";
			else if(i%10>=4||i%10==0)
				k=i+"th";
			System.out.println(k+" "+msg);	
			i++;
		}
		
	}

}
