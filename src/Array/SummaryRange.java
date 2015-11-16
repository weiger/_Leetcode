package Array;

import java.util.*;

public class SummaryRange {

	public List<String> summaryRanges(int[] nums){
		
		List<String> res = new ArrayList<>();
		
		if(nums.length == 0)
			return res;
		
		// Only one element 
		if(nums.length == 1){
			res.add(String.valueOf(nums[0]));
			return res;
		}
		
		int pivot = 0;
		
		for(int i = 1; i < nums.length; i++){
			
			if(nums[i] == nums[i-1]+1)
				continue;
			
			StringBuffer sb = new StringBuffer();
			
			if(pivot == i-1){
				sb.append(nums[pivot]);
			}else{
				sb.append(nums[pivot]).append("--->").append(nums[i-1]);
			}
			
			res.add(sb.toString());
			pivot = i;
		}
		
		if(pivot != nums.length-1){
			String s = new StringBuffer().append(nums[pivot]).append("--->").append(nums[nums.length-1]).toString();
			res.add(s);
		}else{
			String s = new StringBuffer().append(nums[pivot]).toString();
			res.add(s);
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,4,5,7};
		System.out.println(new SummaryRange().summaryRanges(nums));
		
		int[] nums1 = {1,3};
		System.out.println(new SummaryRange().summaryRanges(nums1));
	}

}
