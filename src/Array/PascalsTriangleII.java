package Array;
import java.util.*;

public class PascalsTriangleII {

	public List<Integer> getRow(int n){
		
		if(n == 0) 
			return new ArrayList<>();
		
		List<Integer> res = new ArrayList<>();
		
		for(int i = 0; i <= n; i++)
			res.add(0);
		
		res.set(0,1);
		
		for(int i = 1; i <= n; i++){
			res.set(i,1);
			
			for(int j = i-1; j > 0; j--){
				res.set(j, res.get(j-1)+res.get(j));
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PascalsTriangleII().getRow(3));
	}

}
