
 class Commission {

	double sale ,x; 
		 Commission(double s) { 
			 sale=s;
			 }
	 double getComisson() {
		 if(sale<500) 
			 x=0.02*sale; 
		 else	 if(sale>500&&sale<5000) 
			 x=sale*0.05; 
		 else if(sale>5000) 
			 x=sale*0.08; 
		 return x; 
	}

public class Demo {
	
public static void main(String[] args)
	{
		
	Scanner sc = new Scanner(System.in);
				System.out.println("sale is"); 
				double s=sc.nextDouble(); 
				if(s<0) 
					System.out.println("invlid input");
				else { 
					comission obj=new comission(s); 
					double res=obj.getComisson(); 
					System.out.println("COMISSION=  "+res);
				}	
	
		

	}

}
