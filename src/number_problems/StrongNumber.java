//Strong Number:
//A number is a Strong Number if the sum of the factorials of its digits equals the number itself.
//
//Example:
//
//145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 ✅
//
//Sum of factorial of digits = Original number

// Output:
//Enter the number
//145
//145 is a Strong Number

//Enter the number
//121
//121 is not a Strong Number

package number_problems;

import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int n=sc.nextInt();
    	int t=n;
    	int di=0,sum=0;
    	while(t>0) {
    		di=t%10;
    		sum+=fact(di);
    		t=t/10;
    	}
    	if(sum == n) {
    		System.out.println(n+" is a Strong Number");
    	}
    	else {
    		System.out.println(n+" is not a Strong Number");
    	}
    	sc.close();
    }
    public static int fact(int num) {
    	int f=1;
    	for(int i=1;i<=num;i++) {
    		f=f*i;
    	}
    	return f;
    }
}
