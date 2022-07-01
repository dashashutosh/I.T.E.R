import java.util.Scanner;

class student{
			 	Scanner sc=new Scanner(System.in);
				String name,course;
				int rollno;
				void input_Student (){
					name=sc.next();
					course=sc.next();
					rollno=sc.nextInt();
				}
				void display_Student (){
					System.out.println(name+ rollno+  course);
				}
			}
			class Exam extends student{
				int mark1, mark2, mark3;
				void input_Marks (){
					mark1=sc.nextInt();
					mark2=sc.nextInt();
					mark3=sc.nextInt();
				}
				void display_Result (){
					System.out.println(mark1+" "+ mark2+" "+mark3);
					
				}
			}
public class a2q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i;
				Exam e[]=new Exam[4];
				for(i=1;i<3;i++){
					e[i]=new Exam();
				
				}
				for(i=1;i<3;i++){
					e[i].input_Student();
					e[i].input_Marks();
				}
				for(i=1;i<3;i++){
					e[i].display_Student();
					e[i].display_Result();
				}

	}

}
