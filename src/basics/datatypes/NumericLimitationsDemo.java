/*
 * File: NumericLimitationsDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates numeric limitations in Java primitives.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Numeric Limitations → limits caused by fixed-size numeric representation
 *
 * 1. Integer Overflow
 *    - Each integer type has a fixed range
 *    - Exceeding max value wraps around
 *
 * 2. Floating-Point Precision
 *    - Decimal values are stored approximately
 *    - Some decimal calculations are not exact
 *
 * Demonstrations:
 * 1. Integer overflow
 * 2. Floating-point precision issue
 */

/*
─────────────── Numeric Limitations ───────────────
Integer max = 2147483647
After overflow = -2147483648
0.1 + 0.2 = 0.30000000000000004
Expected = 0.3
*/

package basics.datatypes;

public class NumericLimitationsDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Numeric Limitations ───────────────");

        // 1. Integer Overflow
        int max = Integer.MAX_VALUE;
        int overflow = max + 1;

        System.out.println("Integer max = " + max);
        System.out.println("After overflow = " + overflow);

        // 2. Floating-Point Precision
        double result = 0.1 + 0.2;

        System.out.println("0.1 + 0.2 = " + result);
        System.out.println("Expected = 0.3");
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main()
│
├─ Integer overflow
│   ├─ Read Integer.MAX_VALUE
│   └─ Add 1 → wraps to minimum value
│
├─ Floating-point precision
│   ├─ Add 0.1 + 0.2
│   └─ Observe approximation
│
└─ Program End
*/