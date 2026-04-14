/*
 * File: PrimitivePropertiesDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates size, range, and default values of primitive data types in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Primitive Type Properties → size, range, default values
 *
 * 1. Size & Range
 *    - Each primitive type has fixed size
 *    - Range defined using wrapper class constants
 *
 * 2. Default Values
 *    - Instance & static variables get defaults
 *    - Local variables do NOT get defaults
 *
 * Demonstrations:
 * 1. Size & range of primitive types
 * 2. Default values (instance + static)
 * 3. Local variable no default rule
 */

/*
─────────────── Primitive Properties ───────────────
byte MAX = 127
int MAX = 2147483647
long MAX = 9223372036854775807
double MAX = 1.7976931348623157E308
Default int = 0
Default double = 0.0
Default boolean = false
Default char = []
Default static int = 0
*/

package basics.datatypes;

class Demo {

    // Instance variables (default values)
    int intDefault;
    double doubleDefault;
    boolean booleanDefault;
    char charDefault;

    // Static variable
    static int staticDefault;
}

public class PrimitivePropertiesDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Primitive Properties ───────────────");

        // 1. Size & Range
        System.out.println("byte MAX = " + Byte.MAX_VALUE);
        System.out.println("int MAX = " + Integer.MAX_VALUE);
        System.out.println("long MAX = " + Long.MAX_VALUE);
        System.out.println("double MAX = " + Double.MAX_VALUE);

        // 2. Default Values
        Demo obj = new Demo();

        System.out.println("Default int = " + obj.intDefault);
        System.out.println("Default double = " + obj.doubleDefault);
        System.out.println("Default boolean = " + obj.booleanDefault);
        System.out.println("Default char = [" + obj.charDefault + "]"); // char default is '\u0000' (prints as empty)
        System.out.println("Default static int = " + Demo.staticDefault);

        // 3. Local variable rule
        int localVar;
        // System.out.println(localVar); // ERROR
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ Class Loaded
│   └─ staticDefault initialized → 0
│
├─ main()
│
├─ Print size & range values
│
├─ Create object → default values assigned
│
├─ Print default values
│
├─ Local variable declared (no default)
│
└─ Program End
*/