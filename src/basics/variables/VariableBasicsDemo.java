/*
 * File: VariableBasicsDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates Stage 0 variable concepts including syntax foundations,
 *          naming rules, and constants.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Variable        → Named storage location for data
 * Literal         → Fixed value written directly in code
 *
 * Declaration     → Creating a variable name and type
 * Assignment      → Giving a value to an already declared variable
 * Initialization  → Declaration + assignment in one step
 * Reassignment    → Changing the value of a variable
 *
 * Multiple Declaration → Declaring multiple variables in one statement
 *
 * Naming Rules    → Compiler rules for valid variable names
 * Naming Conventions → Recommended styles (camelCase, UPPER_CASE)
 *
 * Constant        → Variable declared with 'final' (cannot change)
 *
 * Demonstrations in this program:
 * 1. Declaration
 * 2. Assignment
 * 3. Initialization
 * 4. Reassignment
 * 5. Literal vs Variable
 * 6. Multiple Declaration
 * 7. Naming (basic examples)
 * 8. Constant using final
 */
/*
Output Example
─────────────── Declaration & Assignment ───────────────
a = 10

─────────────── Initialization ───────────────
b = 20

─────────────── Reassignment ───────────────
b after change = 30

─────────────── Literal vs Variable ───────────────
sum = 15

─────────────── Multiple Declaration ───────────────
x = 1, y = 2, z = 3

─────────────── Naming Rules ───────────────
age = 25
_count = 10
$value = 5

─────────────── Naming Conventions ───────────────
studentAge = 21
totalMarks = 450

─────────────── Constant ───────────────
PI = 3.14
MAX_SCORE = 100
*/

package basics.variables;

public class VariableBasicsDemo {

    public static void main(String[] args) {

        // 1. Declaration & Assignment
        System.out.println("─────────────── Declaration & Assignment ───────────────");

        int a;      // declaration (no value yet)
        a = 10;     // assignment

        System.out.println("a = " + a);


        // 2. Initialization
        System.out.println("\n─────────────── Initialization ───────────────");

        int b = 20; // declaration + assignment

        System.out.println("b = " + b);


        // 3. Reassignment
        System.out.println("\n─────────────── Reassignment ───────────────");

        b = 30; // changing value

        System.out.println("b after change = " + b);


        // 4. Literal vs Variable
        System.out.println("\n─────────────── Literal vs Variable ───────────────");

        int sum = a + 5; // 5 is a literal

        System.out.println("sum = " + sum);


        // 5. Multiple Variable Declaration
        System.out.println("\n─────────────── Multiple Declaration ───────────────");

        int x = 1, y = 2, z; // multiple declaration
        z = 3;

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);


        // 6. Naming Rules (valid examples)
        System.out.println("\n─────────────── Naming Rules ───────────────");

        int age = 25;       // valid
        int _count = 10;    // valid
        int $value = 5;     // valid but rarely used in real projects

        System.out.println("age = " + age);
        System.out.println("_count = " + _count);
        System.out.println("$value = " + $value);

        // Invalid examples (commented)
        // int 1age = 10;      // cannot start with digit
        // int total marks = 5; // space not allowed
        // int class = 1;       // keyword


        // 7. Naming Conventions
        System.out.println("\n─────────────── Naming Conventions ───────────────");

        int studentAge = 21; // camelCase
        int totalMarks = 450;

        System.out.println("studentAge = " + studentAge);
        System.out.println("totalMarks = " + totalMarks);


        // 8. Constant using final
        System.out.println("\n─────────────── Constant ───────────────");

        final double PI = 3.14; // constant
        final int MAX_SCORE = 100; // UPPER_CASE convention

        System.out.println("PI = " + PI);
        System.out.println("MAX_SCORE = " + MAX_SCORE);

        // PI = 3.0; // compile-time error
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ Declaration & Assignment Section
│   ├─ declare variable a
│   ├─ assign value 10
│   └─ print a
│
├─ Initialization Section
│   ├─ declare and initialize b = 20
│   └─ print b
│
├─ Reassignment Section
│   ├─ change b to 30
│   └─ print updated value
│
├─ Literal vs Variable Section
│   ├─ use literal 5
│   ├─ compute sum = a + 5
│   └─ print sum
│
├─ Multiple Declaration Section
│   ├─ declare x, y, z
│   ├─ assign values 1, 2, 3
│   └─ print values
│
├─ Naming Rules Section
│   ├─ declare valid variable names (age, _count, $value)
│   └─ print values
│
├─ Naming Conventions Section
│   ├─ declare camelCase variables
│   └─ print values
│
├─ Constant Section
│   ├─ declare constants PI and MAX_SCORE
│   └─ print values
│
└─ Program End
*/