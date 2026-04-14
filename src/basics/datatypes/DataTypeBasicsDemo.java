/*
 * File: DataTypeBasicsDemo.java
 * Package: basics.datatypes
 * Purpose: Demonstrates foundational rules of data types in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Data Type → defines what kind of value a variable can store
 *
 * Core Rules:
 *
 * 1. Data Type vs Variable
 *    - Data type → defines what can be stored
 *    - Variable → name that stores the value
 *
 * 2. Why Data Types
 *    - Memory management (different sizes)
 *    - Code clarity (meaningful variables)
 *
 * 3. Static Typing
 *    - Type is fixed at compile time
 *    - Cannot change after declaration
 *
 * 4. Type Safety
 *    - Invalid assignments are blocked at compile time
 *
 * 5. Basic Type Conversion Rule
 *    - Smaller → larger allowed (implicit)
 *    - Larger → smaller not allowed without cast
 *
 * Demonstrations in this program:
 * 1. Variable declaration with types
 * 2. Data type vs variable
 * 3. Why data types (memory + clarity)
 * 4. Static typing restriction
 * 5. Type safety (invalid assignments)
 * 6. Basic type conversion rule
 */

/*
─────────────── Data Type Basics ───────────────
age = 25
price = 99.99
marks = 90
int x = 10
double y = 10.5
salary = 50000.0
d = 10.0
f = 10
*/

package basics.datatypes;

public class DataTypeBasicsDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Data Type Basics ───────────────");

        // 1. Variable declaration with data types
        int age = 25;
        double price = 99.99;

        System.out.println("age = " + age);
        System.out.println("price = " + price);

        // 2. Data Type vs Variable
        int marks = 90; // int → data type, marks → variable
        System.out.println("marks = " + marks);

        // 3. Why Data Types (Memory + Clarity)
        int x = 10;        // integer type
        double y = 10.5;   // decimal type
        
        System.out.println("int x = " + x);
        System.out.println("double y = " + y);
        
        double salary = 50000.0; // clear meaning
        System.out.println("salary = " + salary);

        // 4. Static Typing
        int a = 10;
        a = 20; // valid
        // a = 10.5; // 🗷 ERROR (type cannot change)

        // 5. Type Safety
        // int b = "Hello";   // 🗷 ERROR
        // boolean c = 1;     // 🗷 ERROR
        // char d1 = "A";     // 🗷 ERROR

        // 6. Type Conversion Rule
        double d = 10; // implicit widening (int → double)
        // int e = 10.5; // 🗷 ERROR (double → int not allowed)
       
        System.out.println("d = " + d);
        int f = (int) 10.5; // explicit narrowing (data loss possible)
        System.out.println("f = " + f);
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main()
│
├─ Declare variables
│   ├─ int age = 25
│   └─ double price = 99.99
│
├─ Print values
│
├─ Data type vs variable
│   └─ marks stores integer value
│
├─ Why data types
│   ├─ int → less memory
│   └─ double → more memory
│
├─ Static typing check
│   └─ type cannot change after declaration
│
├─ Type safety check
│   └─ invalid assignments blocked at compile time
│
├─ Type conversion rule
│   └─ int → double allowed automatically
│
└─ Program End
*/