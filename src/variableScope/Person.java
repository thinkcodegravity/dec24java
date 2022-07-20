package variableScope;

public class Person {
	// global variables ( accessible from ANYWHERE  ) 
	int age=20; // long term (specific to one instance of person)
	static String speices="human"; // long term (shared by every person instance)
	int b=30;
	//int age=30;
	int abc=30;
	// primitive v/s reference = what kind of data we store
	// variable scope = infor life span
	
	public void test4(int x) {
		int aaa=20;
		System.out.println( aaa );
	}
	
	public void test5(int x) {
		// test5 is not aware of aaa variable existence in test4 method
		int aaa=50; 
		System.out.println(aaa);
	}
	
	public void test2() {
		String name="john";
		int age=30;
		System.out.println(  age ); // default prefernce to local... print 30
		System.out.println( this.age );// this operator focus on global variable and program methods
	//	System.out.println( xyz );
	}
	
	
	// (input) parametric variables : short term info
	public void test( int age , int x) {
		System.out.println(name);
		System.out.println( age );
		int xyz=30;
		//int x=30;
		// (temprory) local variable  : short term info
		int c=30;
		int b=40;
		System.out.println(  b );
		System.out.println( age );
		System.out.println( c );
		System.out.println( xyz );
	}
	
	// local variable = point of existence
	// FROM the line it is declared TILL end of its block
	// nested block
	public void test3( int y) { // block 1 .. starts
		System.out.println( x );
		{// block 2 start
			int x=20; // belongs to / inside block 2 
			{// block 3 starts
				{ // block 4 starts
					System.out.println( x );
				}// block 4 ends
			}// block 3 ends
		}// block2 ends
		System.out.println( x );
	}// block1 ... end
	/*
	  Variable category rules
	  1) parametric variable should never be assigned value
	  2) global variables need not be initialized before use ( default value are provided)
	  3) local variables need to be initialized before use ( NO default value are provided)
	  4) variable names can dupliate ( 1 in long term and 1 in short term) 
	  	  Between global and parametric
	  	  Between global and local
	  5)No Duplicates in below category ( not allowed in same category, long vs long info, short vs short info )
	  	  NO duplicate at global level
	  	  NO duplicate at local level
	  	  No duplicate at parametric and local
	  6) when variable conflicts local or paramterci variables
	  	get the preference
	  7) Global variable have global scope
	  		you can access from any part of the current program or outside program
	  8) parametric variable have method scope
	  		from the opening bracket of method till closing bracket of method
	  9) local variable have block scope
	  		from the line it was declared till closing of its block
	  		
	 */
	
	
	
	// 2+3+4
	// 2+3 = 5
	// 5+4 = 9
}
