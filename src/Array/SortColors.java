package Array;

public class SortColors {

	public void sortColors(int[] nums){
		if(nums.length == 0)
			return ;
		
		int zero = 0, cur = 0, two = nums.length-1;
		
		while(cur <= two){
			
			if(nums[cur] == 0){
				swap(nums,cur,zero);
				cur++;
				zero++;
			}else if(nums[cur] == 1){
				cur++;
			}else if(nums[cur] == 2){
				swap(nums,cur,two);
				two--;
			}
		}
	}
	
	public void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
