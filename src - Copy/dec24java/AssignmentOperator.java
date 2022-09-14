package dec24java;

public class AssignmentOperator {

	public static void main(String[] args) {
		// int = DATA TYPE ( numbered data type)
		// x = VARIABLE (bcos the value on this keeps changing )
		// 25 = VALUE (Rule: at any given point can have just one)
		
		int x=25;
		
		// RULE : RE-DECLARATIOn not allowed
		int y; // "DECLARE" or announce that y is a variable of data type int
				// y is capable of storing numbered value
		System.out.println(); // print program output
		System.out.println( x ); // on program output window/console print value of x
		y=10; // "INITIALIZAION" : a value has been stored in a variable for the 
			// first time
		y=20; // "ASSIGNMENT/REASSIGNMENT" : a value that has been updated since
				// the initialization
		System.out.println( y ); // on program output window/console print value of x
		
		// RULE : you cannot initialize, assign, change, print a variable 
		// without declaration
		int z=30;
		int aman;
		aman=20;
		
		
		// Rules on assigment operator
		/*
		 	Value of LHS is changed
		 	LHS : Left hand side... int a
		 	RHS : Right hand side... 10;
		 	1) LHS should always be a variable
		 	2) RHS can be a literal value 
		 		or another variable of same type
		 		// replace all RHS variable with its latest value
		 	3) RHS can be method call
		 	4) RHS can also be an expression/operator
		 		// resolve thats expression on it value
		 */
		String name="jon";
		int a=10;
		//int d=name; // LHS is int ... RHS is String
		
	//	20=a; not allowed RHS value
		a=20; 
		int c=a; // LHS is a variable "c" with data type is int...
				 // RHS is a variable "a" with data type int
		// int c=20;
		// if RHS is a variable... replace that with its value
		
		int d=a+c; // ac
		/*
		 1) replace all variable with its latest value on RHS
		 	int d= 20 + 20
		 2) resolve expression on RHS
		 	int d=40
		 */
	}

}
