/*
 * Problem: Compare the Triplets
 * Platform: HackerRank
 * Link: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

/*
 * Approach:
 * ----------------------------
 * - Initialize two counters to track Alice's and Bob's scores.
 * - Traverse both lists simultaneously using a single loop (parallel traversal).
 * - Compare elements at the same index:
 *      • If a[i] > b[i], increment Alice's score.
 *      • If a[i] < b[i], increment Bob's score.
 *      • If equal, no score update.
 * - After traversal, return both scores as a list.
 *
 * - Time Complexity: O(n) – single pass through the lists.
 * - Space Complexity: O(1) – only two variables used.
 *
 * Pattern Used:
 * Parallel Traversal + Conditional Counting
 */

/*
Sample Input:


Expected Output:

*/
package hackerrank;

import java.io.*;
import java.util.*;

class CompareTheTripletsResult {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int count_a = 0, count_b = 0;
        if (a.size() != b.size()) {
            throw new IllegalArgumentException("Input lists must be of same size");
        }
        else {
        for(int i=0;i<Math.min(a.size(), b.size());i++){
            if(a.get(i) > b.get(i)){
                count_a++;
            }
            else if(a.get(i) < b.get(i)){
                count_b++;
            }
            else{
                continue;
            }
        }
        return Arrays.asList(count_a,count_b);
    }
    }

}

public class CompareTheTriplets {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < aTemp.length; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < bTemp.length; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = CompareTheTripletsResult.compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));

        bufferedReader.close();

	}

}


