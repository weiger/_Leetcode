package Array;
import java.util.*;

public class ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k){
		
		if(nums.length == 0)
			return false;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			Integer index = map.get(nums[i]);
			
			if(index != null){
				if(i-index <= k)
					return true;
			}
			
			map.put(nums[i], i);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
