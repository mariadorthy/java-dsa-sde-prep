// Program - Variables
// Output:
//----------------Class Level Static Variable in Program----------------
//x: 5
//----------------Local Variable is executed now----------------
//This x is inside LocalVariable Function: 15
//----------------Instance Variable is executed now----------------
//Default Value Printed: 0
//Person 1's age: 25
//Person 2's age: 36
//----------------Static variable is executed now----------------
//Initial value: 0
//After Person.id = 10
//Person.id: 10
//After Person.id = 20
//Person.id: 20
//----------------Final variable is executed now----------------
//Final Variable:4
//----------------Local VS Instance variable is executed now----------------
//Age: 6
//Age in instance variable: 10
//----------------Scope of variable is executed now----------------

package basics;
class Person{
	int age=10; // belongs to each object
	int x;
	static int id;
	public void LocalvsInstanceVariable() {
		int age=6;
		System.out.println("Age: "+age);
		System.out.println("Age in instance variable: "+this.age);
	}
}
public class Variables{
	static int x=5;  // // class-level static variable (Java has no global variables)
	//local variable: declared inside method or block & is accessible only within that scope
	public static void LocalVariable() {
		int x=15; //shadows the class-level variable
		System.out.println("This x is inside LocalVariable Function: "+x);
	}
	//instance variable: each object gets its own copy
	public static void InstanceVariable() {
		Person p1=new Person();
		Person p2=new Person();
		System.out.println("Default Value Printed: "+p1.x); // default value 
		p1.x=25;
		p2.x=36;
		System.out.println("Person 1's age: "+p1.x);
		System.out.println("Person 2's age: "+p2.x);
	}
	//static variable: belongs to class and accessed via class name, one copy shared across objects
	public static void StaticVariable() {
	    System.out.println("Initial value: " + Person.id);

	    Person.id = 10;
	    System.out.println("After Person.id = 10");
	    System.out.println("Person.id: " + Person.id);

	    Person.id = 20;
	    System.out.println("After Person.id = 20");
	    System.out.println("Person.id: " + Person.id);
	}
	//final variable: constant value 
	public static void FinalVariable() {
		final int a=4;
		System.out.println("Final Variable:"+a);
//		a=10; // this shows error that - final variable cannot be assigned 
	}
	public static void ScopeofVariable() {
//		Block of code - Scope of Variable
		{
			int temp=5;
		}
//	 	System.out.println(temp); // shows error
	}

	public static void main(String[] args) {
		System.out.println("----------------Class Level Static Variable in Program----------------");
		System.out.println("x: "+x);
		System.out.println("----------------Local Variable is executed now----------------");
		LocalVariable();
		System.out.println("----------------Instance Variable is executed now----------------");
		InstanceVariable();
		System.out.println("----------------Static variable is executed now----------------");
		StaticVariable();
		System.out.println("----------------Final variable is executed now----------------");
		FinalVariable();
		Person p=new Person();
		System.out.println("----------------Local VS Instance variable is executed now----------------");
		p.LocalvsInstanceVariable();
		System.out.println("----------------Scope of variable is executed now----------------");
		ScopeofVariable();		
	}
}