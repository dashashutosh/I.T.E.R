package Strings_N_Things;

public class TestEfficient {

	public static void main(String[] args) {
		
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Java");
		for(int i=0;i<10;i++)
			sb.append("This is Eclipse IDE");
		System.out.println("append StringBuffer: "+sb);
		System.out.println("Time taken by StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder sb2=new StringBuilder("Java");
		for(int i=0;i<10;i++)
			sb2.append("This is Eclipse IDE");
		System.out.println("Time taken by StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
		
	}

}
