package Array;

import java.util.*;

public class ThreeSum {

	// sort the array first, time complexity is O(nlogn) 
	public List<List<Integer>> threeSum(int[] nums){
		
		List<List<Integer>> res = new ArrayList<>();
		
		if(nums.length == 0)
			return res;
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length-1; i++){
			if(i == 0 || nums[i-1] != nums[i]){
				int start = i+1, end = nums.length-1;
				
				while(start < end){
					int sum = nums[i] + nums[start] + nums[end];
					if(sum == 0){
						List<Integer> list = new ArrayList<>();
						
						list.add(nums[i]);
						list.add(nums[start]);
						list.add(nums[end]);
						
						res.add(list);
						start++;
						end--;
						
						while(start < end && nums[start] == nums[start-1])
							start++;
						
						while(start < end && nums[end] == nums[end+1])
							end--;
					}else if(sum > 0){
						end--;
					}else{
						start++;
					}
				}
			}
		}
		return res;	
	}
	
	// no sort
	public List<List<Integer>> threeSum2(int[] nums){
		if(nums.length == 0)
			return new ArrayList<>();
		
		List<List<Integer>> res = new ArrayList<>();
		
		Map<Integer,List<List<Integer>>> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				int sum = nums[i]+nums[j];
				
				if(map.containsKey(sum)){
					List<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					map.get(sum).add(list);
				}else{
					List<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					List<List<Integer>> lists = new ArrayList<>();
					lists.add(list);
					map.put(sum,lists);
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++){
			
			if(map.containsKey(0-nums[i])){
				for(List<Integer> list : map.get(0-nums[i])){
					if(!list.contains(i)){
						List<Integer> indices = new ArrayList<>();
						indices.add(nums[list.get(0)]);
						indices.add(nums[list.get(1)]);
						indices.add(nums[i]);
						
						Collections.sort(indices);
						
						if(!res.contains(indices))
							res.add(indices);
					}
				}
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(new ThreeSum().threeSum2(nums));
	}

}
