
public class LeapYear {


	public static void main(String[] args) {
	
	int year;
		
year=Integer.parseInt(args[0]);
		
boolean p=((year%400==0)&&(year%100==0)) || ((year%4==0)&&(year%100!=0));
		System.out.println(p);
	}

}
