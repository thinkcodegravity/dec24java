package variables;

import java.util.ArrayList;

public class Bank  {
	// Variables / Data = HAS-A
	// vary = various = Something that changes
	
	long abcd;
	long accountNumber=123;
	
	int balance=100;
	double height=5.7;
	double weight=55.67;
	boolean isAccountActive = true;
	boolean didCustomerWithdraw = false;	
	char initial='A';
	
	String name="john";
	ArrayList  a;
	
	
	// DataType  VariableName = Variable Value
	/*
	 	primitive / simple data type
		 	numeric	= byte, short, int ,long 
		 	fractional number = float, double
		 	character = single alphabetic character = char
		 	yes/no = true/false =  boolean
		Complex / object data type 	
	 		group of characters = String
	 	
	 */
	public static void main(String args[]) {
		/*
		int abcd=10;
		// RHS data is stored in LHS variable
		System.out.println( abcd ); // sysout = prints data/value stored in abcd
		abcd=30; // variable can always have 1 value
				// above line OVERWRITES previous 10 value to new 20 value
		System.out.println( abcd );
		*/
		
		int a=10; // value/data in a is : 10
		// RHS is variable = substitue variable with its value
		int b=a; //  int b = 10;
		// RHS is operation = solve that operation
		int c=10+20; // int c=30;
		// RHS combination of variable and value and operations
		int d=a+b+20; 
		// int d=10+b+20;
		// int d=10+10+20;
		// int d=40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("***************");
		double weight; // declaration
		weight=123.1;	// initialization
		weight=120.5;	// reassignment 
		weight=115.5;	// reassignment
		weight=110.5;	// reassignment
		
		
		int age=25; // declaration and initialization 
		
		int x=10;
		int y=20;
		boolean z=true;
		
		
		
		
		
		// x=10 , y=20 , z=true
		System.out.println( x );
		System.out.println( y );
		System.out.println( z );
		
		// x=10 , y=20 , z=true
		y=x; // RHS is variable... so replace value of RHS ... 
		// y=10;
		// x=10 , y=10 , z=true
		
		
		System.out.println( x );
		System.out.println( y );
		System.out.println( z );
		
		// RHS if a variable.. data type should match of LHS
		y=x; // y and x are both int
		y=z; // y is int and z is boolean DONT MATCH
		y="john"; // y is int and RHS alphabetic value DONT MATCH
		
	}
}


