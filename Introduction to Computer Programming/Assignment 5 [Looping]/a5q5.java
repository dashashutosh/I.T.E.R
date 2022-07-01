import java.util.Scanner;
public class a5q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int c=0,sum=0;
System.out.println("enter the total no. of numbers: ");
int n=sc.nextInt();
if(n==0)
{
System.out.println("sum is 0 and average is 0");
}
else
{
System.out.println("enter "+n+" numbers one by one");
for(int i=1;i<=n;i++)
{
int nums=sc.nextInt();
c++;
sum=sum+nums;
}
double avg=(double)sum/c;
System.out.println("sum is "+sum+" and average is "+avg);
}

	}

}
