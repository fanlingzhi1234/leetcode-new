package Other;



import java.util.concurrent.CountDownLatch;

/**
* @author Rexus 
* @version Build Time：Dec 1, 2018 2:21:11 AM
* @Explain
*/
public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(arrangeCoins(1)); 
	}
	public static int arrangeCoins(int n) {
       
        if(n<1) return 0;
        for(int i = 1; ; i++) {
        	n -= i;
        	if(n<0) return i-1;
        }
    }

}
