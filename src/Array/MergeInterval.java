package Array;
import java.util.*;

public class MergeInterval {

	 static class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
	 }
	
	public List<Interval>  merge(List<Interval> intervals){
		if(intervals.size() == 0)
			return new ArrayList<>();
		
		List<Interval> res = new ArrayList<>();
		
		Collections.sort(intervals, new Comparator<Interval>(){
			
			public int compare(Interval i1, Interval i2){
				return i1.start - i2.start;
			}
			
		});
		
		Interval pivot = intervals.get(0);
		
		for(int i = 1; i < intervals.size(); i++){
			Interval cur = intervals.get(i);
			
			if(pivot.end < cur.start){
				res.add(pivot);
				pivot = cur;
			}else{
				Interval newInterval = new Interval(pivot.start, Math.max(pivot.end, cur.end));
				pivot = newInterval;
			}
		}
		res.add(pivot);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
