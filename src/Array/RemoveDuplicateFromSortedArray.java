package Array;

public class RemoveDuplicateFromSortedArray {

	public int getNewLength(int[] nums){
		
		if(nums.length == 0)
			return 0;
		
		int index = 0, pre = 0;
		
		for(int cur = 0; cur < nums.length; cur++){
			if(nums[pre] == nums[cur])
				continue;
			
			nums[index++] = nums[pre];
			pre = cur;
		}
		
		nums[index++] = nums[nums.length-1];
		
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1,2,2,2,2,3,3,3,4,5,6};
		System.out.println(new RemoveDuplicateFromSortedArray().getNewLength(nums));
		
		int[] nums1 = {1,2,3,4,5,6};
		System.out.println(new RemoveDuplicateFromSortedArray().getNewLength(nums1));
		
		int[] nums2 = {1,2,3,3,3,4,5,5,5,6};
		System.out.println(new RemoveDuplicateFromSortedArray().getNewLength(nums2));
		
	}

}
