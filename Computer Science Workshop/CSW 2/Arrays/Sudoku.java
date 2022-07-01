package Chapter_06;

public class Sudoku {
	
	static int board[][]= {
			
	 {5,3,0,0,7,0,0,0,0},
	 {6,0,0,1,9,5,0,0,0},
	 {0,9,8,0,0,0,0,6,0},
	 {8,0,0,0,6,0,0,0,3},
	 {4,0,0,8,0,3,0,0,1},
	 {7,0,0,0,2,0,0,0,6},
	 {0,6,0,0,0,0,2,8,0},
	 {0,0,0,4,1,9,0,0,5},
	 {0,0,0,0,8,0,0,7,9}
						  };
	
	static final int size=9;
	static final int empty=0;
	
	Sudoku(){
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;i++) {
			}	
		}
	}
	
	public static boolean isInRow(int row,int n) {
	
		for(int i=0;i<size;i++) {
			if(board[row][i]==n)
				return true;
		}
		return false;
	}
	
	public static boolean isInColn(int col,int n) {
	
		for(int i=0;i<size;i++) {
			if(board[i][col]==n)
				return true;
		}
		return false;
	}
	
	public static boolean isInSubgrid(int row,int col,int n) {
		
		int r=row-(row%3);
		int c=col-(col%3);
		
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(board[i][j]==n)
					return true;
			}
		}
		return false;
	}
	
	public static boolean isInPosn(int row,int col,int n) {
		return !isInRow(row,n) && !isInColn(col,n) && !isInSubgrid(row,col,n);
	}
	
	public static boolean solve() {
		
		for(int row=0;row<size;row++) {
			for(int col=0;col<size;col++) {
					
				if(board[row][col]==empty) {
						
						for(int n=1;n<=size;n++) {
							if(isInPosn(row,col,n)) {
								board[row][col]=n;
								
								if(solve())
									return true;
								else
									board[row][col]=empty;
							}	
						}
						return false;
				}
			}
		}
		return true;
	}
	
	public static void show() {
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) 
					System.out.print(board[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		show();
		if(solve()) 
			System.out.println("\nThis is a valid Solvable Sudoku");
		else
			System.out.println("\nThis is an invalid Unsolvable Sudoku");

	}

}
