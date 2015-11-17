package Array;

public class FindTheDuplicateNumber {

	// No change the array
	public int findDuplicate(int[] nums){
		
		int slow = nums[0], fast = nums[0];
		
		slow = nums[slow];
		fast = nums[nums[fast]];
		
		while(slow != fast){
			slow = nums[slow];
			fast = nums[nums[fast]];
		}
		
		slow = nums[0];
		
		while(slow != fast){
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
	
	// change the array but no extra space
	public int findDuplicate2(int[] nums){
		for(int i = 0; i < nums.length; i++){
			int index = Math.abs(nums[i]);
			if(nums[index] > 0)
				nums[index] *= -1;
			else
				return index;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
