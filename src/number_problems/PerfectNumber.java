//Perfect Number:
//A number is a Perfect Number if the sum of its proper divisors (excluding itself) equals the number.
//
//Example:
//
//6 → 1 + 2 + 3 = 6 ✅
//
//Sum of divisors (except the number itself) = Original number

// Program - PerfectNumber
// Output:
//Enter the number: 
//6
//6 is a Perfect Number
//
//Enter the number: 
//7
//7 is not a Perfect Number

package number_problems;

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number: ");
    	int n=sc.nextInt();
    	int d=1;
    	for(int i=2;i<=n/2;i++) {
    		if(n%i == 0) {
    			d+=i;
    		}
    	}
    	if(d == n) {
    		System.out.println(n+" is a Perfect Number");
    	}
    	else {
    		System.out.println(n+" is not a Perfect Number");
    	}
    	sc.close();
    }
}
