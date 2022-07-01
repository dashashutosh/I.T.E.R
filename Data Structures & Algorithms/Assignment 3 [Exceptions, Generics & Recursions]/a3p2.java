import java.util.*;
public class a3p2 {

	public static void main(String[] args) {
		
		
		String arr[]={"red","blue","black",null,"green"};
		
		try
		{
			for(int i=0;i<arr.length;i++)
			{
			if(arr[i]==null)
				throw new NullPointerException("It is a null value ");
			}
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println(r);
		}
	}

	

}
