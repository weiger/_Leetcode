package Array;
import java.util.*;

public class Subsets {

	public List<List<Integer>> subsets(int[] nums){
		if(nums.length == 0)
			return new ArrayList<>();
		
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		Arrays.sort(nums);
		
		dfs(nums,0,res,list);
		res.add(list);
		
		return res;
	}
	
	public void dfs(int[] nums, int start, List<List<Integer>> res, List<Integer> list){
		
		
		for(int i = start; i < nums.length; i++){
			list.add(nums[i]);
			if(!res.contains(list)){
				res.add(new ArrayList<>(list));
			}
			dfs(nums,i+1,res,list);
			list.remove(list.size()-1);
		}
	}
	
	// Iteration
	public List<List<Integer>> subsets2(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		res.add(list);
		
		if(nums.length == 0)
			return res;
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++){
			
			List<List<Integer>> newRes = new ArrayList<>();
			newRes.addAll(res);
			
			for(List<Integer> lists : res){
				
				List<Integer> temp = new ArrayList<>(lists);
				
				if(!temp.contains(nums[i])){
					temp.add(nums[i]);
					newRes.add(temp);
				}
			}
			
			res = newRes;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(new Subsets().subsets2(nums));
	}

}
