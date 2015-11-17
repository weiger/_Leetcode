package Array;
import java.util.*;

public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target){
		
		Arrays.sort(nums);
        
        int len = nums.length;
        int sum = nums[0]+nums[1]+nums[len-1];
        int diff = Math.abs(sum - target);
        int res = sum;
        
        for(int i = 0; i < len-2; i++){
        
            int low = i+1, high = len-1;
            while(low < high){
                int sum2 = nums[i] + nums[low] + nums[high];
                int diff2 = Math.abs(sum2 - target);
                
                if(diff > diff2){
                    diff = diff2;
                    res = sum2;
                }
                
                if(sum2 == target){
                    return sum2;
                }else if(sum2 > target){
                    high--;
                }else{
                    low++;
                }
            }
        }
        System.out.println(res);
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,2,1,-4};
		new ThreeSumClosest().threeSumClosest(nums, 1);
	}

}
