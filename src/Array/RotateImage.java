package Array;

public class RotateImage {

	public void rotate(int[][] matrix){
		
		if(matrix.length == 0)
			return ;
		
		int n = matrix.length-1;
		
		for(int i = 0; i <= n-i; i++){
			for(int j = 0; j <= n-i-1; j++){
				int temp = matrix[j][n-i];
				matrix[j][n-i] = matrix[i][j];
				matrix[i][j] = matrix[n-j][i];
				matrix[n-j][i] = matrix[n-i][n-j];
				matrix[n-i][n-j] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
