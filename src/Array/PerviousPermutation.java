package Array;

public class PerviousPermutation {

	public void perviousPermutation(int[] nums){
		if(nums.length == 0)
			return ;
		
		int p = nums.length-2;
		
		while(p >= 0 && nums[p] < nums[p+1])
			p--;
		
		if(p >= 0){
			int q = p+1;
			while(q < nums.length && nums[q] <= nums[p])
				q++;
			
			q--;
			
			swap(nums, p, q);
		}
		
		reverse(nums,p+1,nums.length-1);
	}
	
	public void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public void reverse(int[] nums, int i, int j){
		while(i <= j){
			swap(nums,i++,j--);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {3,2,1};
		new PerviousPermutation().perviousPermutation(nums1);
		for(int i : nums1) System.out.print(i+"   ");
	}

}
