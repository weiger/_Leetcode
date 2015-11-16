package Array;

public class ProductOfArrayExceptItself {

	public int[] product(int[] nums){
		if(nums.length == 0)
			return nums;
		
		int[] res = new int[nums.length];
		res[nums.length-1] = 1;
		
		for(int i = nums.length-2; i >= 0; i--){
			res[i] = res[i+1]*nums[i+1];
		}
		
		int left = 1;
		for(int i = 0; i < nums.length; i++){
			res[i] *= left;
			left *= nums[i];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] res = new ProductOfArrayExceptItself().product(nums);
		for(int i : res) System.out.print(i+"   ");
	}

}
