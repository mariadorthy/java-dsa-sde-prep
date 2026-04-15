/*
 * File: TypeConversionDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates type conversion (widening and narrowing) in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Type Conversion → converting one data type into another
 *
 * 1. Widening Conversion (Automatic)
 *    - Smaller type → larger type
 *    - Done automatically by compiler
 *    - No data loss
 *
 * 2. Narrowing Conversion (Explicit)
 *    - Larger type → smaller type
 *    - Must use explicit cast
 *    - May cause data loss
 *
 * 3. Data Loss
 *    - Happens during narrowing conversion
 *    - Decimal part is truncated
 *
 * 4. Casting Syntax + Invalid Conversion Rule
 *    - Syntax: (type) value
 *    - Required for narrowing
 *    - Java blocks unsafe implicit narrowing
 *
 * Demonstrations in this program:
 * 1. Widening conversion (int → double)
 * 2. Narrowing conversion (double → int)
 * 3. Data loss behavior
 * 4. Casting syntax usage
 * 5. Invalid conversion (commented)
 */

/*
─────────────── Type Conversion Demo ───────────────
int x = 10
double y (widening) = 10.0
double d = 10.5
int n (narrowing) = 10
Original double = 99.99
After narrowing = 99
Casting syntax result = 15
*/

package basics.datatypes;

public class TypeConversionDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Type Conversion Demo ───────────────");

        // 1. Widening Conversion (automatic)
        int x = 10;
        double y = x;

        System.out.println("int x = " + x);
        System.out.println("double y (widening) = " + y);

        // 2. Narrowing Conversion (explicit)
        double d = 10.5;
        int n = (int) d;

        System.out.println("double d = " + d);
        System.out.println("int n (narrowing) = " + n);

        // 3. Data loss demonstration
        double value = 99.99;
        int truncated = (int) value;

        System.out.println("Original double = " + value);
        System.out.println("After narrowing = " + truncated);

        // 4. Casting Syntax
        double num = 15.9;
        int result = (int) num;

        System.out.println("double 15.9 → int (cast) = " + result);

        // 5. Invalid conversion (blocked by compiler)
        // int a = 10.5; // 🗷 not allowed
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main()
│
├─ Widening conversion
│   ├─ int x = 10
│   └─ double y = x (automatic)
│
├─ Print values
│
├─ Narrowing conversion
│   ├─ double d = 10.5
│   └─ int n = (int) d (explicit cast)
│
├─ Print values
│
├─ Data loss demonstration
│   ├─ value = 99.99
│   └─ truncated = 99
│
├─ Casting syntax demonstration
│   ├─ num = 15.9
│   └─ result = 15
│
├─ Invalid conversion prevented by compiler
│
└─ Program End
*/