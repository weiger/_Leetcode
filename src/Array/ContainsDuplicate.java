package Array;

import java.util.*;

public class ContainsDuplicate {

	/*
	Given an array of integers, find if the array contains any duplicates. 
	Your function should return true if any value appears at least twice in the 
	array, and it should return false if every element is distinct.
	*/
	
	// Using hash set and Time complexity is O(n) and use extra space
	public boolean containsDuplicate(int[] nums) {
		
		if(nums.length == 0) 
			return false;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < nums.length; i++){
			
			if(set.contains(nums[i])){
				return true;
			}
			
			set.add(nums[i]);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,1};
		System.out.println(new ContainsDuplicate().containsDuplicate(nums));
	}

}
