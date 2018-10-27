package Number;

import java.util.*;

public class SelfDividingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 1;
		int right = 22;
		List<Integer> a = new ArrayList<>();
		a = selfDividingNumbers(left, right);
		System.out.println(a);
		
		
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        int num = left;
        List<Integer> a = new ArrayList<>();
        while(num <= right) {
        	if(isDividing(num))
        		a.add(num);
        	num++;
        }
        return a;
    }
	
	public static boolean isDividing(int num) {
		for (int n = num; n > 0; n /= 10) {
			if (n % 10 == 0 || num % (n % 10) != 0) 
            	return false;
		}
        return true;
		
	}
	
	

}
