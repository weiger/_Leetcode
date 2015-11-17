package Array;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target){
		if(nums.length == 0)
			return -1;
		
		int start = 0, end = nums.length-1;
		
		while(start <= end){
			int mid = start+(end-start)/2;
			
			if(nums[start] == target)
				return start;
			
			if(nums[end] == target)
				return end;
			
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] > target){
				if(nums[start] > target)
					start++;
				else
					end = mid-1;
			}else{
				if(nums[end] > target)
					start = mid+1;
				else
					end--;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(new SearchInRotatedSortedArray().search(nums, 1)); 
	}

}
