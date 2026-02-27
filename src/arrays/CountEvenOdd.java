/*
Problem:
Count even and odd numbers in an integer array.

Approach:
Traverse the array once.
Check each element using modulo operator.
Increment evenCount if divisible by 2, otherwise increment oddCount.

Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: [12, 43, 65, 88, 97]
Output: Even = 2, Odd = 3
*/
package arrays;

public class CountEvenOdd {
	
	public static int[] countEvenOdd(int[] arr) {
		int evenCount=0, oddCount=0;
		if( arr == null || arr.length == 0) // always check null 1st  
		{
			throw new IllegalArgumentException("Array must not be empty");
		}
		for(int num : arr) {
			if(num%2 == 0) 
				evenCount++;
			else 
				oddCount++;
		}
		return new int[] {evenCount, oddCount};
	}
	
	public static void main(String[] args) {
		int[] arr= {-2, -3, -4};
		try {
			int[] result = countEvenOdd(arr);
			System.out.println("Even: "+result[0]);
			System.out.println("Odd: "+result[1]);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}		
	}
}
