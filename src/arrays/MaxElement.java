// Program - Maximum Element of Array 
// Output 
//Enter the number of element: 
//5
//Enter: 
//12
//Enter: 
//43
//Enter: 
//542
//Enter: 
//54
//Enter: 
//754
//Max element in array: 754

package arrays;

import java.util.*;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Array is empty");
		}
		else {
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter: ");
				arr[i]=sc.nextInt();
			}
			int max=arr[0];
			for(int i=1;i<n;i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
			System.out.println("Max element in array: "+max);
		}
		sc.close();
	}

}