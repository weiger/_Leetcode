package Array;
import java.util.*;

public class CombinationSum {

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
			dfs(nums,i,newTarget,res,list);
			list.remove(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,6,7};
		System.out.println(new CombinationSum().combinationSum(nums, 7));
	}

}
