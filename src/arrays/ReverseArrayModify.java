// Program - Reverse Array - Modify the Array  
// Output 
//Enter the number of elements in array: 
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
//Revered Array
//5 4 3 2 1 

package arrays;

import java.util.*;

public class ReverseArrayModify {

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
				System.out.println("Enter");
				arr[i]=sc.nextInt();
			}
			int temp=0;
			for(int i=0;i<n/2;i++) {
				temp=arr[i];
				arr[i]=arr[n-i-1];
				arr[n-i-1]=temp;
			}
			System.out.println("Revered Array");
			for(int i=0;i<n;i++) {				
				System.out.print(arr[i]+" ");
			}		
		}
		sc.close();
	}

}
