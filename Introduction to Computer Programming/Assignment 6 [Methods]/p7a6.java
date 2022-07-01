
public class p6a7 {
public static boolean twinprime(int n){
				int c=0;
					int flag=0;
				for(int i=2;i<=n/2;i++)
				{
			
					if(n%i==0)
					{
						flag=1; 
						break;
					}
				}
			if(flag==0)
			{
				
				return true;
			}
			else
			return false;
			

}
	public static void main(String[] args) {
		int c=2;
		for(int k=2;k<1000;k++)
		{
			boolean x=twinprime(k);
			if(x==true)
			{
				if(k-c==2)
				{
					System.out.println(c+" "+k);
				}
				c=k;
			}
		}
			
		
	}

}
