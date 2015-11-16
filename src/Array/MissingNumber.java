package Array;

public class MissingNumber {
	
	 public int missingNumber2(int[] nums) {
	        int s = nums.length;
	        
	        for (int i = 0; i < nums.length; i++) {
	            s += i - nums[i];
	        }
	        return s;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,3,1};
		System.out.println(new MissingNumber().missingNumber2(nums));
	}

}
