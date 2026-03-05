/* 
 * Concept: Demonstrates difference between primitive variables and reference variables.
 *
 * Primitive Behavior:
 * - Variables store actual values.
 * - Assigning one primitive to another copies the value.
 * - Changing one does not affect the other.
 *
 * Reference Behavior:
 * - Variables store references (addresses) to objects in heap memory.
 * - Assigning one reference to another points both to the same object.
 * - Mutating the object through one reference affects all references.
 * - Reassigning a reference can make it point to a different object.
 *
 * Demonstrations in this program:
 * 1. Primitive value copy
 * 2. Reference copy (two variables referencing the same object)
 * 3. Object mutation through shared reference
 * 4. Reference equality check using (==)
 * 5. Object identity demonstration using System.identityHashCode()
 * 6. Reference reassignment to a new object
 * 7. Null reference (removing reference to an object)
 * 8. Object creation without storing reference
 * 9. Two completely separate objects
 * 10. Multiple references pointing to the same object
 *   
Output Example

 ───────────────Primitive Copy───────────────
Primitive values:
a = 10
b = 10
After changing b:
a = 10
b = 20

 ───────────────Reference Copy───────────────
Reference values:
p1 identity: <same number>
p2 identity: <same number>
p1.name = Alice
p2.name = Alice
p1 and p2 share same object: true

 ───────────────Object mutation through shared reference───────────────
After modifying p2.name:
p1.name = Bob
p2.name = Bob

 ───────────────Reference Reassignment───────────────
Before reassignment:
p3 identity: <same number>
p4 identity: <same number>
p3.name = Charlie
p4.name = Charlie
p3 == p4 before reassignment: true

After reassigning p4:
p3 identity: <same number as before>
p4 identity: <different number>
p3 == p4 : false
p3.name = Charlie
p4.name = David

 ───────────────Null Reference───────────────
Eve
p reference after null assignment: null

 ───────────────Object Without Reference───────────────
Creating object without storing reference...
Object created but no reference stored, eligible for GC.

 ───────────────Two Separate Objects───────────────
Two separate objects demonstration:
p5 identity: <different number>
p6 identity: <different number>
p5 == p6 : false

 ───────────────Multiple References───────────────
a1 identity: <same number>
a2 identity: <same number>
a3 identity: <same number>
a1 == a2 : true
a2 == a3 : true
*/
package basics.variables;

public class PrimitiveVsReferenceDemo {
	
	static class Person {
	    String name;

	    Person(String name) {
	        this.name = name;
	    }
	}
	
    public static void main(String[] args) {

    	// 1. Primitive assignment copies the value
        System.out.println("\n ───────────────Primitive Copy───────────────\n");
        int a = 10;
        int b = a; // Value Copy
        System.out.println("Primitive values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20; // modifying b does not affect a (independent copy)

        System.out.println("After changing b:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // 2. Reference copy
        System.out.println("\n ───────────────Reference Copy───────────────\n");
        Person p1 = new Person("Alice");
        // p2 now references the SAME object as p1
        Person p2 = p1; // Reference Copy
        
        System.out.println("Reference values:");
        System.out.println("p1 identity: " + System.identityHashCode(p1));
        System.out.println("p2 identity: " + System.identityHashCode(p2));
        System.out.println("p1.name = " + p1.name);
        System.out.println("p2.name = " + p2.name);
        System.out.println("p1 and p2 share same object: " + (p1 == p2)); // true because both references point to same object
        
        // 3. Mutation through reference
        System.out.println("\n ───────────────Object mutation through shared reference───────────────\n");
        p2.name = "Bob"; // mutating the shared object

        System.out.println("\nAfter modifying p2.name:");
        System.out.println("p1.name = " + p1.name);
        System.out.println("p2.name = " + p2.name);
        
	     // 4. Reference reassignment
        System.out.println("\n ───────────────Reference Reassignment───────────────\n");
	     Person p3 = new Person("Charlie");
	     Person p4 = p3; // both references now point to the SAME object
	
	     System.out.println("Before reassignment:");
	     System.out.println("p3 identity: " + System.identityHashCode(p3));
	     System.out.println("p4 identity: " + System.identityHashCode(p4));
	     System.out.println("p3.name = " + p3.name);
	     System.out.println("p4.name = " + p4.name);
	     System.out.println("p3 == p4 before reassignment: " + (p3 == p4));
	     p4 = new Person("David"); // p4 now points to a NEW object; p3 still points to the old one 
	
	     System.out.println("\nAfter reassigning p4:");
	     System.out.println("p3 identity: " + System.identityHashCode(p3));
	     System.out.println("p4 identity: " + System.identityHashCode(p4));
	     System.out.println("p3 == p4 : " + (p3 == p4));
	     System.out.println("p3.name = " + p3.name);
	     System.out.println("p4.name = " + p4.name);
	     
	     // 5. Null Reference 
        System.out.println("\n ───────────────Null Reference───────────────\n");

	     Person p = new Person("Eve");
	     System.out.println(p.name); 

	     p = null; // reference removed, object becomes eligible for garbage collection

	     System.out.println("p reference after null assignment: " + p);
	     
	     // 6. Object Without Reference
        System.out.println("\n ───────────────Object Without Reference───────────────\n");

        System.out.println("Creating object without storing reference...");
        new Person("Temp"); // object created but no variable holds it
        System.out.println("Object created but no reference stored, eligible for GC.");

	     // 7. Two Separate Objects
        System.out.println("\n ───────────────Two Separate Objects───────────────\n");
	     System.out.println("\nTwo separate objects demonstration:");

	     Person p5 = new Person("Charlie");
	     Person p6 = new Person("David");

	     System.out.println("p5 identity: " +System.identityHashCode(p5));
	     System.out.println("p6 identity: " +System.identityHashCode(p6));
	     System.out.println("p5 == p6 : " + (p5 == p6)); // false
	     
	     // 8. Multiple References 
	     System.out.println("\n ───────────────Multiple References───────────────\n");
	     Person a1 = new Person("Tom");
	     Person a2 = a1;
	     Person a3 = a1;
	     System.out.println("a1 identity: " + System.identityHashCode(a1));
	     System.out.println("a2 identity: " + System.identityHashCode(a2));
	     System.out.println("a3 identity: " + System.identityHashCode(a3));
	     System.out.println("a1 == a2 : " +  (a1 == a2)); // true
	     System.out.println("a2 == a3 : " + (a2 == a3)); // true
    }
}