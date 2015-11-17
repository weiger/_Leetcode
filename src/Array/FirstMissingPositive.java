package Array;

public class FirstMissingPositive {

	public int missingPositive(int[] nums){
		
		if(nums.length == 0)
			return 1;
		
		int i = 0;
		while(i < nums.length){
			if(nums[i] != (i+1) && nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
				swap(nums,i,nums[i]-1);
			}else{
				i++;
			}
		}
		
		for(i = 0; i < nums.length; i++){
			if(nums[i] != i+1)
				return i+1;
		}
		return nums.length+1;
	}
	
	public void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,0};
		System.out.println(new FirstMissingPositive().missingPositive(nums));
		
		int[] nums1 = {3,4,-1,1};
		System.out.println(new FirstMissingPositive().missingPositive(nums1));
	}

}
