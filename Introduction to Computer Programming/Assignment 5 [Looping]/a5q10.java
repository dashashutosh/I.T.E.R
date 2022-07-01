import java.util.Scanner;
public class a5q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
double err=Math.pow(10,-6);
double term=x;
double sum=x;
int sign=-1;
int i=1;
while(Math.abs(term)>err)
{
	i=i+2;
	term=term*((x*x)/(i*(i-1)));
	sum=sum+(sign*term);
	sign=-sign;
}
System.out.println(sum);
	}

}
