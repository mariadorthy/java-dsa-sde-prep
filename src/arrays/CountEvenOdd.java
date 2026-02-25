// Program - Count even and odd element of Array 
// Output 
//Enter the number of elements in array: 
//5
//Enter: 
//12
//Enter: 
//43
//Enter: 
//65
//Enter: 
//88
//Enter: 
//97
//Even: 2
//Odd: 3

package arrays;

import java.util.*;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Array is empty");
		}
		else {
			int[] arr=new int[n];
			int evenCount=0, oddCount=0;
			for(int i=0;i<n;i++) {
				System.out.println("Enter: ");
				arr[i]=sc.nextInt();
				if(arr[i]%2 == 0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
			}
			System.out.println("Even: "+evenCount);
			System.out.println("Odd: "+oddCount);	
		}
		sc.close();
	}

}
