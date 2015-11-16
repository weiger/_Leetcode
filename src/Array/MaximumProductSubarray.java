package Array;

public class MaximumProductSubarray {

	public int maxProduct(int[] nums){
		if(nums.length == 0)
			return 0;
		
		int max = nums[0], min = nums[0],res = nums[0];
		
		for(int i = 1; i < nums.length; i++){
			int copy_max = max;
			
			max = Math.max(nums[i], Math.max(nums[i]*max, nums[i]*min));
			min = Math.min(nums[i], Math.min(nums[i]*copy_max, nums[i]*min));
			res = Math.max(res, max);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,-2,4};
		System.out.println(new MaximumProductSubarray().maxProduct(nums));
	}

}
