
public class p6a2 {
	public static int getpentagonal(int n){
	int p=(n*((3*n)-1))/2;
	return p;
}
	
	public static void main(String[] args) {
		int c=0;
		for(int i=1;i<=100;i++)
		{
			int penta=getpentagonal(i);
			System.out.print(penta+" , ");
			c++;
			if(c%10==0)
				System.out.println();
		}

	}

}
