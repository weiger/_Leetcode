package Array;

public class MinimumSizeOfSubarraySum {

	public int getMinimumSize(int[] nums, int target){
		
		if(nums.length == 0) 
			return 0;
		
		int start = 0, i = 0, sum = nums[0];
		int min = nums.length+1;
		
		
		while(i < nums.length){
			
			if(sum < target && ++i < nums.length){
				sum += nums[i];
			}else{
				min = Math.min(min, i-start+1);
				sum -= nums[start++];
			}
		}
		
		if(min > nums.length)
			return 0;
		
		return min;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,2,4,3};
		System.out.println(new MinimumSizeOfSubarraySum().getMinimumSize(nums, 7));
	}

}
