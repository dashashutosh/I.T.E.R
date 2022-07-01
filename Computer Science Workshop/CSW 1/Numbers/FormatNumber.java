package Numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {

	public static void main(String[] args) {

		double d1= 123456.789;
		NumberFormat nf=NumberFormat.getInstance();
		System.out.println("Default representation: "+nf.format(d1));
		nf.setMinimumFractionDigits(1);
		nf.setMaximumFractionDigits(2);
		System.out.println("Set max and min fraction: "+nf.format(d1));
		
		double d2=123.45;
		nf.setMaximumIntegerDigits(2);
		nf.setMinimumFractionDigits(1);
		nf.setMaximumFractionDigits(1);
		System.out.println("Set max and min integer: "+nf.format(d2));
		
		NumberFormat NF=NumberFormat.getInstance(Locale.ITALY);
		NF.setMaximumFractionDigits(3);
		System.out.println("Italy representation of number: "+d1+" is "+NF.format(d1));
	
	}

}
