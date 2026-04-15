/*
 * File: LiteralsConstantsDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates literals, suffixes, constants, and formatting rules in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Literals → fixed values written directly in code
 *
 * 1. Literal Forms
 *    - Integer → decimal, binary, octal, hexadecimal
 *    - Floating → default double
 *    - Character → single quotes, Unicode
 *    - Boolean → true / false
 *
 * 2. Literal Rules
 *    - int → default integer
 *    - double → default decimal
 *
 * 3. Literal Suffixes
 *    - long → L
 *    - float → F
 *    - double → D (optional)
 *
 * 4. Character Behavior
 *    - char stores Unicode values
 *    - behaves like number internally
 *
 * 5. Constants
 *    - final keyword → value cannot change
 *
 * 6. Numeric Formatting
 *    - underscore (_) improves readability
 *
 * Demonstrations:
 * 1. Integer literal formats
 * 2. Floating-point rules
 * 3. Character behavior (numeric + Unicode)
 * 4. Boolean literal
 * 5. Constants using final
 * 6. Literal suffix usage
 * 7. Underscore usage
 */

/*
─────────────── Literals & Constants ───────────────
decimal = 10
binary (0b1010) = 10
octal (012) = 10
hex (0xA) = 10
double = 10.5
float = 10.5
char literal = A
char from int = A
unicode char = A
'A' + 1 = 66
boolean = true
constant MAX = 100
long = 8000000000
float price = 3.14
salary = 5000000
*/

package basics.datatypes;

public class LiteralsConstantsDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Literals & Constants ───────────────");

        // 1. Integer Literals
        int decimal = 10;
        int binary = 0b1010;
        int octal = 012;
        int hex = 0xA;

        System.out.println("decimal = " + decimal);
        System.out.println("binary (0b1010) = " + binary);
        System.out.println("octal (012) = " + octal);
        System.out.println("hex (0xA) = " + hex);
     // Note: decimal, binary, octal, and hex all represent the same value internally
        
        // 2. Floating-point rules
        double d = 10.5; // default double
        float f = 10.5F; // requires F

        System.out.println("double = " + d);
        System.out.println("float = " + f);

        // float x = 10.5; // ERROR

        // 3. Character behavior
        char ch1 = 'A';
        char ch2 = 65;
        char unicode = '\u0041';

        System.out.println("char literal = " + ch1);
        System.out.println("char from int = " + ch2);
        System.out.println("unicode char = " + unicode);

        System.out.println("'A' + 1 = " + (ch1 + 1));

        // 4. Boolean literal
        boolean flag = true;
        System.out.println("boolean = " + flag);

        // 5. Constants (final)
        final int MAX = 100;
        System.out.println("constant MAX = " + MAX);

        // MAX = 200; // ERROR

        // 6. Literal suffix
        long population = 8_000_000_000L;
        float price = 3.14F;

        System.out.println("long = " + population);
        System.out.println("float price = " + price);

        // 7. Underscore usage
        int salary = 5_000_000;
        System.out.println("salary = " + salary);

        // int x = _1000; // ERROR
        // int y = 1000_; // ERROR
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main()
│
├─ Demonstrate integer literals (binary, octal, hex)
│
├─ Demonstrate floating rules (double vs float)
│
├─ Show char behavior (numeric + Unicode)
│
├─ Boolean literal usage
│
├─ Constant using final
│
├─ Literal suffix usage (L, F)
│
├─ Underscore formatting
│
└─ Program End
*/