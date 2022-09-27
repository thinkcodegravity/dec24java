package operator;

public class OperatorTest {

	public static void main(String arg[]) {
//"semicolon" statement are lines ending with semicolon 
		int a; // variable declare
		int b=10; // variable initilize
		b=30;// reassign variabel value
		//int sum=add(10,20); // method call
		
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
		//y=add(11,5); // replace returned value from add method
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
		// LHS and RHS can be any data type
		// BUT they have to be same
		// output = boolean
		System.out.println(  10 == 10 ); // true
		System.out.println(  "john" == "jane" ); // false
		System.out.println(  10.1 == 10.1 ); // true
		
		// System.out.println(  10 == "john" );
		
		String regUserid="john";
		String regpass="john1!";
		
		
		String loginUserid="john";
		String loginPwd="john2@";
		
		System.out.println( regUserid == loginUserid ); // true
		System.out.println( regpass == loginPwd ); // false
		
		int regPin=1234;
		int loginPin=2345;
		
		System.out.println( regPin == loginPin ); // false
	
		// not equal !=
		
		System.out.println( 10 != 10 );// false ( is 10 NOT EQUAL to 10) 
		System.out.println( 5.5 != 6.5 );// true ( is 5.5 NOT EQUAL to 6.5)
	
// relational operator : greater than and less than
		// LHS and RHS has to be numeric data type
		// output is boolean
		System.out.println(   10 > 5 ); // true ( 10 greater than 5)
		System.out.println(   2 < 5 ); // true ( 2 less than 5 )
		
		
		int warehouseStock=100;
		int orderQuantity=50;
		System.out.println(  warehouseStock > orderQuantity );
		//System.out.println(  100 > 50 ); // true
		
		int balance=100;
		int withdrawAmount=100;
		System.out.println(  withdrawAmount <= balance); 
		//System.out.println(  100 <= 100 ); // true ( is 100 less than or equal to 100)
// unary operators
		// operates on numeric data type
		 // output is numeric
		int x=-5;
		System.out.println(  -(-x) );// - 5
		//System.out.println(  -(-(-5)) );
		
		
		// increment and decrement = 
		// operate on numeric data type
		// output is numeric
		
		
		int z=10;
		
		z++;// z = 11
		z--;// z=10
		z++;// z=11
		z--;// z=10
		z--; // z=9
		System.out.println( z );
		// pre and post
		// ++z and z++  --z and z--
		// pre = increment or decrement before this line
		// post = increment or decrement after this line
		
		System.out.println("**********");
		
		int p=10;

		System.out.println( p-- ); //  print 10
		// p=9
		
		System.out.println( p++ ); // print  9
		// p=10

		System.out.println( p++ ); //  print 10
		// p=11
		// p=10
		System.out.println( --p ); //  print 10
		
		// ! negate
		// operates on boolean
		// output is boolean
		boolean flag=false;
		System.out.println(   !flag ); // oppostie of false
		// System.out.println(   !false ); // opposite of false
		// System.out.println(   true ); 
		
		
		
// conditional operator = and && .... or ||
		// operates on boolean
			// most often used in combination of other operators
			// that give boolean output
		// output is boolean
		String loginUser="john";
		String loginPw="john2@";
		
		String regUser="john";
		String regPw="john2@";
		
		System.out.println( loginUser==regUser  &&  loginPw==regPw  );
		//System.out.println( "john"=="john"  &&  "john2@"=="john2@"  );
		//System.out.println( true  &&  true  );
		//System.out.println( true  AND  true  );
		// System.out.println( true  );
		
		System.out.println(   12>5 || 10 > 100 );
		//System.out.println(   true || false );
		//System.out.println(   true OR false );
		//System.out.println(   true  );
	}
	
	public int add(int a, int b) {
		return a+b; // return 11+5;  // return 16;
	}
	
}
