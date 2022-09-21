
public class OperatorTest {

	public void test() {
//"semicolon" statement are lines ending with semicolon 
		int a; // variable declare
		int b=10; // variable initilize
		b=30;// reassign variabel value
		int sum=add(10,20); // method call
		
// { = block, defines boundary of program and section inside program
		
// =... assignment operator
		/*
		 	LHS = RHS
		 	1) LHS should always be variable
		 	2) RHS can be literal value, another variable,
		 			expression,method call
		 	3) RHS has to match LHS
		 */
		int w=20;
		//20=int w;
		int y=10;
		y=w; // replace RHS with its value "y=20;"
		y=10+20; // solve the expression. "y=30;"
		y=10+w;// 1) replace value y=10+20 2) solve express "y=30"
		y=add(11,5); // replace returned value from add method
					// "y=16;"
		
		// LHS = ALWAYS VARIABLE
		// RHS = ALWAYS VALUE
		
//Arithemtic operator
		// INPUT : LHS and RHS should be numeric data type
		// OUTPUT : numeric data type
		int d=21;
		int e=10;
		int f= d+e;
		System.out.println( f );// 31
		f=d-e;
		System.out.println( f );// 11
		f=d*e;
		System.out.println( f );// 210
		f=d/e;
		System.out.println( f );// 2
		f=d%e; // modulous / remainder 
		System.out.println( f );// 1
// Equality operator
		
		
		
		
		
	}
	
	public int add(int a, int b) {
		return a+b; // return 11+5;  // return 16;
	}
	
}
