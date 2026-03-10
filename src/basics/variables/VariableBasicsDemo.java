/*
 * File: VariableBasicsDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates basic concepts of variables in Java.
 */

/*
 * Variable
 * - A named memory location used to store data.
 * - The value can change during program execution.
 *
 * Literal
 * - A fixed value written directly in the code.
 * - Examples: 10, 3.14, 'A', "Hello".
 *
 * Variable vs Literal
 * - Literal is the actual value.
 * - Variable stores the value in memory.
 *
 * Constant
 * - A variable whose value cannot change after initialization.
 * - Declared using the 'final' keyword.
 *
 * Demonstrations in this program:
 * 1. Variable storing values
 * 2. Literal vs Variable
 * 3. Constant using final
 *
Output Example
─────────────── Variable Storing Values ───────────────
Age = 21
Salary = 50000.5
Updated Age = 22

─────────────── Literal vs Variable ───────────────
Literal value = 100
Variable value = 100

─────────────── Constant (final variable) ───────────────
PI = 3.14159
*/

package basics.variables;

public class VariableBasicsDemo {

    public static void main(String[] args) {

        // 1. Variable Storing Values
        System.out.println("─────────────── Variable Storing Values ───────────────");

        int age = 21;           // variable storing integer value
        double salary = 50000.5; // variable storing decimal value

        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);

        // variable value can change
        age = 22;
        System.out.println("Updated Age = " + age);

        // 2. Literal vs Variable
        System.out.println("\n─────────────── Literal vs Variable ───────────────");

        System.out.println("Literal value = " + 100); // literal directly used

        int number = 100; // variable storing a literal
        System.out.println("Variable value = " + number);

        // 3. Constant using final
        System.out.println("\n─────────────── Constant (final variable) ───────────────");

        final double PI = 3.14159; // constant variable

        System.out.println("PI = " + PI);

        // PI = 3.14;  // ❌ Compilation error: cannot change final variable
    
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ main() method begins
│
├─ Variable Storing Values Section
│   ├─ declare variable age = 21
│   ├─ declare variable salary = 50000.5
│   ├─ print both values
│   ├─ change age value to 22
│   └─ print updated value
│
├─ Literal vs Variable Section
│   ├─ print literal value 100 directly
│   ├─ store literal 100 in variable number
│   └─ print variable value
│
├─ Constant Section
│   ├─ declare constant PI using final keyword
│   └─ print PI value
│
└─ Program End
*/