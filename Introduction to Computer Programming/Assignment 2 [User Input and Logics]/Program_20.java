
public class Program_20 {

	public static void main(String[] args) {
		int m,d;
		d=Integer.parseInt(args[0]);
		m=Integer.parseInt(args[1]);
      boolean x= ((d>=3&&d<=31)&&(m==3)) || ((d>=1&&d<=30)&&(m==4)) || ((d>=1&&d<=31)&&(m==5)) || ((d>=1&&d<=20)&&(m==6)); 
	System.out.println(x);
	}
	
	

}
