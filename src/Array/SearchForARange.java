package Array;

public class SearchForARange {

	public int[] searchRange(int[] nums, int target){
		
		return search(nums, 0, nums.length-1,target);
		
	}
	
	public int[] search(int[] nums, int start, int end,int target){
		int[] res = {-1,-1};
		
		while(start <= end){
			int mid = start + (end-start)/2;
			
			if(nums[mid] > target){
				end = mid-1;
			}else if(nums[mid] < target){
				start = mid+1;
			}else{
				int[] left = search(nums,start,mid-1,target);
				res[0] = left[0] == -1 ? mid : left[0];
				
				int[] right = search(nums,mid+1,end,target);
				res[1] = right[1] == -1 ? mid : right[1];
				
				break;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int[] res = new SearchForARange().searchRange(nums, 1);
		System.out.println(res[0]+"   "+res[1]);
	}

}
