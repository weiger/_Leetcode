package Array;

public class Search2DMatrix {

	public boolean isExist(int[][] matrix, int target){
		
		if(matrix.length == 0)
			return false;
		
		int start = 0, end = matrix.length*matrix[0].length-1;
		
		while(start <= end){
			
			int mid = start + (end-start)/2;
			
			int i = mid/matrix[0].length, j = mid%matrix[0].length;
			
			if(matrix[i][j] == target){
				return true;
			}else if(matrix[i][j] > target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,   3,  5,  7},
				  {10, 11, 16, 20},
				  {23, 30, 34, 50}};
		
		System.out.println(new Search2DMatrix().isExist(matrix, 3));
		System.out.println(new Search2DMatrix().isExist(matrix, 16));
		System.out.println(new Search2DMatrix().isExist(matrix, 23));
		System.out.println(new Search2DMatrix().isExist(matrix, 31));
		
	}

}
