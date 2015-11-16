package Array;
import java.util.*;

public class TwoSum {

	public int[] twoSum(int[] nums, int target){
		
		int[] res = {-1,-1};
		
		if(nums.length == 0)
			return res;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(target-nums[i])){
				res[0] = map.get(target-nums[i])+1;
				res[1] = i+1;
				break;
			}
			
			map.put(nums[i], i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
