// Program - Variables
// Output:
//----------------Global Variable in Program----------------
//x: 5
//----------------Local Variable is executed now----------------
//This x is inside LocalVariable Function: 15
//----------------Instance Variable is executed now----------------
//Default Value Printed: 10
//Person 1's age: 25
//Person 2's age: 36
//----------------Static variable is executed now----------------
//Default Value(before assignment): 0
//Person id from p1: 1
//Person id from p2: 1
//----------------Final variable is executed now----------------
//Final Variable:4
//----------------Local VS Instance variable is executed now----------------
//Age: 6
//Age in instance variable: 10
//----------------Scope of variable is executed now----------------

package basics;
class Person{
	int age=10; // this is instance variable 
	static int id;
	public void LocalvsInstanceVariable() {
		int age=6;
		System.out.println("Age: "+age);
		System.out.println("Age in instance variable: "+this.age);
	}
}
public class Variables{
	static int x=5;  // // class-level static variable (Java has no global variables)
	public static void LocalVariable() {
		int x=15; //shadows the class-level variable
		System.out.println("This x is inside LocalVariable Function: "+x);
	}
	public static void InstanceVariable() {
		Person p1=new Person();
		Person p2=new Person();
		System.out.println("Default Value Printed: "+p1.age); // default value 
		p1.age=25;
		p2.age=36;
		System.out.println("Person 1's age: "+p1.age);
		System.out.println("Person 2's age: "+p2.age);
	}
	public static void StaticVariable() {
		Person p1 = new Person();
		Person p2= new Person();
		System.out.println("Default Value(before assignment): " + p1.id); // Default Value 
		p1.id=1;
		System.out.println("Person id from p1: " + p1.id);
		System.out.println("Person id from p2: " + p2.id); // only 1 copy exists
	}
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
		System.out.println("----------------Global Variable in Program----------------");
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