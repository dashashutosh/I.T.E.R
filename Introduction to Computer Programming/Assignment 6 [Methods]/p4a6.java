import java.util.Scanner;
public class a6p4 {
public static int no_of_days(int year){
	int days;
	if( ((year%400==0)&&(year%100==0)) || ((year%4==0)&&(year%100!=0)) )
		 days=366;
	else 
		days=365;
	return days;
	}
	public static void main(String[] args) {
		for(int i=2000;i<=2020;i++)
		{
			int x=no_of_days(i);
			System.out.println(i+" year has "+x+" days");
		}
	}

}
