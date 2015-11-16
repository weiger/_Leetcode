package Array;

public class MoveZeros {

	// keep order
	public void moveZeros(int[] nums){
		if(nums.length == 0)
			return ;
		
		int index = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0)
				nums[index++] = nums[i];
		}
		
		for(int i = index; i < nums.length; i++){
			nums[i] = 0;
		}
	}
	
	// minimize operation
	public void moveZeros2(int[] nums){
		if(nums.length == 0)
			return ;
		
		int start = 0, end = nums.length-1;
		
		while(start < end){
			if(nums[start] != 0)
				start++;
			else if(nums[end] == 0)
				end--;
			else{
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,2,0,3,0,5,6,7,0,6};
		new MoveZeros().moveZeros2(nums);
		for(int i : nums) System.out.print(i+"   ");
	}

}
