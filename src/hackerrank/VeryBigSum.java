/*
 * Problem: A Very Big Sum 
 * Platform: HackerRank
 * Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */

/*
 * Approach:
 * ----------------------------
 * - Initialize a variable `sum` to store total.
 * - Traverse the list using a loop.
 * - Add each element to `sum` (accumulator pattern).
 * - Return final sum.
 *
 * - Time Complexity: O(n) – single traversal.
 * - Space Complexity: O(1) – no extra space used.
 *
 * Pattern Used:
 * Accumulator / Reduction Pattern
 *
 * Constraint Insight:
 * ----------------------------
 * - Elements can be very large (≈10^9 or more).
 * - Sum may exceed int range (32-bit).
 * - Use long (64-bit) to prevent overflow.
 *
 */

/*
Sample Input:
5
1000000001 1000000002 1000000003 1000000004 1000000005

Expected Output:
5000000015
*/
package hackerrank;

import java.io.*;  
import java.util.*; 

class VeryBigSumResult {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for(long i : ar){
            sum += i;
        }
        return sum;
    }

}

public class VeryBigSum {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = VeryBigSumResult.aVeryBigSum(ar);

        System.out.println(result);
        
        bufferedReader.close();

	}

}
