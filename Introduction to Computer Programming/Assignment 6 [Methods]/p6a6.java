
public class p6a6 {
public static boolean prime (int n)
{
	
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
		int c1=0;
		for(int i=2;c1<100;i++)
		{
			boolean x=prime(i);
		
			if(x==true)
			{			
			int rev=0;
			int temp=i;
			while(temp!=0)
			{
				rev=(rev*10)+(temp%10);
				temp=temp/10;
			}
			if(i==rev)
			{
				System.out.print(i+ " ");

				c1++;
			
				if(c1%10==0)
				{
					System.out.println();
				}
			}

	      }
		}

	}
	}
