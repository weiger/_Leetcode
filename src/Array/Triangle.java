package Array;
import java.util.*;

public class Triangle {

	public int minSum(List<List<Integer>> triangle){
		
		int len = triangle.get(triangle.size()-1).size();
		
		int[] dp = new int[len];
		
		for(int i = 0; i < len; i++){
			dp[i] = triangle.get(triangle.size()-1).get(i);
		}
		
		for(int i = triangle.size()-2; i >= 0; i--){
			
			for(int j = 0; j < triangle.get(i).size(); j++){
				dp[j] = Math.min(dp[j], dp[j+1])+triangle.get(i).get(j);
			}
		}
		return dp[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
