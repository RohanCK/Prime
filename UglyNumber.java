/**
 * 
 */
package prime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohan
 * dp solution for generating numbers by 2,3 and 5
 *
 */
public class UglyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100000;
		System.out.println(nthUglyNumber(x));
	}
	public static int nthUglyNumber(int n) {
	
		if (n <= 0) return 0;
        List<Integer> ugly = new ArrayList<Integer>();
        ugly.add(1);

        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;

        while (ugly.size() < n) {
            int by2 = ugly.get(twoIndex) * 2;
            int by3 = ugly.get(threeIndex) * 3;
            int by5 = ugly.get(fiveIndex) * 5;

            int min = Math.min(by2, Math.min(by3, by5));
            ugly.add(min);

            if (min == by2) twoIndex++;
            if (min == by3) threeIndex++;
            if (min == by5) fiveIndex++;
        }

        return ugly.get(ugly.size() - 1);
	}

}
