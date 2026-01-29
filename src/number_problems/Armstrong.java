//Armstrong Number:
//A number is an Armstrong number if the sum of its digits each raised to the power of the number of digits equals the number itself.
//
//Example:
//
//153 → 1³ + 5³ + 3³ = 153

//Sum of each digit^number of digits = Original number

// Output 
// Enter the number:
//153
//153 is a Armstrong Number
//
//Enter the number:
//157
//157 is not a Armstrong Number

package number_problems;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int n=sc.nextInt();
    	int t=n;
    	int di=0,sum=0,count=0;
    	while(t>0) {
    		di=t%10;
    		count++;
    		t=t/10;
    	}
    	t=n;
    	while(t>0) {
    		di=t%10;
    		sum+=Math.pow(di, count);
    		t=t/10;
    	}
    	if(sum == n) {
    		System.out.println(n+" is a Armstrong Number");
    	}
    	else {
    		System.out.println(n+ " is not a Armstrong Number");
    	}
    	sc.close();
    }
}
