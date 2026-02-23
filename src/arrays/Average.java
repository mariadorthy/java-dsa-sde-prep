// Program - Average of Array 
// Output 
//Enter the number: 
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
//Average: 3.0

package arrays;

import java.util.*;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Array is empty");
		}
		else {
			int[] arr=new int[n];
			double avg,sum=0;
			for(int i=0;i<n;i++) {
				System.out.println("Enter: ");
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			avg=sum/n;
			System.out.println("Average: "+avg);
		}
		sc.close();
	}
}
