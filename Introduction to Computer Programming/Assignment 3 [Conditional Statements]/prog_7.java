import java.util.Scanner;
public class prog_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x,y:");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
        if(x==0)
        {
        	if(y>0)
        	{
        		System.out.println("point lies on +ve y axis");
        	}
        	else if(y<0)
        	{
        		System.out.println("point lies on -ve y axis");
        	}
        	else
        	{
        		System.out.println("point is origin");
        	}
        }
        else if(y==0)
        {
        	if(x>0)
        	{
        		System.out.println("point lies on +ve x axis");
        	}
        	else if(x<0)
        	{
        		System.out.println("point lies on -ve x axis");
        	}
        }
        else if(x>0&&y>0)
        {
        	System.out.println("point is in 1st quad");
        }
        else if(x<0&&y>0)
        {
        	System.out.println("point is in 2nd quad");
        }
        else if(x<0&&y<0)
        {
        	System.out.println("point is in 3rd quad");
        }
        else if(x>0&&y<0)
        {
        	System.out.println("point is in 4th quad");
        }
        else
        {
        	System.out.println("invalid entry");
        }
        
        
        
	}

}
