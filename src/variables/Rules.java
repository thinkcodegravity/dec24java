package variables;

public class Rules {
	public static void main(String args[]) {
		//variables cannot have value before declaration
		//at any point 1 variable can have 1 value
		//values should match the data type
		
		int d=123; // 123 is numeric value.. int is numeric data type
		//int e="john";
		
		int a=10;// declration and initizliation
		// System.out.println = print value of given variable on screen output-console
		System.out.println( a );
		a=20; // reassignment
		System.out.println( a );
		int b; // "declaration" - announcing there is a "b"variable that is capable
				//					of storing numeric value
		b=10; // "initialization" -any variable that had value for the FIRST time
		System.out.println( b );
		b=20; // "reassignment" - anytime variable changes its value since the first time
		System.out.println( b );
		
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
