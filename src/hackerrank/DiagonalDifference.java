/*
 * Problem: Diagonal Difference
 * Platform: HackerRank
 * Link: https://www.hackerrank.com/challenges/diagonal-difference/problem
 *
 * Approach:
 * ----------------------------
 * - Initialize two variables to store sums of primary and secondary diagonals.
 * - Traverse the matrix using a single loop from 0 to n-1.
 * - For each index i:
 *      • Add element at (i, i) to primary diagonal sum.
 *      • Add element at (i, n-1-i) to secondary diagonal sum.
 * - Compute the absolute difference between the two sums.
 * - Return the result.
 *
 * - Time Complexity: O(n) – only one pass through the matrix diagonals.
 * - Space Complexity: O(1) – no extra space used.
 *
 * Pattern Used:
 * Matrix Diagonal Traversal (Index Mapping)
 *
 * Constraint Insight:
 * ----------------------------
 * - Input is guaranteed to be a square matrix (n x n).
 * - Diagonal elements can be accessed directly using index relationships.
 * - Values may be negative → use Math.abs() to ensure non-negative result.
 */

/*
Sample Input:
3
11 2 4     
4 5 6
10 8 -12

Expected Output:
15
*/

package hackerrank;
import java.io.*;
import java.util.*;

class DiagonalDifferenceResult {
  public static int diagonalDifference(List<List<Integer>> arr) {
        int difference =0, sumPrimary=0, sumSecondary = 0;
        for(int i =0;i<arr.size();i++){        
           
                    sumPrimary += arr.get(i).get(i);
                    sumSecondary += arr.get(i).get(arr.size() - 1 - i);
            }
        difference = Math.abs(sumPrimary - sumSecondary); 
        
        return difference;
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = DiagonalDifferenceResult.diagonalDifference(arr);

        System.out.println(result);
        
        bufferedReader.close();
       
    }
}
