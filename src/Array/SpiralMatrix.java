package Array;
import java.util.*;

public class SpiralMatrix {

	public List<Integer> printSpiralMatrix(int[][] matrix){
		
		if(matrix.length == 0)
			return new ArrayList<>();
		
		List<Integer> res = new ArrayList<>();
		
		int rowStart = 0, rowEnd = matrix.length-1;
		int colStart = 0, colEnd = matrix[0].length-1;
		
		while(rowStart <= rowEnd && colStart <= colEnd){
			for(int i = colStart; i <= colEnd; i++){
				res.add(matrix[rowStart][i]);
			}
			
			rowStart++;
			
			for(int i = rowStart; i <= rowEnd; i++){
				res.add(matrix[i][colEnd]);
			}
			
			colEnd--;
			
			for(int i = colEnd; i >= colStart; i--){
				if(rowStart <= rowEnd){
					res.add(matrix[rowEnd][i]);
				}
			}
			
			rowEnd--;
			
			for(int i = rowEnd; i >= rowStart; i--){
				if(colStart <= colEnd){
					res.add(matrix[i][colStart]);
				}
			}
			
			colStart++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{ 1, 2, 3, 4},
				          { 5, 6 ,7, 8 },
				          { 9, 10,11,12}};
		
		System.out.println(new SpiralMatrix().printSpiralMatrix(matrix));
	}

}
