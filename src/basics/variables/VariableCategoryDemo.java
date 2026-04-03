/*
 * File: VariableCategoryDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates variable categories and default values in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Variable Categories:
 *
 * 1. Local Variable
 *    - Declared inside method/block
 *    - Must be initialized before use
 *
 * 2. Method Parameter
 *    - Receives value during method call
 *    - Acts like a local variable
 *
 * 3. Instance Variable
 *    - Belongs to object
 *    - Gets default values
 *
 * 4. Static Variable
 *    - Belongs to class (shared across objects)
 *    - Gets default values
 *
 * Default Values:
 * - int → 0
 * - boolean → false
 * - reference → null
 *
 * Demonstrations in this program:
 * 1. Instance variable default value
 * 2. Static variable default value
 * 3. Method parameter + local variable usage
 * 4. Assigning values to instance variables via method
 * 5. Static variable sharing across objects
 * 6. Accessing static variable via different references
 * 7. Local variable must be initialized before use
 */

/*
─────────────── Default Values ───────────────
Default age = 0
Default count = 0

─────────────── Variable Categories ───────────────
count via s2 = 2
count via s3 = 2
Student.count = 2
s2.age = 20
s3.age = 25

─────────────── Local Variable Rule ───────────────
Local x after init = 10
*/

package basics.variables;

class Student {

    int age;           // instance variable (default = 0)
    static int count;  // static variable (default = 0)

    void setAge(int a) {   // parameter
        int temp = a;      // local variable
        age = temp;        // assign to instance variable
    }
}

public class VariableCategoryDemo {

    public static void main(String[] args) {

        System.out.println("─────────────── Default Values ───────────────");

        Student s1 = new Student();

        // 1. Instance variable default value
        System.out.println("Default age = " + s1.age);

        // 2. Static variable default value
        System.out.println("Default count = " + Student.count);


        System.out.println("\n─────────────── Variable Categories ───────────────");

        Student s2 = new Student();
        Student s3 = new Student();

        // 3. Method parameter + local variable usage
        // 4. Assigning values to instance variables via method
        s2.setAge(20);
        s3.setAge(25);

        // 5. Static variable sharing across objects
        Student.count = 2;

        // 6. Accessing static variable via different references
        System.out.println("count via s2 = " + s2.count); // Not recommended, but allowed
        System.out.println("count via s3 = " + s3.count); // Not recommended, but allowed
        System.out.println("count via class = " + Student.count); // Recommended
        
        System.out.println("s2.age = " + s2.age);
        System.out.println("s3.age = " + s3.age);

        // 7. Local variable must be initialized before use
        System.out.println("\n─────────────── Local Variable Rule ───────────────");

        int x;
        // System.out.println(x); // compile-time error (not initialized)

        x = 10;
        System.out.println("Local x after init = " + x);
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ Class Loaded
│   └─ static variable count initialized to 0
│
├─ Create s1 object
│   └─ instance variable age = 0 (default)
│
├─ Print default values
│   ├─ age = 0
│   └─ count = 0
│
├─ Create s2 and s3 objects
│
├─ setAge(20)
│   ├─ parameter a = 20
│   ├─ local temp = 20
│   └─ assign to s2.age
│
├─ setAge(25)
│   └─ assign to s3.age
│
├─ Static assignment
│   └─ Student.count = 2
│
├─ Static variable accessed via s2 and s3
│   └─ both refer to SAME shared variable
│
├─ Print values
│   ├─ s2.age = 20
│   ├─ s3.age = 25
│   └─ count = 2
│
├─ Local variable demo
│   ├─ x declared (no default)
│   ├─ must assign before use
│   └─ x = 10 printed
│
└─ Program End
*/