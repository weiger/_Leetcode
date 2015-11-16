package Array;
import java.util.*;

public class CombinationSumII {

	public List<List<Integer>> combinationSum(int[] nums, int target){
		
		if(nums.length == 0) 
			return new ArrayList<>();
		
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		Arrays.sort(nums);
		
		dfs(nums, 0, target, res, list);
		return res;
		
	}
	
	public void dfs(int[] nums, int start, int target, List<List<Integer>> res, List<Integer> list){
		
		if(target < 0) return ;
		
		if(target == 0){
			if(!res.contains(list)){
				res.add(new ArrayList<>(list));
				return ;
			}
		}
		
		for(int i = start; i < nums.length; i++){
			list.add(nums[i]);
			int newTarget = target-nums[i];
			dfs(nums,i+1,newTarget,res,list);
			list.remove(list.size()-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,1,2,7,6,1,5};
		System.out.println(new CombinationSumII().combinationSum(nums, 8));
	}

}
