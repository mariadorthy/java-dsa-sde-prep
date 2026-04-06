/*
 * Problem: Simple Array Sum 
 * Platform: HackerRank
 * Link: https://www.hackerrank.com/challenges/simple-array-sum/problem
 */

/*
 * Approach:
 * ----------------------------
 * - Initialize a variable `sum` to store the total.
 * - Traverse the list of integers using a single loop.
 * - For each element, add its value to `sum` (accumulator pattern).
 * - After processing all elements, return the final sum.
 * - Time Complexity: O(n) – one pass through the array.
 * - Space Complexity: O(1) – no extra space used.
 *
 * Pattern Used:
 * Accumulator / Reduction Pattern – commonly used for sum, count, product, etc.
 *
 */

/*
Sample Input:
6
1 2 3 4 10 11

Expected Output:
31
*/
package hackerrank;

import java.io.*;
import java.util.*;


class Result{
	public static int simpleArraySum(List<Integer> ar) {
        int sum=0;
        for (int i : ar){
            sum += i;
        }
        return sum;
    }
}

public class SimpleArraySum {
		
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.simpleArraySum(ar);

        System.out.println(result);

        bufferedReader.close();

	}

}