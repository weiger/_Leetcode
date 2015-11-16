package Array;

public class SpiralMatrixII {

	public int[][] printSpiralMatrix(int n){
		
		if(n == 0)
			return null;
		
		int[][] matrix = new int[n][n];
		
		int rowStart = 0, rowEnd = n-1;
		int colStart = 0, colEnd = n-1;
		
		int num = 1;
		
		while(rowStart <= rowEnd && colStart <= colEnd){
			for(int i = colStart; i <= colEnd; i++){
				matrix[rowStart][i] = num++;
			}
			
			rowStart++;
			
			for(int i = rowStart; i <= rowEnd; i++){
				matrix[i][colEnd] = num++;
			}
			
			colEnd--;
			
			for(int i = colEnd; i >= colStart; i--){
				if(rowStart <= rowEnd){
					matrix[rowEnd][i] = num++;
				}
			}
			
			rowEnd--;
			
			for(int i = rowEnd; i >= rowStart; i--){
				if(colStart <= colEnd){
					matrix[i][colStart] = num++;
				}
			}
			
			colStart++;
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new SpiralMatrixII().printSpiralMatrix(3);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
