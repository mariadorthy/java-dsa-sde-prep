// Program - Reverse Array - Print the Array  
// Output 
//Enter the number of elements in array: 
//5
//Enter: 
//1
//Enter: 
//2
//Enter: 
//3
//Enter: 
//4
//Enter: 
//5
//Reversed Array
//5 4 3 2 1 

package arrays;

import java.util.*;

public class ReverseArrayPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Array is empty");
		}
		else {
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter: ");
				arr[i]=sc.nextInt();
			}
			System.out.println("Reversed Array");
			for(int i=n-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}
