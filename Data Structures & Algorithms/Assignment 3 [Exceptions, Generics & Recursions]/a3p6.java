import java.util.Scanner;

public class a3p6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a[]={"a","b","a","c","c"};
		String b=a[0];
		int x=count(a,b);
		System.out.println(x);
		
		}	
	public static <T> int count(T[] array, T item)
	{
		int c=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals(item))
				c++;
		}
		return c;
	}
}
