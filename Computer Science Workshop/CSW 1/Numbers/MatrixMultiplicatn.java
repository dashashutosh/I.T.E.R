package Numbers;

public class MatrixMultiplicatn {

	public static void main(String[] args) {
		
		int a[][]= {{3,2,3} , {5,9,8}, {4,3,2}};
		int b[][]= {{4,5,6} , {9,5,8}, {0,6,5}};
		int c[][]=new int[3][3];
		
		System.out.println("Matrix A:- ");
		for(int i=0;i<3;i++) {    
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix B:- ");
		for(int i=0;i<3;i++) {    
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
			
		System.out.println("Product of 2 Matrices:-");	
		for(int i=0;i<3;i++) {    
			
			for(int j=0;j<3;j++){   
			
				c[i][j]=0;      
				for(int k=0;k<3;k++) {      
					c[i][j]+=a[i][k]*b[k][j];      
				} 
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}		  
		
	}

}
