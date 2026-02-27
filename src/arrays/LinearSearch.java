/* 
Problem: 
Linear search in array 
 
Approach: 
Traverse the array once.
If element matches, return its index.
If traversal completes without match, return -1.
 
Time Complexity: O(n) 
Space Complexity: O(1)
 
Example:
Input: [1, 2, 3, 4, 5] 
Output:
Enter the number to be find: 5
Element found at index 4
 */

package arrays;

public class LinearSearch {
	
	public static int linearSearch(int[] arr,int num) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				return i;	
			}
		}
		return -1;
	}
	public static void main(String[] args) {
				int[] arr= {1, 2, 3, 4, 5};
				int num = 5;
				try {
					int index = linearSearch(arr,num);
					if(index != -1) {
						System.out.println("Element found at index " + index);
					}
					else {
						System.out.println("Number not found");
					}

				}
				catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
	}
}
