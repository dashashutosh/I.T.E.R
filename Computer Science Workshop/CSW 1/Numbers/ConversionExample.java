package Numbers;

public class ConversionExample {

	public static void main(String[] args) {
		
		int i=100; //primitive data type
		Integer data=new Integer(i); //Object wrapper class
		int j=data.intValue();
		System.out.println("Integer Value using wrapper class: "+j);
		
		long l=12345; //primitive data type
		Long L=new Long(l); //Object wrapper class
		long x=L.longValue();
		System.out.println(" Long Value using wrapper class: "+x);
		
		float f=10; //primitive data type
		Float F=new Float(f); //Object wrapper class
		float y=F.floatValue();
		System.out.println(" Float Value using wrapper class: "+y);
		
		double d=3.14678; //primitive data type
		Double D=new Double(d); //Object wrapper class
		double z=D.doubleValue();
		System.out.println("Double Value using wrapper class: "+z);
		
	}

}
