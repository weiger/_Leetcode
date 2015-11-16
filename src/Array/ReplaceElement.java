package Array;

public class ReplaceElement {

	public int getNewLength(int[] nums, int target){
		if(nums.length == 0)
			return 0;
		
		int index = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != target){
				nums[index++] = nums[i];
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,1,2,3,4,5};
		int res = new ReplaceElement().getNewLength(nums, 2);
		System.out.println(res);
	}

}
