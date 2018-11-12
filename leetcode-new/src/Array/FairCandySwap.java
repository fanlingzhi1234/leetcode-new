package Array;

import java.util.HashSet;

/**
 * 888. Fair Candy Swap
 * @author Rexus
 *
 *
Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.

Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)

Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.

If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.

 

Example 1:

Input: A = [1,1], B = [2,2]
Output: [1,2]
Example 2:

Input: A = [1,2], B = [2,3]
Output: [1,2]
Example 3:

Input: A = [2], B = [1,3]
Output: [2,3]
Example 4:

Input: A = [1,2,5], B = [2,4]
Output: [5,4]

 */
public class FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1};
		int[] B = {2,2};
		System.out.println(fairCandySwap(A, B));
	}
	
	public static  int[] fairCandySwap(int[] A, int[] B) {
		int sumA= 0;
        int sumB= 0;
        for(int a : A) {
        	sumA += a;
        }
        for(int b : B) {
        	sumB += b;
        }
        
        int diff= (sumA-sumB) /2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int a : A) {
        	set.add(a);
        }
        for(int b : B) {
        	if(set.contains((b+diff))){
        		return new int[] {b+diff, b};
        	}
        }
        return new int[0];
        
        
    }

}
