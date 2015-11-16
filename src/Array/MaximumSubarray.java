package Array;

public class MaximumSubarray {

	public int maxSubarray(int[] nums){
		if(nums.length == 0)
			return 0;
		
		int max = Integer.MIN_VALUE, sum = 0;
		
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
			
			sum = Math.max(sum, nums[i]);
			max = Math.max(max,sum);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new MaximumSubarray().maxSubarray(nums));
	}

}
