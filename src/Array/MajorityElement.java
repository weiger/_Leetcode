package Array;

public class MajorityElement {

	public int majority(int[] nums){
		
		if(nums.length == 0)
			return 0;
		
		int count = 1, pivot = nums[0];
		
		for(int i = 1; i < nums.length; i++){
			
			if(count == 0){
				pivot = nums[i];
				count = 1;
			}else if(nums[i] == pivot){
				count++;
			}else{
				count--;
			}
		}
		
		return pivot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
