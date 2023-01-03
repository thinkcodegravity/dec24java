package variables;

public class Rules {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String args[]) {
		
		// variable name formats
		int age; // starts with alphabets
		int dateOfBirth; // starts with alphabets
		int month_of_year; // can contain underscore
		int birth$year; // can contain dollar sign
		int age123; // can contain number.
		int 123age; // variable name CANNOT start with numbers
		int birth place; // NO space allowed in variable names
		int birth#country; // $ _ only special characters allowed
		
		
		// RHS always converts to a value.
		int a=10;// declration and initizliation
		int b; // declaration
		b=10;//initialization
		b=20; // "reassignment" - anytime variable changes its value since the first time
		System.out.println( b );
		
		int c=3;
		a=b; // RHS is variable, replace the RHS variable's value
			 // a=b ... a=2
		a=b+c; // 1) replace all RHS variable with their value
			   // 2) solve the operation
			   // a=b+c .... a=2+3.... a=5	
		c=add(b,c); // 1) replace all variables on the right with their value
				    // 2) give control to method
					// add(b,c) ... add(2,3)
		
		
		// int is data type (numeric data type) 
		// p is variable
		// 100 is numeric value
		// OK : LHS numeric data type = RHS numeric value
		int p=100; 
		// ERROR : LHS numeric data type = RHS String(group of alphabet) values
		int q="john";
		
		
		int w=10; // declared variable with int(numeric) data type first
		w=20;	// initial value 10 for w has been overwritten/changed
		
		y=10; // y variable is NOT declared with data type as above
		
		
		//variables cannot have value before declaration
		//at any point 1 variable can have 1 value
		//values should match the data type
		
		int d=123; // 123 is numeric value.. int is numeric data type
		//int e="john";
		
		// System.out.println = print value of given variable on screen output-console
		System.out.println( a );
		a=20; // reassignment
		System.out.println( a );
		
		// equal sign
		// LHS = RHS
		// variable = value
		// LHS can always be a variable
		// RHS can be value, variable,expression
		int x=50;
		
		int y=x; // RHS variable and LHS variable should have same data type
				// WHEN variable on the RHS = "REPLACE VARIABLE WITH ITS VALUE"
		// int y=50;
		System.out.println( x );
		System.out.println( y );
		
		
		int z=10+20-5; // When RHS is expression = " SOLVE EXPRESSION TO SINGLE VALUE"
		// int z=25;
		System.out.println( z );
		
		//int z=30;
		//String p="john";
		//z=p; // RHS variable data type STRING... LHS variable data type is INT
		
		
		
		
		
		
	}

}
