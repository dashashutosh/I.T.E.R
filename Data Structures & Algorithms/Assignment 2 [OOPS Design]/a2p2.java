
class Complex {

int re,im; 
			 void setdata() { 
				 Scanner sc=new Scanner(System.in); 
				 System.out.println("enter real and 	
				 re=sc.nextInt(); im=sc.nextInt(); 
				 } 
			 void display() { 
				 System.out.println("the complex number 	
				 } 
		public	 complex add(complex obj1,complex obj2) 
			 { 
				 complex obj=new complex(); 
				 obj.re=obj1.re+obj2.re; 
				 obj.im=obj1.im+obj2.im; 
				 return obj; 
				 }

}

public class a2p2 {
		public static void main(String[] args)
		{
			complex obj1=new complex(); 
				complex obj2=new complex();
				obj1.setdata(); 
				obj2.setdata(); 
				complex obj=obj2.add(obj1, obj2); 
				obj.display();

		

	}

}
