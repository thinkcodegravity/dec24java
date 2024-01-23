package variableScope;

public class Person { // class block
	// Global variable can be accessed within and outside program
	// HAS-A
	// specific / personal info
	// "instance" variable
	int age=10;
	
	/* rules
	 1) no duplicate variable names in global
	 2) no duplicate local variable name within the same scope
	 3) paramteric and local variables cannot have same name
	 4) global and local variables can have same name (conflict)
	 	local variable takes priority
	 */
	
	// shared info with EVERY Person
	// "class/static" variable
	static String planet="EARTH";
	
	// "parametric" / input variable = a and b
	// RULE : do not store value for paramteric variable
	// value/info is given to by externally
	public int add(int number1, int number2) {// method block
		int number1;
		int age=20;
		System.out.println( number1);
		System.out.println(age); // local variable takes precedence
		System.out.println( this.age ); //
		// "this" points to global instance variables
		System.out.println(planet);
		// "local variable"
		// found inside a curly bracket
		System.out.println( x );// x variable has not been created yet
		int x=0;// declaration - creating variable
		System.out.println( x );
		
		{ // local block
			
			{
				System.out.println(y);
				int y=1;
/*
 	1) identify block of this variable - 30 - 46
 	2) start - line it was declared - 36
 	3) end - line where its block ends - 46
 */
				{ int y=3;
					System.out.println(y);
				}
				System.out.println(y);
			}
			
			int y=2;
			System.out.println(y);
		}
		System.out.println(y);
		return 10;
	}
	
	public int sub(int digit1, int digit2) {
		
		System.out.println( number1 );
		System.out.println( x );
		System.out.println(age);
		System.out.println(planet);
		
		return 5;
	}
	
	
}
