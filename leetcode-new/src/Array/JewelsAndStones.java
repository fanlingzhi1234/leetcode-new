package Array;

/**
 * 771. Jewels and Stones
 * @author Reuxs
 *
 *
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

 */
public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J="aA";
		String S ="aAAbbbb";
		String J1 ="z";
		String S1 = "ZZ";
		System.out.println(numJewelsInStones(J1,S1));

	}
	
	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		if (J == null || J.length() == 0 || S == null || S.length() == 0) {
            return count;
        }
		for( int i= 0; i< J.length();i++) {
			for(int j=0; j< S.length(); j++) {
				if(J.charAt(i) == S.charAt(j)) {
					count += 1;
				}
			}
		}
		return count;
    }
	
	public static int numJewelsInStones2(String J, String S) {
        int cntJewels = 0;
        if (J == null || J.length() == 0 || S == null || S.length() == 0) {
            return cntJewels;
        }
        int[] hash = new int[256];
        for (char ch : S.toCharArray()) {
            hash[ch]++;
        }
        for (char ch : J.toCharArray()) {
            if (hash[ch] != 0) {
                cntJewels += hash[ch];
                hash[ch] = 0;
            }
        }
        return cntJewels;
    }

}
