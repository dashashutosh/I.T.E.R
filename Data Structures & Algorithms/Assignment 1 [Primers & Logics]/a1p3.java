
public class a1p3 {

	public static void main(String[] args) {
		int i,j,k,l,m,n;
		String []ar={"c","a","r","b","o","n"};
		int l1=ar.length;
		for(i=0;i<l1;i++)
		{
			for(j=0;j<l1;j++)
			{
				for(k=0;k<l1;k++)
				{
					for(l=0;l<l1;l++)
					{
						for(m=0;m<l1;m++)
						{
							for(n=0;n<l1;n++)
							{
								if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&j!=k&&j!=l&&j!=m&&j!=n&&k!=l&&k!=m&&k!=n&&l!=m&&l!=n&&m!=n)
								{
									System.out.println(ar[i]+ar[j]+ar[k]+ar[l]+ar[m]+ar[n]);
								}
							}
						}
					}
				}
			}
		}
		

	}

}
