/*
 * File: ScopeVsLifetimeDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates variable scope and lifetime behavior in Java.
 */

/* 
 * Concept: Demonstrates the difference between variable scope and variable lifetime in Java.
 *
 * Scope:
 * - Scope defines where a variable name is visible in the source code.
 * - A variable can only be accessed within the block or method where it is declared.
 *
 * Lifetime:
 * - Lifetime defines how long a variable exists in memory during program execution. 
 * - A variable is created when its scope begins and destroyed when the scope ends.
 *
 * Demonstrations in this program:
 * 1. Variable declared in main method (method scope)
 * 2. Variable declared inside a block (block scope)
 * 3. Variable declared inside a separate method
 * 4. Nested block scope
 * 5. Variable lifetime ending when block execution finishes
 * 6. JVM local variable slot reuse after scope ends
 *   
Output Example

───────────────Scope vs Lifetime───────────────
main variable a = 10

Entering block
block variable b = 20
nested block variable c = 30
Leaving block

Back in main method
Inside exampleMethod: x = 100

Slot reuse demonstration
temp = 50
another = 60

Program finished
*/
package basics.variables;

public class ScopeVsLifetimeDemo {

    public static void main(String[] args) {

        System.out.println("\n ───────────────Scope vs Lifetime───────────────\n");

     // 1. Variable declared in main method (method scope)
        int a = 10;
        System.out.println("main variable a = " + a);

        System.out.println("\nEntering block");

        {
            // 2. Block scope variable
            int b = 20;
            System.out.println("block variable b = " + b);

         // 4. Nested block scope
            {
                int c = 30;
                System.out.println("nested block variable c = " + c);
            }

         // System.out.println(c); // Compile-time error: c cannot be resolved
        }

        System.out.println("Leaving block");

     // System.out.println(b); // Compile-time error: b cannot be resolved

        System.out.println("\nBack in main method");

     // 3. Variable declared inside a separate method
        exampleMethod();
        
     // 6. JVM local variable slot reuse after scope ends
        System.out.println("\nSlot reuse demonstration");

        {
            int temp = 50;
            System.out.println("temp = " + temp);
        }

        // temp scope ended here

        int another = 60; // JVM may reuse temp's slot
        System.out.println("another = " + another);
        
        System.out.println("\nProgram finished");
    }

    // Method scope variable (Demonstration 3)
    static void exampleMethod() {
        int x = 100;
        System.out.println("Inside exampleMethod: x = " + x);
    }

}
/* Execution Flow (Mental Model)
Program start

main()
 ├─ a created
 │
 ├─ enter block
 │   ├─ b created
 │   ├─ enter nested block
 │   │   └─ c created
 │   └─ exit nested block → c destroyed
 │
 └─ exit block → b destroyed

exampleMethod()
 └─ x created → destroyed after method ends
*/