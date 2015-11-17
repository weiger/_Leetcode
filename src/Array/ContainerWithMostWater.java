package Array;

public class ContainerWithMostWater {

	public int mostWather(int[] nums){
		if(nums.length == 0)
			return 0;
		
		int start = 0, end = nums.length-1;
		
		int max = 0;
		
		while(start < end){
			
			int area = (end-start)*Math.min(nums[start], nums[end]);
			max = Math.max(max, area);
			
			if(nums[start] < nums[end])
				start++;
			else
				end--;
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
