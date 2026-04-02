/*
 * File: VariableTypesDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates primitive vs reference behavior in Java.
 */

/*
 * Key Concepts:
 * ----------------------------
 * Primitive Variable
 * - Stores actual value
 * - Assignment copies the value
 *
 * Reference Variable
 * - Stores reference (address) to an object
 * - Assignment copies the reference (not the object)
 *
 * Object
 * - Created in heap memory using 'new'
 * - Contains actual data (state)
 *
 * Variable vs Object vs Reference
 * - Variable → holds value or reference
 * - Object → actual data in memory
 * - Reference → link to the object
 *
 * Value vs Reference Behavior
 * - Primitive → independent copies
 * - Reference → shared object
 *
 * Reassignment vs Mutation
 * - Reassignment → variable points to a new value/object
 * - Mutation → object state is changed via reference
 *
 * Demonstrations in this program:
 * 1. Primitive copy (value copy)
 * 2. Reference copy (shared object)
 * 3. Object mutation through shared reference
 * 4. Reference reassignment
 */
/*
Output Example
─────────────── Primitive Copy ───────────────
x = 10
y = 20

─────────────── Reference Sharing ───────────────
p1.name = Bob
p2.name = Bob

─────────────── Reference Reassignment ───────────────
p3.name = Charlie
p4.name = David
*/

package basics.variables;

public class VariableTypesDemo {
	
	static class Person {
	    String name;
	}
	
    public static void main(String[] args) {

    	// 1. Primitive Copy (independent values)
        System.out.println("─────────────── Primitive Copy ───────────────");

        int x = 10;
        int y = x; // value copied

        y = 20; // change y only

        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 20


     // 2. Reference Sharing + Mutation (same object)
        System.out.println("\n─────────────── Reference Sharing ───────────────");

        Person p1 = new Person(); // object created in heap
        p1.name = "Alice";

        Person p2 = p1; // copy reference (same object)
     
        p2.name = "Bob"; // MUTATION → affects same object

        System.out.println("p1.name = " + p1.name); // Bob
        System.out.println("p2.name = " + p2.name); // Bob
        
     // 3. Reference Reassignment (different objects)
        System.out.println("\n─────────────── Reference Reassignment ───────────────");

        Person p3 = new Person();
        p3.name = "Charlie";

        Person p4 = p3; // same object
        
     
        p4 = new Person(); // REASSIGNMENT → new object
        p4.name = "David";

        System.out.println("p3.name = " + p3.name); // Charlie
        System.out.println("p4.name = " + p4.name); // David
    }
}

/*
Execution Flow (Mental Model)

Program Start
│
├─ Primitive Copy
│   ├─ x = 10
│   ├─ y = x (value copied)
│   ├─ y changed to 20
│   └─ x remains unchanged
│
├─ Reference Sharing
│   ├─ Person object created
│   ├─ p1 stores reference
│   ├─ p2 = p1 (same reference copied)
│   ├─ change via p2
│   └─ p1 sees same change (shared object)
│
├─ Reference Reassignment
│   ├─ p3 created → "Charlie"
│   ├─ p4 = p3 (same object)
│   ├─ new Person created → "David"
│   ├─ p4 now points to NEW object
│   └─ p3 still points to old object
│
└─ Program End
*/