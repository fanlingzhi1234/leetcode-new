package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 56.Merge Intervals
 * @author Reuxs
 *Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
 */
public class MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interval a = new Interval(1,3);
		Interval b = new Interval(2,6);
		Interval c = new Interval(8,10);
		Interval d = new Interval(15,18);
		
		List<Interval> list = new ArrayList<Interval>() ;
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		list = merge(list);
		System.out.println(list);
	}
	
	public static List<Interval> merge(List<Interval> intervals) {
		//get, sort;
		int n = intervals.size();
		int[] starts = new int[n];
		int[] ends = new int[n];
		
		for (int i = 0; i < n; i++) {
			starts[i] = intervals.get(i).start;
			ends[i] = intervals.get(i).end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		
		//Reconstruction
		List<Interval> res = new ArrayList<Interval>();
		for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
			if (i == n - 1 || starts[i + 1] > ends[i]) {
				res.add(new Interval(starts[j], ends[i]));
				j = i + 1;
			}
		}
		return res;
	}
	

}
class Interval{
	int start;
	int end;
	public Interval() {
		
	}
	public Interval (int start, int end) {
		this.start = start;
		this.end = end;
	}
}
