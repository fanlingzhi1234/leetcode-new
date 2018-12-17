package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* @author Rexus 
* @version Build Time：Dec 12, 2018 4:05:08 PM
* @Explain
* 
* 119. Pascal's Triangle 2
* Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]
Follow up:

Could you optimize your algorithm to use only O(k) extra space?
*/
public class PascalTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowIndex = 4;
		System.out.println(getRow(rowIndex));
	}
	//2ms 39.95%
	public static List<Integer> getRow(int rowIndex) {
        
		List<Integer> result = new ArrayList<>();
		
        if(rowIndex == 0) {
        	result.add(1);
        	return result;
        }
        for(int i =0; i< rowIndex + 1; i++) {
        	result.add(0,1);
        	for(int j = 1; j < result.size() -1; j++) {
        		result.set(j,result.get(j+1) + result.get(j));
        	}
        }
        return result;
    }
//	The best using maths formula , 0ms, 100%,
//	1st: 1=1
//	2nd: 6= 6 / 1
//	3rd: 15=6x5 / (1x2)
//	4th: 20=6x5x4 / (1x2x3)
//	5th: 15=6x5x4x3 / (1x2x3x4)
//	6th: 6 =6x5x4x3x2 / (1x2x3x4x5)
//	7th: 1 =6x5x4x3x2x1 / (1x2x3x4x5x6)
	
	public List<Integer> getRow2(int rowIndex) {
        List<Integer> res = new LinkedList<>();
         res.add(1);
        if (rowIndex == 0) return res;
        int t = rowIndex, b = 1;
        long cur = 1;
        for(int i = 1; i < rowIndex+1; i++){
            cur = cur * t;
            cur = cur / b;
            res.add((int)cur);
            t--;b++;
        }
        return res;
    }

}
