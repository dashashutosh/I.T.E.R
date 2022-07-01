import java.util.Scanner;


public class a3p5 {

	public static void main(String[] args)
	{
		 Integer input1[]={1,2,3,4,5};
		 printArray(input1);
		 
		 Double  input2[]={1.1,2.2,3.2,4.2,5.4};
		 printArray(input2);
		 
		 String input3[]={"hello","iter","soa"};
		 printArray(input3);
		 
		
	}
	public static < E > void printArray( E[] inputArray)
	{
		System.out.println(" array elements are ");
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.println(inputArray[i]);
		}
	}
}