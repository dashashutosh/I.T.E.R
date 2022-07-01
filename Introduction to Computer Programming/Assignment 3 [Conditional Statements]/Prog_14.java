import java.util.Scanner;
public class Prog_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int comp=(int)(Math.random()*(2-0+1))+0;
		int num=sc.nextInt();
		if(comp==0)
		{
			if(num==0)
			{
				System.out.println("both are scissors: match draw");
			}
			else if(num==1)
			{
				System.out.println("comp is scissor, you are rock: you win");
			}
			else if(num==2)
			{
				System.out.println("comp is scissor, you are paper: you lose");
			}
		}
		else if(comp==1)
		{
			if(num==0)
			{
				System.out.println("comp is rock, you are scissor: you lose");
			}
			else if(num==1)
			{
				System.out.println("both are rock: match draw");
			}
			else if(num==2)
			{
				System.out.println("comp is rock, you are paper: you win");
			}
		}
		else if(comp==2)
		{
		    if(num==0)
			{
				System.out.println("comp is paper, you are scissor: you win");
			}
		    else if(num==1)
			{
				System.out.println("comp is paper, you are rock: you lose");
			}
		    else if(num==2)
			{
				System.out.println(" both are paper: match draw");
			}
		}
			
		

	}

}
