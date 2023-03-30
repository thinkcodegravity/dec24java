package operator;

public class OperatorTest {//class block or class body

	public static void main(String arg[]) {
		{ // curly bracket : "Code Block"
		}
	
		// statement ... any code that ends with semicolon
		// variable declaration/initialiation/ressignment
		//	method call
			int a;// delcare
			a=20; // initialize
			a=30; // reassign
			test(a);  // method call
			String name="john";
		// assignmnt ... equal sign
			// RULES 
			// LHS is always variable
			// RHS can be variable or value or expression/operation or method call
			int x=a; // RHS if a variable... it has to be of same data type as LHS
			int y=20;
			int z=10+20;
			int p=getANumber(); // RHS method return/output should match LHS data type
		// arithmetic operator
			//RULES
			// input : numbers
			// output : numbers
			int q=10 + 20; // 30
			q=10-20; // -10
			q=10 * 20; // 200
			q=20 / 10; // 
			q=21 % 10; // modulos : remainder
		// equality operator
			//RULES
			// input : anything (pair of input) but they should be same type
			// output : boolean
				// 10 equal to 20 = false
				// 5 is not equal to 6 = true
				// name john is not equal to name jane = true
			boolean r= ( 10 == 20 ); // Is 10 equal to 20 = false
			System.out.println( r );// false
			
			boolean s= ( 30 == 30 ); // Is 30 equal to 30 = true 
			System.out.println( s );// true
			
			boolean t= ( 30 != 40 ); // Is 30 not equal to 40 = true
			System.out.println( t ); // true
			
			int h=20;
			int i=21;
			boolean u= (h != i);  // boolean u= (20 != 21);
						// is 20 not equal to 21 = true
			System.out.println(u); // true
			
			
			boolean v= ("jane" == "john");
			boolean w= ( 10 == "john"); // cannot compare different types

		// relational operator
			//RULES
			// input : numeric
			// output : boolean
			boolean e=10 > 5 ; // Is 10 greater than 5 = true
			boolean f=10 < 21 ; // Is 10 less than 21 = true
			boolean g=6 > 8 ; // is 6 greater than 8 = false
			boolean aa="john" < "jane" // cannot operate on non-numeric
			
			boolean bb=10 >= 9; //Either 10 is greater or equal to 9 = true
			boolean cc= ( 10 <= 11 );//Either 10 is less or equal to 11 = true
			boolean dd= ( 10 <= 8 );// Either 10 is less or equal to 8 = false
			
			
			
			
			
			
			
			
			
	}
	
	public static int getANumber() {
		return 123;
	}
	public static void test(int x) {
		
	}
	
}
