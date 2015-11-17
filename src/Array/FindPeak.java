package Array;

public class FindPeak {

	public int findPeak(int[] nums){
		if(nums.length == 0)
			return 0;
		
		int start = 0, end = nums.length-1;
		
		while(start < end){
			int mid = (start+end+1)/2;
			
			if(mid == 0|| nums[mid] > nums[mid-1])
				start = mid;
			else
				end = mid-1;
		}
		
		return nums[start];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(new FindPeak().findPeak(nums));
	}

}
