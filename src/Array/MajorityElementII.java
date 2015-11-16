package Array;
import java.util.*;

public class MajorityElementII {

	public List<Integer> majorityElement(int[] nums){
		List<Integer> res = new ArrayList<>();
		
		Integer num1 = null, num2 = null;
		int count1 = 0, count2 = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(num1 != null && nums[i] == num1){
				count1++;
			}else if(num2 != null && nums[i] == num2){
				count2++;
			}else if(count1 == 0){
				num1 = nums[i];
				count1 = 1;
			}else if(count2 == 0){
				num2 = nums[i];
				count2 = 1;
			}else{
				count1--;
				count2--;
			}
		}
		
		count1 = 0;
		count2 = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(num1 == nums[i])
				count1++;
			
			if(num2 == nums[i])
				count2++;
		}
		
		if(count1 > nums.length/3)
			res.add(num1);
		
		if(count2 > nums.length/3)
			res.add(num2);
		
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
