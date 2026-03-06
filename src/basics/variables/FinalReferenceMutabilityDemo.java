/*
 * File: FinalReferenceMutabilityDemo.java
 * Package: basics.variables
 * Purpose: Demonstrates how the `final` keyword affects primitives and references.
 */

/*
 * Concept: Mutability and the `final` Keyword
 *
 * The `final` keyword prevents reassignment of a variable after it is initialized.
 *
 * For primitives:
 * - The stored value cannot change.
 *
 * For references:
 * - The reference cannot point to a different object.
 * - The object's internal state may still change if the object is mutable.
 *
 * Key Rule:
 * final locks the variable reference, not the object state.
 *
 * Demonstrations in this program:
 * 1. Final primitive variable
 * 2. Final reference mutating object state
 * 3. Attempting to reassign a final reference (compile-time error)
 * 4. Non-final reference reassignment
 * 5. Final reference with custom object
 */

/*
Output Example
──────────── Final Reference & Mutability Demo ────────────

Final primitive value:
x = 10

Final reference modifying object:
list after add = [A]

Non-final reference reassignment:
list2 = [B]

Final reference with custom object:
Initial name = Alice
Modified name = Bob
*/

package basics.variables;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class FinalReferenceMutabilityDemo {

    public static void main(String[] args) {

        System.out.println("\n──────────── Final Reference & Mutability Demo ────────────\n");

        // 1. Final primitive variable
        final int x = 10;
        System.out.println("Final primitive value:");
        System.out.println("x = " + x);

        // x = 20; // Compile-time error: cannot assign a value to final variable

        // 2. Final reference modifying object state
        System.out.println("\nFinal reference modifying object:");

        final List<String> list = new ArrayList<>();
        list.add("A");  // allowed
        System.out.println("list after add = " + list);

        // 3. Attempt to reassign final reference
        // list = new ArrayList<>(); // Compile-time error

        // 4. Non-final reference reassignment
        System.out.println("\nNon-final reference reassignment:");

        List<String> list2 = new ArrayList<>();
        list2.add("B");

        list2 = new ArrayList<>(); // allowed because reference is not final
        System.out.println("list2 = " + list2);
        
     // 5. Final reference with custom object
        System.out.println("\nFinal reference with custom object:");

        final Person p = new Person("Alice");
        System.out.println("Initial name = " + p.name);

        p.name = "Bob"; // allowed because object state can change
        System.out.println("Modified name = " + p.name);

        // p = new Person("Charlie"); // Compile-time error
        
    }
}

/*
Execution Flow (Mental Model)

Program Start

main()

 ├─ final primitive created
 │   └─ value cannot be reassigned
 │
 ├─ final reference created
 │   └─ object state modified using list.add()
 │
 ├─ attempted reassignment blocked
 │   └─ compile-time error if uncommented
 │
 ├─ non-final reference created
 │
 ├─ reassignment allowed
 │   └─ reference now points to new object
 │
 ├─ final Person reference created
 │
 ├─ object's internal state modified
 │   └─ name changed from Alice to Bob
 │
 ├─ attempted reassignment blocked
 │   └─ compile-time error if uncommented
Program End
*/