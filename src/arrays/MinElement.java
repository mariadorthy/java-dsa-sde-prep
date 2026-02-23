// Program - Minimum Element of Array 
// Output 
//Enter the number: 
//5
//Enter
//1
//Enter
//2
//Enter
//3
//Enter
//4
//Enter
//5
//Min value of array: 1

package arrays;

import java.util.*;

public class MinElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Array is empty");
		}
		else {
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter");
				arr[i]=sc.nextInt();
			}
			int min=arr[0];
			for(int i=1;i<n;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			System.out.println("Min value of array: "+min);
		}
		sc.close();
	}

}
