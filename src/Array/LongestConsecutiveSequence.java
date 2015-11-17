package Array;
import java.util.*;

public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums){
		if(nums.length == 0)
			return 0;
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++)
			set.add(nums[i]);
		
		
		int count = 0, max = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(set.contains(nums[i])){
				count = 1;
				set.remove(nums[i]);
				
				int small = nums[i]-1;
				while(set.contains(small)){
					count++;
					set.remove(small);
					small--;
				}
				
				int great = nums[i]+1;
				while(set.contains(great)){
					count++;
					set.remove(great);
					great++;
				}
			}
			
			max = Math.max(max, count);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,3,2};
		System.out.println(new LongestConsecutiveSequence().longestConsecutive(nums));
	}

}
