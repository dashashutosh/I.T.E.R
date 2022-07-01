
public class a5q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
          for (int i=100;i<=1000;i++)
          {
        	 
        	  if(i%5==0&&i%6==0)
        	  {
        		 System.out.print(i+" ");
        	      c++;
        	      if(c%10==0)
        	      {
        		  System.out.println();
        	      }
        	  }
          }
	}

}
