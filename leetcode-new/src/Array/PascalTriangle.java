package Array;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.List;

/**
* @author Rexus 
* @version Build Time：Dec 12, 2018 3:20:30 PM
* @Explain
* 
* 118. Pascal's Triangle
* 
* Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		System.out.println(generate(number));
	}
	//0ms 100%
	public static List<List<Integer>> generate(int numRows) {
		
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        for(int i =1 ; i< numRows; i++) {
        	List<Integer> group = new ArrayList<>();
        	group.add(1);
        	for(int j =1; j< i; j++) {
        		group.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
        	}
        	group.add(1);
        	result.add(group);
        	
        }
        
        return result;
    }

}
