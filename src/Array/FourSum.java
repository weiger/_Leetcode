package Array;
import java.util.*;

public class FourSum {

	public List<List<Integer>> fourSum(int[] nums, int target){
		if(nums.length == 0)
			return new ArrayList<>();
		
		List<List<Integer>> res = new ArrayList<>();
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				
				int start = j+1, end = nums.length-1;
				
				while(start < end){
					int sum = nums[i]+nums[j]+nums[start]+nums[end];
					
					if(sum == target){
						List<Integer> list = new ArrayList<>();
						
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[start]);
						list.add(nums[end]);
						
						if(!res.contains(list))
							res.add(list);
						start++;
						end--;
					}else if(sum > target){
						end--;
					}else{
						start++;
					}
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] S = {1, 0, -1, 0, -2,2};
		System.out.println(new FourSum().fourSum(S,0));
	}

}
