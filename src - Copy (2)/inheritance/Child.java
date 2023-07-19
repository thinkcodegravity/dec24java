package inheritance;

// Watch if parent program constructor
// has more than 0 inputs
public class Child extends Parent{
	 
	public Child() {
		super("abc");
	}
	
	public void test3() {
		System.out.println("child method");
	}
	int a=10;
	public void test2() {
		System.out.println("child test2 method");
	}
	public void abc() {
		test2(); // child test2 method
		super.test2(); // parent test2 method
		// inherited variable a from grandparent
		// global variable a
		// local variable a
		int a=5;
		System.out.println( a ); // print 5
		System.out.println( this.a );// print 10
		System.out.println( super.a );//print 20
		
	}
	
}
