// Program - Sum of Elements 
// Output 
//Enter the number of elements in array: 
//0
//Array is empty

// Enter the number of elements in array: 
//5
//Enter element 0 :
//1
//Enter element 1 :
//2
//Enter element 2 :
//3
//Enter element 3 :
//4
//Enter element 4 :
//5
//Sum of Element: 15

package arrays;

import java.util.*;
public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Array is empty");
		}
		else {
			int[] arr=new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				System.out.println("Enter element "+i+" :");
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			System.out.println("Sum of Element: "+sum);
		}
		sc.close();
	}
}