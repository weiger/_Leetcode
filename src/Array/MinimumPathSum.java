package Array;

public class MinimumPathSum {

	public int getMinPathSum(int[][] nums){
		
		if(nums.length == 0)
			return 0;
		
		for(int i = 1; i < nums.length; i++){
			nums[i][0] += nums[i-1][0];
		}
		
		for(int i = 1; i < nums[0].length; i++){
			nums[0][i] += nums[0][i-1];
		}
		
		for(int i = 1; i < nums.length; i++){
			for(int j = 1; j < nums[0].length; j++){
				nums[i][j] += Math.min(nums[i-1][j], nums[i][j-1]);
			}
		}
		
		return nums[nums.length-1][nums[0].length-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
