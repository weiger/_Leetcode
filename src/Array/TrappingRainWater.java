package Array;

public class TrappingRainWater {

	public int trappingRain(int[] nums){
		if(nums.length == 0)
			return 0;
		
		int n = nums.length;
		
		int[] left = new int[n];
		left[0] = nums[0];
		for(int i = 1; i < n; i++){
			left[i] = Math.max(left[i-1], nums[i]);
		}
		
		int[] right = new int[n];
		right[n-1] = nums[n-1];
		for(int i = n-2; i >=0 ; i--){
			right[i] = Math.max(right[i+1], nums[i]);
		}
		
		int area = 0;
		
		for(int i = 0; i < n; i++){
			area += Math.min(left[i], right[i])-nums[i];
		}
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(new TrappingRainWater().trappingRain(nums));
	}

}
