/*
 * File: PrimitiveTypesDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates all primitive data types in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 *
 * Primitive Data Types:
 *
 * 1. Integer Types
 *    - byte, short, int, long
 *
 * 2. Floating-Point Types
 *    - float, double
 *
 * 3. Character Type
 *    - char (Unicode based)
 *
 * 4. Boolean Type
 *    - true / false
 *
 * Important Rules:
 * - int is default integer type
 * - double is default decimal type
 * - float requires F suffix
 * - long requires L suffix
 *
 * Demonstrations:
 * 1. All primitive types
 * 2. Literal usage
 * 3. Unicode behavior of char
 * 4. Boolean usage in decision making
 * 5. Common mistakes
 */

/*
─────────────── Primitive Data Types ───────────────
byte = 100
short = 20000
int = 25
long = 9000000000
double = 99.99
float = 36.5
char = A
unicode char = A
ch + 1 = 66
next char = B
boolean = true
Learning Java!
*/

package basics.datatypes;

public class PrimitiveTypesDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Primitive Data Types ───────────────");

        // 1. Integer Types
        byte b = 100;
        short s = 20000;
        int i = 25;
        long l = 9_000_000_000L;

        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);

        // 2. Floating Point Types
        double d = 99.99;
        float f = 36.5F;

        System.out.println("double = " + d);
        System.out.println("float = " + f);

        // 3. Character Type
        char ch = 'A';
        char unicodeChar = 65; // Unicode code point 65 → 'A'

        System.out.println("char = " + ch);
        System.out.println("unicode char = " + unicodeChar);

        // char behaves like number internally
        System.out.println("ch + 1 = " + (ch + 1)); // 66
        System.out.println("next char = " + (char)(ch + 1)); // B

        // 4. Boolean Type
        boolean isJavaFun = true;

        System.out.println("boolean = " + isJavaFun);

        // Boolean used in decision making
        if (isJavaFun) {
            System.out.println("Learning Java!");
        }

        // 5. Common Mistakes
        // float f2 = 3.14;      // 🗷 ERROR (double → float)
        // long l2 = 9999999999; // 🗷 ERROR (needs L)
        // char c2 = "A";        // 🗷 ERROR (must use single quotes)
        // boolean b2 = 1;       // 🗷 ERROR (only true/false)
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main()
│
├─ Integer types created
│   ├─ byte, short, int, long
│
├─ Floating types created
│   ├─ double, float
│
├─ Character created
│   ├─ 'A'
│   ├─ Unicode 65 → 'A'
│
├─ char arithmetic
│   └─ 'A' + 1 → 66
│
├─ Boolean created
│   └─ true
│
├─ Boolean used in if condition
│
└─ Program End
*/