package Array;
import java.util.*;

public class MaximalRectangle {

	public int maximalRectangle(int[][] matrix){
		if(matrix.length == 0)
			return 0;
		
		int[] height = new int[matrix[0].length];
		
		int max = 0;
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 1)
					height[j] += 1;
				else
					height[j] = 0;
			}
			
			max = Math.max(max,largestRectangleArea(height));
		}
		return max;
	}
	
	public int largestRectangleArea(int[] heights){
		
		int res = 0;
		
		int[] h = new int[heights.length+1];
		h = Arrays.copyOf(heights, heights.length+1);
		
		Stack<Integer> stack = new Stack<>();
		
		int i = 0;
		while(i < h.length){
			if(stack.isEmpty() || h[stack.peek()] < h[i]){
				stack.push(i++);
			}else{
				int index = stack.pop();
				
				int area = h[index] * (stack.isEmpty() ? i : i-stack.peek()-1);
				res = Math.max(res, area);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
