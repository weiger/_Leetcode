package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIII {

public List<List<Integer>> combinationSum(int k, int n){
		
		if(k == 0) 
			return new ArrayList<>();
		
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		dfs(k,n, 1, res, list);
		return res;
		
	}
	
	public void dfs(int k, int n, int start, List<List<Integer>> res, List<Integer> list){
		
		if(list.size() > k || n < 0) return ;
		
		if(list.size() == k && n == 0){
			if(!res.contains(list)){
				res.add(new ArrayList<>(list));
				return ;
			}
		}
		
		for(int i = start; i <= 9; i++){
			list.add(i);
			int newN = n-i;
			dfs(k,newN,i+1,res,list);
			list.remove(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CombinationSumIII().combinationSum(3, 7));
	}

}
