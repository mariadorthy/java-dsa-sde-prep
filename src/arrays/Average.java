/* 
Problem: 
Find average of all elements in array 
 
Approach: 
Traverse the array once.
Add each element and accumulate it in a sum variable.
Divide the sum by the array length.
 
Time Complexity: O(n) 
Space Complexity: O(1)
 
Example:
Input: [1,2,3,4,5,6]
Output: Average: 3.5
*/
package arrays;

public class Average {
	
	public static double findAverage(int[] arr) {
	    if(arr == null || arr.length == 0) {
	    	throw new IllegalArgumentException("Array must not be empty");
	    }
	    double sum = 0;
	    for(int num : arr) {
	        sum += num;
	    }
	    return sum / arr.length;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		 try {
		        System.out.println("Average: " + findAverage(arr));
		    } catch (IllegalArgumentException e) {
		        System.out.println(e.getMessage());
		    }
	}
}
