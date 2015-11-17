package Array;
import java.util.*;

public class InsertInterval {

	static class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
	 }
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval){
		
		List<Interval> res = new ArrayList<>();
		
		for(int i = 0; i < intervals.size(); i++){
			Interval cur = intervals.get(i);
			
			if(newInterval.end < cur.start){
				res.add(newInterval);
				newInterval = cur;
			}else if(newInterval.start > cur.end){
				res.add(cur);
			}else if(newInterval.start <= cur.end || newInterval.end >= cur.start){
				Interval interval = new Interval(Math.min(newInterval.start, cur.start), Math.max(newInterval.end, cur.end));
				newInterval = interval;
			}
		}
		
		res.add(newInterval);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
