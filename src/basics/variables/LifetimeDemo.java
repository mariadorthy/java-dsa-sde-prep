/*
 * File: LifetimeDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates lifetime of variables in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Lifetime → defines how long a variable exists in memory (runtime concept)
 *
 * Variable Lifetimes:
 *
 * 1. Local Variable
 *    - Created when method starts
 *    - Destroyed when method ends
 *    - Stored in stack
 *
 * 2. Instance Variable
 *    - Created when object is created
 *    - Exists as long as object exists
 *    - Each object has its own copy (heap)
 *
 * 3. Static Variable
 *    - Created when class is loaded
 *    - Shared across all objects
 *    - Exists until class is unloaded (usually program end)
 *    - Stored in class area (JVM-managed memory)
 *
 * Demonstrations in this program:
 * 1. Local variable lifetime (method execution)
 * 2. Instance variable lifetime (object-based)
 * 3. Separate copies for different objects
 * 4. Static variable shared across objects
 */

/*
─────────────── Lifetime Demo ───────────────
Local = 50
d2.instanceVar = 10
staticVar = 500
static via d1 = 500
*/

package basics.variables;

class Demo {

    // 2. Instance Variable (object lifetime)
    int instanceVar = 10;

    // 3. Static Variable (class lifetime)
    static int staticVar = 100;
}

public class LifetimeDemo {

    // 1. Local Variable (method lifetime)
    void test() {
        int localVar = 50;
        System.out.println("Local = " + localVar);
    }

    public static void main(String[] args) {

        // Local variable created and destroyed inside method
        LifetimeDemo obj = new LifetimeDemo();
        obj.test(); // localVar created → destroyed after method ends

        // Create two objects
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        // Modify only d1
        d1.instanceVar = 20;

        // Shows separate copies (d2 unaffected)
        System.out.println("d2.instanceVar = " + d2.instanceVar);

        // 4. Static variable shared across objects
        // Modify static variable (shared)
        Demo.staticVar = 500;
        
     // Shows shared behavior
        System.out.println("staticVar = " + Demo.staticVar);
        System.out.println("static via class = " + Demo.staticVar);
        System.out.println("static via d1 = " + d1.staticVar); // same value
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ Class Loaded
│   └─ staticVar = 100 (created once)
│
├─ main()
│
├─ Create LifetimeDemo object
│
├─ Call test()
│   ├─ localVar created (50)
│   ├─ printed
│   └─ localVar goes out of scope → eligible for removal (stack frame cleared)
│
├─ Create d1 and d2 objects
│   ├─ d1.instanceVar = 10
│   └─ d2.instanceVar = 10
│
├─ Modify d1.instanceVar → 20
│
├─ Print d2.instanceVar
│   └─ still 10 (separate copy)
│
├─ Modify staticVar → 500
│
├─ Print staticVar
│   └─ shared across class
│
├─ Print staticVar via class
│   └─ 500
│
├─ Print staticVar via d1
│   └─ still 500 (same shared variable)
│
└─ Program End
*/