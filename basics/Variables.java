// Program - Variables
// Output:
// Age:25
// Year:1997
// X:5
// Population:8000000000
// Price:1111.1
// PI:3.14
// Grade:A
// Flag:true
// Addition:31
// Subtraction:-1
// Multiplication:900
// Division:1

public class Variables{
    public static void main(String[] args) {

        
        // -----------------------------
        // 1. Declaration vs Initialization
        // -----------------------------
        int x;          // declaration
        x = 10;         // initialization later
        System.out.println("x = " + x);

        // -----------------------------
        // 2. Initialized later (valid)
        // -----------------------------
        int a;
        a = 5;          // initialized before use
        System.out.println("a = " + a);

        // -----------------------------
        // 3. Uninitialized local variable example
        // NOTE: Uncommenting this code will cause a compile-time error
        // because local variables in Java must be initialized before use.
        // -----------------------------
        /*
        int b;
        System.out.println(b); // compile-time error
        */

        // -----------------------------
        // 4. Fixed version
        // -----------------------------
        int b = 0;
        System.out.println("b = " + b);

        // -----------------------------
        // 5. Declare & Initialize Variables of different Primitive types
        // -----------------------------
        // java 8 - primitive types 
        byte  age = 25; // 8 bits 
        short year = 1997;  // 16 bits 
        int x = 5;  // 32 bits
        long population = 8000000000L; // 64 bits 
        float price = 1111.1f;
        double pi = 3.14;
        char grade ='A';
        boolean flag = true; // can be true or false
        // print their values.
        System.out.println("Age:"+age);
        System.out.println("Year:"+year);
        System.out.println("X:"+x);
        System.out.println("Population:"+population);
        System.out.println("Price:"+price);
        System.out.println("PI:"+pi);
        System.out.println("Grade:"+grade);
        System.out.println("Flag:"+flag);

        // -----------------------------
        // 6. Declare multiple variables of the same type in a single statement and use them in calculations.
        // ----------------------------- 
        int p=18,q=6, r=10;
        System.out.println("Addition:"+(p+q+r));
        System.out.println("Subtraction:"+(p-q));
        System.out.println("Multiplication:"+(p*q*r));
        System.out.println("Division:"+(p/q));
    }

}