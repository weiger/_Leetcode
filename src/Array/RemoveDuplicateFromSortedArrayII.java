package Array;

public class RemoveDuplicateFromSortedArrayII {

	public int removeDuplicate(int[] nums){
		
		if(nums.length == 0)
			return 0;
		
		int index = 0,pre = 0;
		
		for(int i = 1; i < nums.length; i++){
			if(nums[pre] == nums[i])
				continue;
			else{
				if(i - pre >= 2){
					nums[index++] = nums[pre];
					nums[index++] = nums[pre];
					pre = i;
				}else{
					nums[index++] = nums[pre];
					pre = i;
				}
			}
		}
		
		if(pre == nums.length-1){
			nums[index++] = nums[pre];
		}else{
			nums[index++] = nums[pre];
			nums[index++] = nums[pre];
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
