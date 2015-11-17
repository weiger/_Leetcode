package Array;
import java.util.*;

public class LargestRectangleInHistogram {

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
		int[] heights = {2,1,5,6,2,3};
		System.out.println(new LargestRectangleInHistogram().largestRectangleArea(heights));
	}

}
