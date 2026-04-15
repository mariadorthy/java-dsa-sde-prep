/*
 * File: TypePromotionDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates type promotion in Java expressions.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Type Promotion → automatic conversion of smaller types to int or larger types during expressions
 *
 * Important Rules:
 *
 * 1. byte, short, char → promoted to int in expressions
 *
 * 2. Arithmetic Promotion
 *    - When different types are used together, smaller type is promoted to larger type
 *
 * 3. Mixed-Type Expressions
 *    - Final result depends on highest data type in expression
 *
 * 4. Promotion happens ONLY in expressions
 *    - Assignment does NOT trigger type promotion
 *    - Assignment uses widening (if applicable)
 *
 * 5. Promotion Order Awareness
 *    - byte, short, char → int → long → float → double
 *    - Expression result → highest type
 *
 * Demonstrations in this program:
 * 1. byte/short/char promotion to int
 * 2. Arithmetic promotion in expressions
 * 3. Mixed-type expression evaluation
 * 4. Compile-time error due to type mismatch
 * 5. Promotion only in expressions (assignment vs expression)
 * 6. Promotion order demonstration (int → long)
 */

/*
─────────────── Type Promotion Demo ───────────────
int result = 30
short sum (int) = 15
char promotion result = 66
mixed type result = 15.5
Assignment without expression = 10
int + long = 30
*/

package basics.datatypes;

public class TypePromotionDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Type Promotion Demo ───────────────");

        // 1. byte promotion to int
        byte a = 10;
        byte b = 20;

        // byte c = a + b; // 🗷 ERROR: byte + byte → promoted to int
        int c = a + b;     // 🗹 valid

        System.out.println("int result = " + c);


        // 2. short promotion to int
        short x = 5;
        short y = 10;

        int sum = x + y;
        System.out.println("short sum (int) = " + sum);


        // 3. char promotion to int
        char ch1 = 'A'; // 65
        char ch2 = 1; // Unicode value 1 (non-printable control character)

        int charResult = ch1 + ch2; // charResult = 65 + 1 → 66
        System.out.println("char promotion result = " + charResult);


        // 4. mixed-type expression
        int i = 10;
        double d = 5.5;

        double result = i + d;
        System.out.println("mixed type result = " + result);


        // 5. Promotion happens only in expressions
        byte p = 10;

        // byte q = p; // 🗹 same type (no promotion)
        int q = p;     // 🗹 widening (NOT promotion)

        System.out.println("Assignment without expression = " + q);


        // 6. Promotion order demonstration
        int m = 10;
        long n = 20;

        long res = m + n; // int → long
        System.out.println("int + long = " + res);
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main()
│
├─ byte + byte → promoted to int
│   └─ stored in int c
│
├─ short + short → promoted to int
│   └─ stored in int sum
│
├─ char + int → char promoted to int
│   └─ ASCII-based calculation (65 + 1 = 66)
│
├─ int + double → int promoted to double
│   └─ result = 15.5
│
├─ Assignment (no expression)
│   ├─ byte p = 10
│   └─ int q = p (widening, not promotion)
│
├─ int + long → int promoted to long
│   └─ result stored in long
│
└─ Program End
*/