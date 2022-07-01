import java.util.Scanner;
 
public class Prog_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter month and year:");

		int m=sc.nextInt();
			
		int y=sc.nextInt();
				
		if(m==1)
				{
							System.out.println("year is "+y+"january has 31 days ");
                }
				else if(m==2)
				{
					if(((y%400==0)&&(y%100==0)) || ((y%4==0)&&(y%100!=0)))
					{
					System.out.println("year is "+y+"february has 29 days ");
				    } 
					else
					{
						System.out.println("year is "+y+"february has 28 days ");
				    } 
				}	
					else	if(m==3)
					{
								System.out.println("year is "+y+"march has 31 days ");
	                }
					else	if(m==4)
					{
								System.out.println("year is "+y+"april has 30 days ");
	                }
					else	if(m==5)
					{
								System.out.println("year is "+y+"may has 31 days ");
	                }
					else	if(m==6)
					{
								System.out.println("year is "+y+"june has 30 days ");
	                }
					else	if(m==7)
					{
								System.out.println("year is "+y+"july has 31 days ");
	                }
					else	if(m==8)
					{
								System.out.println("year is "+y+"august has 31 days ");
	                }
					else	if(m==9)
					{
								System.out.println("year is "+y+"september has 30 days ");
	                }
					else	if(m==10)
					{
								System.out.println("year is "+y+"october has 31 days ");
	                }
					else	if(m==11)
					{
								System.out.println("year is "+y+"november has 30 days ");
	                }
					else	if(m==12)
					{
								System.out.println("year is "+y+"december has 31 days ");
	                }
						
					
			
			

		


	}
}

