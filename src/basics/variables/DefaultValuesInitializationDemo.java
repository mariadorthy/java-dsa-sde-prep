/*
 * File: DefaultValuesInitializationDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates Java variable initialization rules and default values
 *          for local variables, instance variables, method parameters, and static variables.
 */
/*
 * Concept: Demonstrates how Java initializes different categories of variables.
 *
 * Variable Categories Covered:
 *
 * 1. Local Variables
 *    - Do NOT receive default values
 *    - Must be explicitly assigned before use
 *    - Enforced by the Definite Assignment Rule
 *
 * 2. Instance Variables
 *    - Belong to objects
 *    - Automatically initialized when an object is created
 *    - Receive JVM default values
 *
 * 3. Static Variables
 *    - Belong to the class
 *    - Only one copy shared across all objects
 *    - Automatically initialized with default values
 *
 * 4. Method Parameters
 *    - Behave like local variables
 *    - Automatically initialized through argument passing
 *
 * Demonstrations in this program:
 * 1. Local variable requiring explicit initialization
 * 2. Instance variable default values
 * 3. Static variable default values
 * 4. Method parameter initialization
 * 5. Static variable sharing across objects
 */
/* Output Example
──────────── Default Values & Initialization Demo ────────────

Instance variable defaults:
person = null
count = 0
active = false
grade = (null character)

Static variable default:
totalObjects = 0

Local variable demonstration:

localValue after assignment = 10

Method parameter demonstration:
Hello Alice
totalObjects after increment = 1
totalObjects via demo = 1
totalObjects via demo2 = 1
 */
package basics.variables;

public class DefaultValuesInitializationDemo {

    // 2. Instance variables (receive default values)
	String person;   // reference default = null
	int count;       // numeric default = 0
	boolean active;  // boolean default = false
	char grade;      // char default = '\u0000'

    // 3. Static variable (default value)
    static int totalObjects; // default = 0

    public static void main(String[] args) {

        System.out.println("\n──────────── Default Values & Initialization Demo ────────────\n");

        // Create object to observe instance defaults
     // 2. Instance variable default values
        DefaultValuesInitializationDemo demo = new DefaultValuesInitializationDemo();

        System.out.println("Instance variable defaults:");
        System.out.println("person = " + demo.person);
        System.out.println("count = " + demo.count);
        System.out.println("active = " + demo.active);
        System.out.println("grade = " + demo.grade);
        
     // 3. Static variable default values
        System.out.println("\nStatic variable default:");
        System.out.println("totalObjects = " + totalObjects);

        System.out.println("\nLocal variable demonstration:");
     // 1. Local variable requiring explicit initialization
        int localValue;

        // System.out.println(localValue);
        // Compile-time error: variable might not have been initialized

        localValue = 10;
        System.out.println("localValue after assignment = " + localValue);

        System.out.println("\nMethod parameter demonstration:");
     // 4. Method parameter initialization
        greet("Alice");
        
     // 5. Static variable sharing across objects
        DefaultValuesInitializationDemo demo2 = new DefaultValuesInitializationDemo(); // second object
     // modify static variable
        totalObjects++;
        System.out.println("totalObjects after increment = " + totalObjects);
     // accessing same static variable through different references
        System.out.println("totalObjects via demo = " + demo.totalObjects);
        System.out.println("totalObjects via demo2 = " + demo2.totalObjects);
    }

    // Method parameter example
    static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
/* Execution Flow (Mental Model)
Program Start

Class Loading
 └─ static variable totalObjects initialized to 0

main()
 ├─ object created
 │   ├─ person = null
 │   ├─ count = 0
 │   ├─ active = false
 │   └─ grade = '\u0000'
 │
 ├─ static variable printed
 │
 ├─ local variable declared
 │   └─ must be assigned before use
 │
 ├─ greet("Alice") called
 │   └─ parameter name initialized with argument value
 │
 ├─ totalObjects incremented
 │
 ├─ static variable accessed via demo
 │
 ├─ static variable accessed via demo2
 │   └─ demonstrates static shared variable across objects
Program End
*/