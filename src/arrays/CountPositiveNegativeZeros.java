/* 
Problem:
Count positive, negative and zero's numbers in an integer array.

Approach:
Traverse the array once.
Increment positiveCount, if its greater than 0.
Increment negativeCount, if its lesser than 0.
Else Increment zerosCount.

Time Complexity: O(n) 
Space Complexity: O(1)

Example:
Input: [0, -1, 1, -100, 100]
Output: Positive: 2 Negative: 2	Zero: 1
*/
package arrays;

public class CountPositiveNegativeZeros {

	public static int[] countPositiveNegativeZeros(int[] arr){
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}
		int positiveCount=0, negativeCount=0, zerosCount=0;
		for(int num : arr) {
			if(num>0) {
				positiveCount++;
			}
			else if(num<0) {
				negativeCount++;
			}
			else {
				zerosCount++;
			}
		}
		return new int[] {positiveCount, negativeCount, zerosCount};
	}
	
	public static void main(String[] args) {
			int[] arr= {0, -1, 1, -100, 100};
			try {
				int[] result = countPositiveNegativeZeros(arr);
				System.out.println("Positive: "+result[0]);
				System.out.println("Negative: "+result[1]);
				System.out.println("Zero: "+result[2]);
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
	}

}
