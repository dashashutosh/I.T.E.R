package Basics;

public class Private {
	
	private String name="Ashutosh";
	private String mail="ashutosh2001@gmail.com";
	private int roll=274;
	
	public static void main(String[] args) {
		
		Private obj=new Private();
		System.out.println("Name is: "+obj.name);
		System.out.println("Mail is: "+obj.mail);
		System.out.println("Roll is: "+obj.roll);

	}

}
