// Program - Count positive, negative and zero element of Array 
// Output 
//Enter the number of elements in array: 
//5
//Enter: 
//0
//Enter: 
//1
//Enter: 
//-1
//Enter: 
//-100
//Enter: 
//100
//Positive: 2
//Negative: 2
//Zero: 1

package arrays;

import java.util.*;

public class CountPositiveNegativeZeros {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements in array: ");
			int n=sc.nextInt();
			if(n==0) {
				System.out.println("Array is empty");
			}
			else {
				int[] arr=new int[n];
				int positiveCount=0, negativeCount=0, zerosCount=0;
				for(int i=0;i<n;i++) {
					System.out.println("Enter: ");
					arr[i]=sc.nextInt();
					if(arr[i]>0) {
						positiveCount++;
					}
					else if(arr[i]<0) {
						negativeCount++;
					}
					else {
						zerosCount++;
					}
				}
				System.out.println("Positive: "+positiveCount);
				System.out.println("Negative: "+negativeCount);
				System.out.println("Zero: "+zerosCount);
			}
			sc.close();
	}

}
