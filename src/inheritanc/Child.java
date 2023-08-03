package inheritanc;
public class Child extends Parent {
	public Child() {
		super( true ); // super=Parent... Parent()
		System.out.println("Child");
	}
	
	
	int b=20;
	
	public void method2() {
		int b=30;
		// local variable b on line 7
		// global variable b on line 4
		// inherited variable from Parent line 5
		System.out.println( b );
		System.out.println( this.b );
		System.out.println( super.b );
		super.method1();
		
	//	System.out.println("method2");
	}
}
