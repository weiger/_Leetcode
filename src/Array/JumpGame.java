package Array;

public class JumpGame {

	public boolean canJump(int[] nums){
		
		int max_step = nums[0];
		
		for(int i = 0; i <= max_step && i < nums.length; i++){
			
			max_step = Math.max(max_step, nums[i]+i);
			
		}
		
		if(max_step < nums.length-1)
			return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		System.out.println(new JumpGame().canJump(nums));
		
		int[] nums1 = {3,2,1,0,4};
		System.out.println(new JumpGame().canJump(nums1));
	}

}
