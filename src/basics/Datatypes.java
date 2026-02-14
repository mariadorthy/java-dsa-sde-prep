// Program - Datatypes 
// Output:
//Range of int:
//Max: 2147483647	Min: -2147483648
//Range of byte:
//Max: 127	Min: -128
//Range of short:
//Max: 32767	Min: -32768
//Range of long:
//Max: 9223372036854775807	Min: -9223372036854775808
//Range of float:
//Max: 3.4028235E38	Min: 1.4E-45
//Range of double:
//Max: 1.7976931348623157E308	Min: 4.9E-324
//Range of char:
//Max: ￿	Min: 
//Age:25
//Year:1997
//DOB:5
//Population:8000000000
//Price:11.1111
//PI:3.14768688
//Differences between int and long: 
//Int: -2147483648	Long: 2147483648
//Difference between float and double (same number 1.23456789):
//Float: 100.12346	Double: 100.123456789
//integral result: 2
//floating result: 2.6
//Default value of instance variable: 0
//Default value of static variable: 0
//Default value of char variable: //  invisible(non-printable symbol) no output comes for this, Because it equals Unicode \u0000
//Default value of boolean variable: false
//Default value of String: null
//Default value of String(After assigning nothing): 
//Grade:A
//Flag:true
//1 2 3 4 5 
//Hello Welcome!!!
	
package basics;
//Primitive Type Families
//Integral (whole numbers) → byte, short, int, long
//Floating point (decimal numbers) → float, double
//Character → char
//Logical → boolean

class Values{
	//Java field → default provided (not for local variables - it should be initialized)
	int x; // this is instance variable
	static int y;
	char ch;
	boolean b;
	String s;
}
public class Datatypes {
	
	public static void range_datatype() {
		System.out.println("Range of int:");
	     System.out.println("Max: "+Integer.MAX_VALUE+"\tMin: "+Integer.MIN_VALUE);
	     System.out.println("Range of byte:");
	     System.out.println("Max: "+Byte.MAX_VALUE+"\tMin: "+Byte.MIN_VALUE);
	     System.out.println("Range of short:");
	     System.out.println("Max: "+Short.MAX_VALUE+"\tMin: "+Short.MIN_VALUE);
	     System.out.println("Range of long:");
	     System.out.println("Max: "+Long.MAX_VALUE+"\tMin: "+Long.MIN_VALUE);
	     // Use int when range is enough, long when numbers exceed.
	     System.out.println("Range of float:");
	     System.out.println("Max: "+Float.MAX_VALUE+"\tMin: "+Float.MIN_VALUE);
	     System.out.println("Range of double:");
	     System.out.println("Max: "+Double.MAX_VALUE+"\tMin: "+Double.MIN_VALUE);
	     System.out.println("Range of char:");
	     System.out.println("Max: "+Character.MAX_VALUE+"\tMin: "+Character.MIN_VALUE);
	}
	public static void primitive_type() {
		 // java 8 - primitive types - byte, short, int, long, float, double, char, boolean
	     byte  age = 25; 
	     short year = 1997;  
	     int dob = 5;  
	     long population = 8000000000L; 
	     System.out.println("Age:"+age);
	     System.out.println("Year:"+year);
	     System.out.println("DOB:"+dob);
	     System.out.println("Population:"+population);
	     float price = 11.1111f;
	     double pi = 3.14768688;
	     System.out.println("Price:"+price);
	     System.out.println("PI:"+pi);
	     int x=Integer.MAX_VALUE;
	     long y=Integer.MAX_VALUE;
	     x+=1;
	     y+=1;
	     System.out.println("Differences between int and long: ");
	     System.out.println("Int: "+x+"\tLong: "+y);
	     float f = 100.123456789f;
	     double d = 100.123456789;
	     System.out.println("Difference between float and double (same number 1.23456789):");
	     System.out.println("Float: "+f+"\tDouble: "+d); //float/double are approximate, not exact.
	     //Datatype identity
	     System.out.println("integral result: "+(5/2));
	     System.out.println("floating result: "+(5.2/2));
	}
	public static void DefaultValues() {
		 Values p =new Values();
	     System.out.println("Default value of instance variable: "+p.x);
	     System.out.println("Default value of static variable: "+p.y);
	     System.out.println("Default value of char variable: "+p.ch);
	     System.out.println("Default value of boolean variable: "+p.b);
	     System.out.println("Default value of String: "+p.s);
	     p.s="";
	     System.out.println("Default value of String(After assigning nothing): "+p.s);
	}
	public static void main(String[] args) {
		range_datatype();
		 primitive_type();
		 DefaultValues();
		 char grade ='A'; //stores numeric code internally
	     System.out.println("Grade:"+grade);
	     boolean flag = true; // can be true or false
	     System.out.println("Flag:"+flag);
	     // Non-primitive - array and string
	     int[] arr={1,2,3,4,5};
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.print(arr[i]+" "); 
	     }
	     String str="\nHello Welcome!!!";
	     System.out.println(str);
	}

}
