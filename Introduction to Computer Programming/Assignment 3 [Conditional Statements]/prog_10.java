import java.util.Scanner;
public class prog_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter todays day:");
		int td=sc.nextInt();
		System.out.println("enter no.of days elapsed since today:");
		int fd=sc.nextInt();
		if(td==0)
		{
			System.out.println("todays sunday");
		}
		else if(td==1)
		{
			System.out.println("todays monday");
		}
		
		else if(td==2)
		{
			System.out.println("todays tuesday");
		}
		else if(td==3)
		{
			System.out.println("todays wednesday");
		}
		else if(td==4)
		{
			System.out.println("todays thursday");
		}
		else if(td==5)
		{
			System.out.println("todays friday");
		}
		else if(td==6)
		{
			System.out.println("todays saturday");
		}
		else
		{
			System.out.println("invalid entry");
		}
        int m=(td+fd)%7;
        if (td<=6)
        {
        	if(m==0)
    		{
    			System.out.println("future day is sunday");
    		}
    		else if(m==1)
    		{
    			System.out.println("future day is monday");
    		}
    		
    		else if(m==2)
    		{
    			System.out.println("future day is tuesday");
    		}
    		else if(m==3)
    		{
    			System.out.println("future day is wednesday");
    		}
    		else if(m==4)
    		{
    			System.out.println("future day is thursday");
    		}
    		else if(m==5)
    		{
    			System.out.println("future day is friday");
    		}
    		else if(m==6)
    		{
    			System.out.println("future day is saturday");
    		}
    		else
    		{
    			System.out.println("invalid entry");
    		}
        }
        
	}

}
