package Array;
import java.util.*;

public class PascalsTriangle {

	public List<List<Integer>> generate(int n){
		
		List<List<Integer>> res = new ArrayList<>();
		
		if(n == 0) return res;
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		res.add(list);
		
		if(n == 1){
			return res;
		}
		
		list = new ArrayList<>();
		list.add(1);
		list.add(1);
		res.add(list);
		
		if(n == 2)
			return res;
		
		for(int i = 2; i < n; i++){
			list = new ArrayList<>();
			
			list.add(1);
			
			for(int j = 0; j < res.get(i-1).size()-1; j++){
				int sum = res.get(i-1).get(j)+res.get(i-1).get(j+1);
				list.add(sum);
			}
			
			list.add(1);
			
			res.add(list);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
