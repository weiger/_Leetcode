package Array;

public class SearchInsertPosition {

	public int insertPosition(int[] nums, int target){
		if(nums.length == 0)
			return 0;
		
		int start = 0, end = nums.length-1;
		
		if(nums[start] > target)
			return start;
		
		if(nums[end] == target)
			return end;
		
		if(nums[end] < target)
			return end+1;
		
		while(start < end){
			
			int mid = start + (end-start)/2;
			
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] > target){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		
		if(start == end && nums[start] < target)
			return start+1;
		
		return end;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3,5,6};
		System.out.println(new SearchInsertPosition().insertPosition(nums1,5));
		
		int[] nums2 = {1,3,5,6};
		System.out.println(new SearchInsertPosition().insertPosition(nums2,2));
		
		int[] nums3 = {1,3,5,6};
		System.out.println(new SearchInsertPosition().insertPosition(nums3,7));
		
		int[] nums4 = {1,3,5,6};
		System.out.println(new SearchInsertPosition().insertPosition(nums4,0));
		
	}

}
