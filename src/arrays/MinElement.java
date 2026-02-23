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
