/*
 * File: VariableBasicsDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates variable categories and basic variable operations.
 */
/*
 * Local Variable:
 * - Declared inside method or block.
 * - Exists only during method execution.
 * - Must be initialized before use.
 * 
 * Instance Variable:
 * - Declared inside a class but outside methods.
 * - Each object has its own copy.
 * - Default values assigned automatically.
 * 
 * Static Variable:
 * - Belongs to the class, not objects.
 * - Shared across all instances.
 * - Exists as long as the class is loaded.
 * 
 * Method Parameters:
 * - Variables that receive method arguments.
 * - Created when method is invoked.
 * - Destroyed when method returns.
 * 
 * Declaration vs Assignment vs Initialization
 * - Declaration introduces a variable name and type to the compiler. 
 * - Assignment gives a value to an already declared variable.
 * - Initialization performs declaration and assignment in one statement.
 * 
 * Type Compatibility
 * - A variable can only store values compatible with its declared type.
 * - Java allows widening conversions. (e.g., int → double)
 * - Reference types follow inheritance rules. (e.g., String → Object)
 * 
 * Demonstrations in this program:
 * 1. Local variables
 * 2. Declaration 
 * 3. Assignment
 * 4. Initialization
 * 5. Type compatibility
 * 6. Instance variables
 * 7. Static variables
 * 8. Method parameters
 *  
Output Example
----- Local Variable -----
x = 10

----- Initialization -----
y = 20

----- Type Compatibility -----
double b = 5.0
Object obj = Hello

----- Instance Variable -----
Default age = 0
Student age = 21

----- Static Variable -----
School = ABC School

----- Method Parameter -----
Parameter age = 25
 */

package basics.variables;

class Student {

    // instance variable
    int age;

    // static variable
    static String school = "ABC School";

    void printAge(int paramAge) {  // parameter variable
        System.out.println("Parameter age = " + paramAge);
    }
}

public class VariableBasicsDemo {

    public static void main(String[] args) {
    	// 1. Local Variable 
        System.out.println("----- Local Variable -----");

        // 2. Declaration
        int x;

        // 3. Assignment
        x = 10;

        System.out.println("x = " + x);

     // 4. Initialization 
        System.out.println("\n----- Initialization -----");

        int y = 20;  // declaration + assignment
        System.out.println("y = " + y);
        
     // 5. Type Compatibility
        System.out.println("\n----- Type Compatibility -----");

        int a = 5;
        double b = a;  // widening conversion
        System.out.println("double b = " + b);

        Object obj = "Hello";  // String -> Object
        System.out.println("Object obj = " + obj);

     // 6. Instance Variable
        System.out.println("\n----- Instance Variable -----");

        Student s = new Student();
        System.out.println("Default age = " + s.age);
        s.age = 21;
        System.out.println("Student age = " + s.age);
        
     // 7. Static Variable
        System.out.println("\n----- Static Variable -----");

        System.out.println("School = " + Student.school);
        
     // 8. Method Parameter
        System.out.println("\n----- Method Parameter -----");

        s.printAge(25);
    }
}
/*
Execution Flow (Mental Model)

Program Start
│
├─ main() method begins
│
├─ Local Variable Section
│   ├─ declare variable x
│   ├─ assign value 10
│   └─ print x
│
├─ Initialization Section
│   ├─ declare and initialize y = 20
│   └─ print y
│
├─ Type Compatibility Section
│   ├─ int a created
│   ├─ assign a to double b (widening conversion)
│   ├─ assign String to Object reference
│   └─ print results
│
├─ Instance Variable Section
│   ├─ create Student object
│   ├─ object allocated in heap
│   ├─ reference stored in variable s
│   ├─ set instance field age = 21
│   └─ print age
│
├─ Static Variable Section
│   ├─ access class-level variable Student.school
│   └─ print value
│
├─ Method Parameter Section
│   ├─ call printAge(25)
│   ├─ parameter paramAge created
│   └─ print parameter value
│
└─ Program End
*/