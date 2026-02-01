// Program - PalindromeNumber
// Output:
//Enter the number: 
//121
//121 is a palindrome
//
//Enter the number: 
//123
//123 is not a palindrome

package number_problems;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int t =n;
        int rev=0,digit=0;
        while(t>0) {
        	digit = t%10;
        	rev = rev*10 + digit;
        	t=t/10;
        }
        if(n == rev) {
            System.out.println(n+ " is a palindrome");
        }
        else {
        	System.out.println(n+ " is not a palindrome");
        }
        sc.close();
    }
}
