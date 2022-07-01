
public class a6p5 {
public static boolean isPrime(int num){
	int flag=0;
	for(int i=2;i<=num/2;i++)
	{
		flag=0;
		if(num%i==0)
		{
			flag=1; break;
		}
	}
	if(flag==0)
	{
		System.out.println(num);
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		for(int i=2;i<=10000;i++)
		{
			boolean x=isPrime(i);
		}
	}

}
