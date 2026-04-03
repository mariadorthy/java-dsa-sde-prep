/*
 * File: ScopeDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates variable scope and shadowing in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Scope → defines where a variable is accessible (compile-time concept)
 *
 * Types of Scope:
 *
 * 1. Class Scope
 *    - Variables declared inside class but outside methods
 *    - Accessible in all methods of the class
 *
 * 2. Method Scope
 *    - Variables declared inside a method
 *    - Accessible only within that method
 *
 * 3. Block Scope
 *    - Variables declared inside { }
 *    - Accessible only within that block
 *
 * 4. Variable Shadowing
 *    - Local variable can hide (shadow) instance variable
 *    - Use 'this' to access instance variable
 *
 * Demonstrations in this program:
 * 1. Class scope variable
 * 2. Local variable in method scope
 * 3. Block scope variable
 * 4. Variable shadowing (local vs instance)
 * 5. Compile-time scope error (commented)
 */

/*
─────────────── Scope Demo ───────────────
Inside block y = 20
Local x = 50
Instance x = 100
*/

package basics.variables;

public class ScopeDemo {

    // 1. Class Scope
    int x = 100;

    void method() {

    	// 2. Local variable in method scope
        int x = 50;  // shadows instance variable (this.x)

        // int x = 200; // NOT allowed (cannot redeclare in same scope)

        if (true) {

            // 3. Block Scope
            int y = 20;
            System.out.println("Inside block y = " + y);
        }

        // 5. Scope error (uncomment to see compile-time error)
        // System.out.println(y);

        // 4. Variable Shadowing
        System.out.println("Local x = " + x);       // local variable (method scope)
        System.out.println("Instance x = " + this.x); // class variable
    }

    public static void main(String[] args) {
        new ScopeDemo().method();
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ Class Loaded
│   └─ instance variable x = 100 (class scope)
│
├─ main()
│   └─ object created
│
├─ method() called
│
├─ method variable created
│   └─ x = 50 (shadows instance x)
│
├─ enter if block
│   ├─ block variable y = 20
│   └─ printed
│
├─ exit block
│   └─  y is no longer accessible (out of scope)
│
├─ print x
│   ├─ x → refers to local (50)
│   └─ this.x → refers to instance (100)
│
└─ Program End
*/